package initializer;

import domain.Aluno;
import domain.Turma;

import java.util.HashSet;
import java.util.Set;

public class TurmaInitializer {

    public static Turma inicializarTurmaJava() {
        Aluno aluno1 = new Aluno("Alexandre Martins");
        Aluno aluno2 = new Aluno("Vitor Hugo Lima");
        Aluno aluno3 = new Aluno("Esther Rodrigues");
        Aluno aluno4 = new Aluno("Lavínia Cunha");
        Aluno aluno5 = new Aluno("Natália Gomes");
        Aluno aluno6 = new Aluno("Yago Ramos");
        Aluno aluno7 = new Aluno("Letícia Cunha");
        Aluno aluno8 = new Aluno("Srta. Ana Júlia Ramos");
        Aluno aluno9 = new Aluno("Pietra Martins");
        Aluno aluno10 = new Aluno("Thomas Peixoto");
        Aluno aluno11 = new Aluno("Thales Farias");

        Set<Aluno> alunosJava = new HashSet<>();

        alunosJava.add(aluno1);
        alunosJava.add(aluno2);
        alunosJava.add(aluno3);
        alunosJava.add(aluno4);
        alunosJava.add(aluno5);
        alunosJava.add(aluno6);
        alunosJava.add(aluno7);
        alunosJava.add(aluno8);
        alunosJava.add(aluno9);
        alunosJava.add(aluno10);
        alunosJava.add(aluno11);

        return new Turma("Java", alunosJava);
    }

    public static Turma inicializarTurmaBancoDados() {
        Aluno aluno12 = new Aluno("Vitor Hugo Lima");
        Aluno aluno13 = new Aluno("Esther Rodrigues");
        Aluno aluno14 = new Aluno("Nathan Nascimento");
        Aluno aluno15 = new Aluno("Lavínia Cunha");
        Aluno aluno16 = new Aluno("Natália Gomes");
        Aluno aluno17 = new Aluno("Dra. Lavínia Lopes");
        Aluno aluno18 = new Aluno("Yago Ramos");
        Aluno aluno19 = new Aluno("Letícia Cunha");
        Aluno aluno20 = new Aluno("Luiz Miguel Azevedo");
        Aluno aluno21 = new Aluno("Srta. Ana Júlia Ramos");
        Aluno aluno22 = new Aluno("Thales Farias");
        Aluno aluno23 = new Aluno("Dra. Alana Porto");

        Set<Aluno> alunosBancoDados = new HashSet<>();

        alunosBancoDados.add(aluno12);
        alunosBancoDados.add(aluno13);
        alunosBancoDados.add(aluno14);
        alunosBancoDados.add(aluno15);
        alunosBancoDados.add(aluno16);
        alunosBancoDados.add(aluno17);
        alunosBancoDados.add(aluno18);
        alunosBancoDados.add(aluno19);
        alunosBancoDados.add(aluno20);
        alunosBancoDados.add(aluno21);
        alunosBancoDados.add(aluno22);
        alunosBancoDados.add(aluno23);

        return new Turma("Banco de Dados", alunosBancoDados);
    }

}
