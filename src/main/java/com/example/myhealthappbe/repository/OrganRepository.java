package com.example.myhealthappbe.repository;

import com.example.myhealthappbe.entity.Organ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganRepository extends JpaRepository<Organ, Long> {

    Organ findByName(String name);

    boolean existsByName(String name);

}
