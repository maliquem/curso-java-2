package streams;

import java.util.Arrays;
import java.util.List;

public class DesafioFilter {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Raissa", 9.8, 'F', 34);
        Aluno a2 = new Aluno("Jael", 6.8, 'M', 32);
        Aluno a3 = new Aluno("Lissa", 8.8, 'F', 4);
        Aluno a4 = new Aluno("Joao", 5.8, 'M', 18);
        Aluno a5 = new Aluno("Luiza", 7.8, 'F', 16);
        Aluno a6 = new Aluno("Matheus", 7.0, 'M', 21);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        alunos.stream().filter(Utilitarios.masculino).filter(Utilitarios.maiorDeIdade).filter(Utilitarios.passouDeAno)
                .map(Utilitarios.imprimirAluno).forEach(Utilitarios.println);

    }

}
