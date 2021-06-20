package com.aspoka.bingo.fields;

import com.aspoka.bingo.fields.domain.FieldsFacade;
import com.aspoka.bingo.fields.domain.dto.FieldDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("field")
@AllArgsConstructor
class FieldsController {

    private final FieldsFacade fieldsFacade;

    @GetMapping(path = "all", produces = MediaType.APPLICATION_JSON_VALUE)
    private ResponseEntity<List<FieldDto>> getAll() {
        return new ResponseEntity<>(
                fieldsFacade.getAll(),
                HttpStatus.OK
        );
    }

    @GetMapping(path = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    private ResponseEntity<FieldDto> getById(@PathVariable Long id) {
        return new ResponseEntity<>(
                fieldsFacade.getById(id),
                HttpStatus.OK
        );
    }

    @GetMapping(path = "random/{amount}", produces = MediaType.APPLICATION_JSON_VALUE)
    private ResponseEntity<List<FieldDto>> getRandomFieldsForAmount(@PathVariable int amount) {
        return new ResponseEntity<>(
                fieldsFacade.getRandomFieldsForAmount(amount),
                HttpStatus.OK
        );
    }

}
