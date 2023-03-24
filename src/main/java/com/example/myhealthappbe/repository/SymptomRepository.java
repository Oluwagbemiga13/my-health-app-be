package com.example.myhealthappbe.repository;

import com.example.myhealthappbe.sympthoms.Symptom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SymptomRepository extends JpaRepository<Symptom, Long> {

    public Symptom findById(long id);

}
