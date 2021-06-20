package com.aspoka.bingo.fields.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

interface FieldsRepository extends JpaRepository<FieldEntity, Long> {

    @Query(nativeQuery = true, value="SELECT * FROM bingo.fields_templates ORDER BY random() LIMIT :amount")
    List<FieldEntity> getRandomFieldsForAmount(@Param("amount") int amount);

    FieldEntity getById(Long id);

}
