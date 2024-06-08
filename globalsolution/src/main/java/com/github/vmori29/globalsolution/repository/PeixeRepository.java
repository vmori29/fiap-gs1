package com.github.vmori29.globalsolution.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.vmori29.globalsolution.model.Peixe;



@Repository
public interface PeixeRepository extends JpaRepository<Peixe, Long> {

}