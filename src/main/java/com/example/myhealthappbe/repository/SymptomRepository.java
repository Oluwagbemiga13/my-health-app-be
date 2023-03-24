package com.example.myhealthappbe.repository;

import com.example.myhealthappbe.sympthoms.Symptom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SymptomRepository extends JpaRepository<Symptom, Long> {

    public Symptom findById(long id);

    @Query(value = "SELECT * FROM item_table i WHERE i.sold = FALSE",
            nativeQuery = true)
    List<Symptom> symptoms();

}
