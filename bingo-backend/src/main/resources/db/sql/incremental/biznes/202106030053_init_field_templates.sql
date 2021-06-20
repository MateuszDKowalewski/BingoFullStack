--liquibase formatted sql
--changeset mkowalewski:202106030053_init_field_templates.sql

CREATE TABLE bingo.fields_templates (
    id bigint NOT NULL,
    content VARCHAR(255) NOT NULL
);

CREATE SEQUENCE bingo.fields_templates_s INCREMENT 1 START 1;

INSERT INTO bingo.fields_templates (id, content) VALUES
((SELECT nextval('bingo.fields_templates_s')), 'Lert krzyczy na Keepera'),
((SELECT nextval('bingo.fields_templates_s')), 'Dano coś odpierdala'),
((SELECT nextval('bingo.fields_templates_s')), 'Frozen zasypia w trakcie rozmowy'),
((SELECT nextval('bingo.fields_templates_s')), 'Stary przebija'),
((SELECT nextval('bingo.fields_templates_s')), 'Ktoś zacznie spamić hentaiami'),
((SELECT nextval('bingo.fields_templates_s')), 'Napierdalanie na Dominika'),
((SELECT nextval('bingo.fields_templates_s')), 'Dark zerwało internet'),
((SELECT nextval('bingo.fields_templates_s')), 'Cebula czyta paste'),
((SELECT nextval('bingo.fields_templates_s')), 'Jinx psycha siada'),
((SELECT nextval('bingo.fields_templates_s')), 'Ktoś obraża Grabkę'),
((SELECT nextval('bingo.fields_templates_s')), 'Alga streamuje Photoshopa'),
((SELECT nextval('bingo.fields_templates_s')), 'Lert kogoś obraża'),
((SELECT nextval('bingo.fields_templates_s')), 'Jinx wyżywa się na nieletnich'),
((SELECT nextval('bingo.fields_templates_s')), 'Ktoś poszeł wysrać psa'),
((SELECT nextval('bingo.fields_templates_s')), 'Dano wyjebano z serwera'),
((SELECT nextval('bingo.fields_templates_s')), 'Mercury powie zw. a wróci po 3 godzinach'),
((SELECT nextval('bingo.fields_templates_s')), 'Supreme i zuzu gadają o programowaniu'),
((SELECT nextval('bingo.fields_templates_s')), 'Randomowy stream ze spaceru'),
((SELECT nextval('bingo.fields_templates_s')), 'Jinx jest najebany'),
((SELECT nextval('bingo.fields_templates_s')), 'Panda woła żone'),
((SELECT nextval('bingo.fields_templates_s')), 'Daya przychodz posłuchać'),
((SELECT nextval('bingo.fields_templates_s')), 'Fafnir jest pierwszy na głosowym'),
((SELECT nextval('bingo.fields_templates_s')), 'Dark nażeka na życie'),
((SELECT nextval('bingo.fields_templates_s')), 'Chuj kurwa statek z piratami'),
((SELECT nextval('bingo.fields_templates_s')), 'Meme spam'),
((SELECT nextval('bingo.fields_templates_s')), 'Owo spam'),
((SELECT nextval('bingo.fields_templates_s')), 'Dzieci/zwierzęta zostają wydziedziczone'),
((SELECT nextval('bingo.fields_templates_s')), 'Panda robi randomowego streama z gry'),
((SELECT nextval('bingo.fields_templates_s')), 'Jest ponad 10 osób na głosowym'),
((SELECT nextval('bingo.fields_templates_s')), 'Foafnir jest horny'),
((SELECT nextval('bingo.fields_templates_s')), 'Dano został nakarmiony'),
((SELECT nextval('bingo.fields_templates_s')), 'Płyn został nakarmiony'),
((SELECT nextval('bingo.fields_templates_s')), 'Fafnir się jara vtuberkami'),
((SELECT nextval('bingo.fields_templates_s')), 'Frozen ma dobre jedzonko');
