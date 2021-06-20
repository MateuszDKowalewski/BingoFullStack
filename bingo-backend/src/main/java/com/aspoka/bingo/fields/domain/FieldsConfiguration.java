package com.aspoka.bingo.fields.domain;

import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class FieldsConfiguration {

    @Bean
    public FieldsFacade fieldsFacade(FieldsRepository fieldsRepository) {
        FieldMapper fieldMapper = Mappers.getMapper(FieldMapper.class);
        SearchFieldsUseCase searchFieldsUseCase = new SearchFieldsUseCase(
                fieldsRepository,
                fieldMapper
        );
        return new FieldsFacade(searchFieldsUseCase);
    }

}
