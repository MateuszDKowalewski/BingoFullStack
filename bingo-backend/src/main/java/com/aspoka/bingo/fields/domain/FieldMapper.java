package com.aspoka.bingo.fields.domain;


import com.aspoka.bingo.fields.domain.dto.FieldDto;
import org.mapstruct.Mapper;

@Mapper
abstract class FieldMapper {

    public abstract FieldDto toDto(FieldEntity entity);

}
