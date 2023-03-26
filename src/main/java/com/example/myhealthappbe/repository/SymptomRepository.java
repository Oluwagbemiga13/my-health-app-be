package com.example.myhealthappbe.repository;

import com.example.myhealthappbe.entity.Symptom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SymptomRepository extends JpaRepository<Symptom, Long> {

    public Symptom findById(long id);

//    @Query(value = "SELECT * FROM item_table i WHERE i.sold = FALSE",
//            nativeQuery = true)
//    List<Symptom> symptoms();

//    @Query("SELECT s FROM Symptom s JOIN s.systems sys WHERE s.name = :name AND sys.name = :systemName")
//    List<Optional<Symptom>> findSymptomsByNameAndSystem(@Param("name") String name, @Param("name") String systemName);

}
