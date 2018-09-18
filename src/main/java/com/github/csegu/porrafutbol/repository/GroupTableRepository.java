package com.github.csegu.porrafutbol.repository;

import com.github.csegu.porrafutbol.model.GroupTable;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface GroupTableRepository extends JpaRepository<GroupTable, Long>  {

}
