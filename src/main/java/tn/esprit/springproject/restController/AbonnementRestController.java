package tn.esprit.springproject.restController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.Abonnement;
import tn.esprit.springproject.service.IAbonnement;

import java.util.List;

@AllArgsConstructor
@RestController
public class AbonnementRestController {


    private IAbonnement iAbonnement;



    @PostMapping("/addAb")
    public Abonnement addAb(@RequestBody Abonnement ab){

        return iAbonnement.addAbonnement(ab);

    }

    @PutMapping("/updateAb")
    public Abonnement updateAb(@RequestBody Abonnement ab){

        return iAbonnement.updateAbonnement(ab);

    }

    @GetMapping("/getAllAb")

    public List<Abonnement> getAllAbonnement(){
        return iAbonnement.getAllAbonnement();
    }


    @GetMapping("/getAbById/{numAb}")

    public Abonnement getAbById(@PathVariable Long numAb){
        return iAbonnement.getAbById(numAb);
    }


    @DeleteMapping("/deleteAb/{numAb}")
    public void deleteAb(@PathVariable Long numAb){
        iAbonnement.deleteAbonnement(numAb);
    }
}
