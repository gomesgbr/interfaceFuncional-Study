import java.util.Arrays;
import java.util.List;

import services.AlunoServices;
import entities.Aluno;

public class App {
    public static void main(String[] args) throws Exception {
        
        Aluno aluno1 = new Aluno("Gabriel", 6.0, true);
        Aluno aluno2 = new Aluno("Matheus", 5.9, true);
        Aluno aluno3 = new Aluno("Vitoria", 9.0, false);
        Aluno aluno4 = new Aluno("Samantha", 3.6, false);
        Aluno aluno5 = new Aluno("Julia", 10, true);

        List<Aluno> alunos = Arrays.asList(aluno1,aluno2, aluno3, aluno4, aluno5);

        System.out.println(AlunoServices.getAprovados(alunos, x -> x.getMedia() >= 6));

        AlunoServices.paraCadaAluno(alunos, p-> p.setMedia(p.getMedia() + 2));
        
        
        AlunoServices.paraCadaAluno(AlunoServices.getAprovados(alunos, x -> x.getMedia() >= 6), System.out::println);       
        
        alunos.stream().filter(x -> x.getMedia() >= 6).forEach(System.out::println);

        //alunos.stream().filter(x -> x.getMedia() >= 6).map(Aluno::getNome).sorted(String::compareTo).forEach(System.out::println);

        /*
         * filter recebe um Predicate
         * forEach recebe um Consumer
         * Map recebe um Function
         * sorted recebe um Comparator
         */
        
        
    }
}
