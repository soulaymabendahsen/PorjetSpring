package tn.esprit.springproject.restController;

import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.Abonnement;
import tn.esprit.springproject.entities.TypeAbonnement;
import tn.esprit.springproject.service.IAbonnement;

import java.time.LocalDate;
import java.util.Date;
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



    @GetMapping("/getListAbonnementsByTypeAbon")
    public List<Abonnement> geAbonnementsByTypeAbon(@RequestBody TypeAbonnement typeAbonnement){
        return iAbonnement.listeAbonnements(typeAbonnement);
    }

 @GetMapping("retrieveAbonnementsByDateDebut/{date1}/{date2}")

    public List<Abonnement> retrieveAbonnementsByDateDebut(@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date1, @PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)  LocalDate date2){
        return iAbonnement.retrieveAbonnementsByDateDebut(date1,date2);
    }
}
