
package com.klef.soa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.soa.entity.CodingCompetition;
import com.klef.soa.repository.CodingCompetitionRepository;

@Service
public class CodingCompetitionServiceImpl
        implements CodingCompetitionService {

    @Autowired
    private CodingCompetitionRepository repository;

    @Override
    public CodingCompetition addCompetition(CodingCompetition competition) {
        return repository.save(competition);
    }

    @Override
    public List<CodingCompetition> displayAll() {
        return repository.findAll();
    }

    

    @Override
    public String deleteCompetition(Long id) {
        if (!repository.existsById(id)) {
            return "Competition not found";
        }

        repository.deleteById(id);
        return "Competition deleted successfully";
    }
}
