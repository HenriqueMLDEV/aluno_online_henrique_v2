package com.alunoonline.api.model.dataTransferObject;

import lombok.Data;

@Data
public class DisciplinaAlunoDto {
    private String nomeDisciplina;
    private String professorDisciplina;
    private Double nota1;
    private Double nota2;
    private Double media;
    private String status;
}