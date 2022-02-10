package domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Data
@AllArgsConstructor
public class Turma {

    private String nomeTurma;
    private Set<Aluno> alunos;

}
