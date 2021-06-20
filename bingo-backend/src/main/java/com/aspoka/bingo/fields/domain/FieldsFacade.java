package com.aspoka.bingo.fields.domain;

import com.aspoka.bingo.fields.domain.dto.FieldDto;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class FieldsFacade {

    private final SearchFieldsUseCase searchFieldsUseCase;

    public List<FieldDto> getAll() {
        return searchFieldsUseCase.getAll();
    }

    public FieldDto getById(Long id) {
        return searchFieldsUseCase.getById(id);
    }

    public List<FieldDto> getRandomFieldsForAmount(int amount) {
        return searchFieldsUseCase.getRandomFieldsForAmount(amount);
    }
}
