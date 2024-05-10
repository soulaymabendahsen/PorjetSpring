package tn.esprit.springproject.restController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.Piste;
import tn.esprit.springproject.service.IPiste;

import java.util.List;

@AllArgsConstructor
@RestController
public class PisteRestController {


    private IPiste iPiste;



    @PostMapping("/addPiste")
    public Piste addPiste(@RequestBody Piste pis){

        return iPiste.addPiste(pis);

    }

    @PutMapping("/updatePiste")
    public Piste updatePiste(@RequestBody Piste pis){

        return iPiste.updatePiste(pis);

    }

    @GetMapping("/getAllPistes")

    public List<Piste> getAllPiste(){
        return iPiste.getAllPiste();
    }


    @GetMapping("/getPisteById/{numPiste}")

    public Piste getPisteById(@PathVariable Long numPiste){
        return iPiste.getPisteById(numPiste);
    }


    @DeleteMapping("/deletePiste/{numPiste}")
    public void deletePiste(@PathVariable Long numPiste){
        iPiste.deletePiste(numPiste);
    }
}
