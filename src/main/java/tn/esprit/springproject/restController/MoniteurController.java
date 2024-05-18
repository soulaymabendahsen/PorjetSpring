package tn.esprit.springproject.restController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.Moniteur;
import tn.esprit.springproject.service.IMoniteur;

import java.util.List;

@AllArgsConstructor
@RestController
public class MoniteurController {


    private IMoniteur iMoniteur;


    @PostMapping("/addMon")
    public Moniteur addMon(@RequestBody Moniteur mon) {

        return iMoniteur.addMoniteur(mon);

    }

    @PutMapping("/updateMon")
    public Moniteur updateMon(@RequestBody Moniteur mon) {

        return iMoniteur.updateMoniteur(mon);

    }

    @GetMapping("/getAllMon")

    public List<Moniteur> getAllMoniteur() {
        return iMoniteur.getAllMoniteur();
    }


    @GetMapping("/getMonById/{numMon}")

    public Moniteur getMonById(@PathVariable Long numMon) {
        return iMoniteur.getMoniteurById(numMon);
    }


    @DeleteMapping("/deleteMon/{numMon}")
    public void deleteMon(@PathVariable Long numMon) {
        iMoniteur.deleteMoniteur(numMon);
    }


    @PostMapping("/addMoniteurAndAssignToCours/{numC}")
    public Moniteur addMoniteurAndAssignToCours(@RequestBody Moniteur moniteur,@PathVariable Long numC) {
        return iMoniteur.addMoniteurAndAssignToCours(moniteur,numC);
    }
}
