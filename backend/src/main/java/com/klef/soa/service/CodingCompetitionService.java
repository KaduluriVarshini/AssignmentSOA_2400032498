
package com.klef.soa.service;

import java.util.List;
import com.klef.soa.entity.CodingCompetition;

public interface CodingCompetitionService {

    CodingCompetition addCompetition(CodingCompetition competition);

    List<CodingCompetition> displayAll();

    
    String deleteCompetition(Long id);
}
