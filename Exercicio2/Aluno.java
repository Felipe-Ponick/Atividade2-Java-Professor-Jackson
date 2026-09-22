package Exercicio2;

public class Aluno {
        String nomeAluno;
        int idadeAluno;
        double notaAluno;
        double notaAluno2;
        double media;


        public Aluno(String nome, int idade, double nota1, double nota2){
            this.nomeAluno = nome;
            this.idadeAluno = idade;
            this.notaAluno = nota1;
            this.notaAluno2 = nota2;
        }
        public void calcularMedia(double nota1, double nota2){
            this.media = (nota1 + nota2) / 2;
        }

        public void situacaoAluno(){
            System.out.println("Nome do Aluno: " + nomeAluno);
            System.out.println("A média do aluno é: " + media);
            if(media >= 7){
                System.out.println("Situação do Aluno: Aprovado");
            }else{
                System.out.println("Situação do Aluno: Reprovado");
            }

        }


}
