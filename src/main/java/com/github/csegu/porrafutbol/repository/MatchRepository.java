package com.github.csegu.porrafutbol.repository;

import com.github.csegu.porrafutbol.model.Match;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface MatchRepository extends JpaRepository<Match, Long>  {

}
