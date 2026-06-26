-- V2: Migrations para adicionar a coluna de RANK na tabela de ninja

ALTER TABLE ninja
ADD COLUMN rank VARCHAR(255);