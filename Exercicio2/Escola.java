package Exercicio2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Exercicio1.Produto;

public class Escola {
    static ArrayList<Aluno> alunos = new ArrayList<>();//Cria uma lista/vetor para guardar os números

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        do
        {
            System.out.println("============================================");
            System.out.println("--------------Menu de escolhas--------------");
            System.out.println("============================================"); 
            System.out.println("-------Escolha uma das opções abaixo:-------"); 
            System.out.println("Opção 1: Cadastrar Aluno."); 
            System.out.println("Opção 2: Remover produto."); 
            System.out.println("Opção 3: Adicionar produtos."); 
            System.out.println("Opção 4: Listar produto."); 
            System.out.println("Opção 5: Encerrar"); 
            System.out.println("============================================");

            try
            {
                opcao = entrada.nextInt();
            }
            catch (InputMismatchException e)
            {
                System.out.println("Opção inválida! Digite um número de 1 a 5.");
                entrada.next();
                opcao = 0;
                continue;
            }
            
            switch (opcao) 
            {
                case 1 :
                    System.out.println("Nome:");
                    String nome = entrada.next();
                    System.out.println("Idade:");
                    int idade = entrada.nextInt();
                    System.out.println("1ª Nota:");
                    double nota1 = entrada.nextDouble();
                    System.out.println("2ª Nota:");
                    double nota2 = entrada.nextDouble();

                    Aluno Aluno = new Aluno(
                        nome,
                        idade,
                        nota1,
                        nota2
                    );

                    alunos.add(Aluno);
                    break;

                case 2: 
                    System.out.println("Alunos Cadastrados!");
                    
                    if(alunos.isEmpty()){
                        System.out.print("Nenhum aluno cadastrado");
                    }else{
                        for(Aluno p : alunos){
                            p.situacaoAluno();
                        }
                    }   
                    System.out.println("Alunos aprovados: " + qtdAprovados());

                
                        case 3:
                        break;
            }
        }
        while(opcao != 3);
        {
            System.out.println("Programa encerrado.");
        }
    }
    public static int qtdAprovados() {
        int aprovado = 0;
        for(Aluno aluno : alunos) {
            if (aluno.media >= 7) {
                aprovado++;
            }
        }
        return aprovado;
    }

    public static double maiorNotaTurma(){
        double maiorNota1 = 0;
        double maiorNota2 = 0;
        for(Aluno aluno : alunos){
            if(aluno.notaAluno > maiorNota1){
                maiorNota1 = aluno.notaAluno;
            }else if(aluno.notaAluno2 > maiorNota2){
                maiorNota2 = aluno.notaAluno2;
            }
        }

        double maiorNotaGeral;
        if(maiorNota1 > maiorNota2){
            System.out.println("A maior nota da turma é " +maiorNota1);
            maiorNotaGeral = maiorNota1;

        }else{
            System.out.println("A maior nota da turma é " +maiorNota2);
            maiorNotaGeral = maiorNota2;
        }
        return maiorNotaGeral;
    }
}
