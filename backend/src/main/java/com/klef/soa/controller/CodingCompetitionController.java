
package com.klef.soa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.soa.entity.CodingCompetition;
import com.klef.soa.repository.CodingCompetitionRepository;

@RestController
@RequestMapping("/competitions")
@CrossOrigin
public class CodingCompetitionController {

    @Autowired
    private CodingCompetitionRepository repository;
    
    @GetMapping("/")
    public String Home()
    {
    	return "CrudService is running";
    }

    
    @PostMapping("/add")
    public CodingCompetition addCompetition(
            @RequestBody CodingCompetition competition) {
        return repository.save(competition);
    }

    
    @GetMapping("/displayall")
    public List<CodingCompetition> displayAll() {
        return repository.findAll();
    }

   
  
    
    @DeleteMapping("/delete/{id}")
    public String deleteCompetition(@PathVariable Long id) {

        if (!repository.existsById(id)) {
            return "Competition not found";
        }

        repository.deleteById(id);
        return "Competition deleted successfully";
    }
}
