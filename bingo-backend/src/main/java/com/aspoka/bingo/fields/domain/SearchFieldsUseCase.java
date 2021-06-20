package com.aspoka.bingo.fields.domain;

import com.aspoka.bingo.fields.domain.dto.FieldDto;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
class SearchFieldsUseCase {

    private final FieldsRepository fieldsRepository;
    private final FieldMapper fieldMapper;

    public List<FieldDto> getAll() {
        return fieldsRepository.findAll()
                .stream()
                .map(fieldMapper::toDto)
                .collect(Collectors.toList());
    }

    public FieldDto getById(Long id) {
        return fieldMapper.toDto(fieldsRepository.getById(id));
    }

    public List<FieldDto> getRandomFieldsForAmount(int amount) {
        return fieldsRepository.getRandomFieldsForAmount(amount)
                .stream()
                .map(fieldMapper::toDto)
                .collect(Collectors.toList());
    }
}
