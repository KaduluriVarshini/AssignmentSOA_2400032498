package com.klef.soa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klef.soa.entity.CodingCompetition;

@Repository
public interface CodingCompetitionRepository
        extends JpaRepository<CodingCompetition, Long> {
}