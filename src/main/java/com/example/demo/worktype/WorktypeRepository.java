package com.example.demo.worktype;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorktypeRepository extends JpaRepository<Worktype, Long> {

}
