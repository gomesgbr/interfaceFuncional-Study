## Interfaces Funcionais Java

Neste repositorio foi feito testes com interfaces funcionais afim de entender o seu funcionamento, por exemplo:

Foi criado no arquivo "AlunoServices.java" dois metodos do tipo static recebendo interfaces funcionais como parametro, sendo que o metodo getAprovados recebe a interface Predicate, e o metodo paraCadaAluno recebe um Consumer, assim o primeiro metodo simula o "filter" e o segundo metodo simula o "forEach".
```
public static List<Aluno> getAprovados(List<Aluno> list, Predicate<Aluno> criterio)
```

```
public static void paraCadaAluno(List<Aluno> list, Consumer<Aluno> criterio)
```

Foi feito o teste dos metodos com uma lista do tipo Aluno:

```
System.out.println(AlunoServices.getAprovados(alunos, x -> x.getMedia() >= 6));
```

```
AlunoServices.paraCadaAluno(alunos, p-> p.setMedia(p.getMedia() + 2));       
        
AlunoServices.paraCadaAluno(AlunoServices.getAprovados(alunos, x -> x.getMedia() >= 6), System.out::println); 
```
Após isso foi usado os metodos da classe Stream para demonstrar que os metodos da classe AlunoServices retornam o mesmo resultado.

```
alunos.stream().filter(x -> x.getMedia() >= 6).forEach(System.out::println);
```