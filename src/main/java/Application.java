import domain.Turma;
import initializer.TurmaInitializer;
import lombok.extern.slf4j.Slf4j;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class Application {

    public static void main(String[] args) {

        Turma turmaJava = TurmaInitializer.inicializarTurmaJava();
        Turma turmaBancoDados = TurmaInitializer.inicializarTurmaBancoDados();

        List<Turma> listaTurmas = new ArrayList<>(Arrays.asList(turmaJava, turmaBancoDados));

        imprimirTodasTurmas(listaTurmas);
        imprimirTurmaIsolada(turmaJava);
        imprimirTurmaIsolada(turmaBancoDados);
        imprimirTodosOsAlunos(listaTurmas);

    }

    private static void imprimirTodosOsAlunos(List<Turma> listaTurmas) {
        log.info("Imprimindo todos os alunos no arquivo alunosMatriculados.txt");
        List<String> alunosMatriculados = new ArrayList<>();

        listaTurmas.forEach(turma -> {
            turma.getAlunos().forEach(aluno -> {
                alunosMatriculados.add(aluno.getNome());
            });
        });

        List<String> alunosMatriculadosDistintos = alunosMatriculados.stream().distinct().sorted().collect(Collectors.toList());

        String path = "docs/arquivos/alunosMatriculados.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write("Alunos matriculados em todas as turmas");
            writer.newLine();
            writer.write("Quantidade total de alunos: " + alunosMatriculadosDistintos.size());
            writer.newLine();
            writer.write("--------------");
            writer.newLine();
            alunosMatriculadosDistintos.forEach(aluno -> {
                try {
                    writer.write(aluno);
                    writer.newLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            log.info("Arquivo criado! Foram inseridos " + alunosMatriculadosDistintos.size() + " alunos.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void imprimirTurmaIsolada(Turma turma) {
        log.info("Imprimindo todos os alunos no arquivo " + turma.getNomeTurma().replaceAll("\\s+", "") + ".txt");
        String path = "docs/arquivos/turma" + turma.getNomeTurma().replaceAll("\\s+", "") + ".txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write("Turma: " + turma.getNomeTurma());
            writer.newLine();
            writer.write("Quantidade de alunos: " + turma.getAlunos().size());
            writer.newLine();
            writer.write("--------------");
            writer.newLine();
            writer.write("Alunos matriculados:");
            writer.newLine();
            turma.getAlunos().forEach(aluno -> {
                try {
                    writer.write(aluno.getNome());
                    writer.newLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            log.info("Arquivo criado! Foram inseridos " + turma.getAlunos().size() + " alunos.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void imprimirTodasTurmas(List<Turma> listaTurmas) {
        log.info("Imprimindo todos os alunos no arquivo alunosMatriculados.txt");
        String path = "docs/arquivos/turmas.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            listaTurmas.forEach(turma -> {
                try {
                    writer.write("Turma: " + turma.getNomeTurma());
                    writer.newLine();
                    writer.write("Quantidade de alunos: " + turma.getAlunos().size());
                    writer.newLine();
                    writer.write("--------------");
                    writer.newLine();
                    writer.write("Alunos matriculados:");
                    writer.newLine();
                    turma.getAlunos().forEach(aluno -> {
                        try {
                            writer.write(aluno.getNome());
                            writer.newLine();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
                    writer.newLine();
                    writer.newLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            log.info("Arquivo criado! Foram inseridas " + listaTurmas.size() + " turmas.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
