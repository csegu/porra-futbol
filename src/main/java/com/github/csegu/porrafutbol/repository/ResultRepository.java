package com.github.csegu.porrafutbol.repository;

import com.github.csegu.porrafutbol.model.Score;
import java.util.Optional;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface ResultRepository extends JpaRepository<Score, Long>  {

}
