package com.aspoka.bingo.fields.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "fields_templates")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class FieldEntity {

    @Id
    @SequenceGenerator(name = "fields_templates_s", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fields_templates_s")
    private Long id;

    private String content;

}
