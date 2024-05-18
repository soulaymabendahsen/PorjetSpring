package tn.esprit.springproject.restController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.SKieur;
import tn.esprit.springproject.service.ISkieur;

import java.util.List;

//bech nassnaa hajet l service
@AllArgsConstructor
@RestController
public class SkieurRestController {

    private ISkieur iSkieur;


@PostMapping("/addSk")
    public SKieur addSk(@RequestBody SKieur sk){

        return iSkieur.addSkieur(sk);

    }

@PutMapping("/updateSk")
    public SKieur updateSk(@RequestBody SKieur sk){

        return iSkieur.updateSkieur(sk);

    }

@GetMapping("/getAllSk")

    public List<SKieur> getAllSkieur(){
    return iSkieur.getAllSkieur();
    }


    @GetMapping("/getSkById/{numSk}")

    public SKieur getSkById(@PathVariable Long numSk){
        return iSkieur.getSkById(numSk);
    }
    @GetMapping("/getSkByNom/{nom}")
    public SKieur getSkByNom(@PathVariable String nom){
        return iSkieur.getSkByNom(nom);
    }

@DeleteMapping("/deleteSk/{numSk}")
    public void deleteSk(@PathVariable Long numSk){
       iSkieur.deleteSkieur(numSk);
    }


    @PostMapping("/assignSkieurToPiste/{numSk}/{numPiste}")

    public SKieur assignSkieurToPiste(@PathVariable  Long numSk,@PathVariable Long numPiste) {
            return iSkieur.assignSkieurToPiste(numSk,numPiste);
    }

}

