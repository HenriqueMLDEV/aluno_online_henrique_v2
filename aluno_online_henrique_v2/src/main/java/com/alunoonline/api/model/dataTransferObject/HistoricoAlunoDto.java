package com.alunoonline.api.model.dataTransferObject;

import lombok.Data;

import java.util.List;

@Data
public class HistoricoAlunoDto {

    private String nomeAluno;
    private String cursoAluno;
    private List<DisciplinaAlunoDto> disciplinasAlunoList;
}