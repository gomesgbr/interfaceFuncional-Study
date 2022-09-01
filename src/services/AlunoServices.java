package services;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import entities.Aluno;

public class AlunoServices {
    
    public static List<Aluno> getAprovados(List<Aluno> list, Predicate<Aluno> criterio){
        List<Aluno> aprovados = new ArrayList<>();

        for(Aluno x: list){
            if(criterio.test(x)){
                aprovados.add(x);
            }
        }
        return aprovados;
    }

    public static void paraCadaAluno(List<Aluno> list, Consumer<Aluno> criterio){
        
        for(Aluno x: list){
            criterio.accept(x);
        }
    }
}
