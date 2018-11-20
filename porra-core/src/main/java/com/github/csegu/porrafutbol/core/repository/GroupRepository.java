package com.github.csegu.porrafutbol.core.repository;

import com.github.csegu.porrafutbol.core.model.Group;
import java.util.Optional;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long>  {

}
