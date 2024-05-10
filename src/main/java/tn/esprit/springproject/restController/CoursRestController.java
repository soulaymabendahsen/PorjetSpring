package tn.esprit.springproject.restController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.Cours;
import tn.esprit.springproject.service.ICours;

import java.util.List;

@AllArgsConstructor
@RestController
public class CoursRestController {


    private ICours iCours;


    @PostMapping("/addCr")
    public Cours addCours(@RequestBody Cours cr){

        return iCours.addCours(cr);

    }

    @PutMapping("/updateCr")
    public Cours updateCours(@RequestBody Cours cr){

        return iCours.updateCours(cr);

    }

    @GetMapping("/getAllCr")

    public List<Cours> getAllCours(){
        return iCours.getAllCours();
    }


    @GetMapping("/getCrById/{numCr}")

    public Cours getCoursById(@PathVariable Long numCr){
        return iCours.getcrById(numCr);
    }


    @DeleteMapping("/deleteCr/{numCr}")
    public void deleteCours(@PathVariable Long numCr){
        iCours.deleteCours(numCr);
    }
}
