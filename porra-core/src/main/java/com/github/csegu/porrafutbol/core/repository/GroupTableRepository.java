package com.github.csegu.porrafutbol.core.repository;

import com.github.csegu.porrafutbol.core.model.GroupTable;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface GroupTableRepository extends JpaRepository<GroupTable, Long>  {

}
