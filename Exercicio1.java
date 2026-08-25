import java.lang.reflect.Array;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio1 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tamVetor = 0;
        while (true) {
            try {
                System.out.println("Informe o número de alunos: ");
                tamVetor = entrada.nextInt();
                if (tamVetor <= 0) {
                    System.out.println("O número de alunos deve ser maior que zero.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido! Digite um número inteiro.");
                entrada.next();
            }
        }

        double[] inteiros = new double[tamVetor];
        double media = 0;
        double maiorNota = 0;
        double menorNota = 0;
        int aprovados = 0;
        int reprovados = 0;
        

        for(int i = 0; i < tamVetor; i++){
            try {
                System.out.println("Qual a nota do " +  (i + 1) + "º aluno:");
                inteiros[i] = entrada.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Nota inválida! Digite um número (ex: 7 ou 7,5).");
                entrada.next();
                i--;
                continue;
            }

            media += inteiros[i];

            if(i == 0){
                menorNota = inteiros[0];
            }
            if(inteiros[i] > maiorNota){
                maiorNota = inteiros[i];
            }
            if(inteiros[i] < menorNota){
                menorNota = inteiros[i];
            }

            if (inteiros[i] > 6) {
                aprovados++;
            }else{
                reprovados++;
            }

        }

        media /= tamVetor;
        System.out.println("A maior nota é " + maiorNota);
        System.out.println("A menor nota é " + menorNota);
        System.out.println("O número de alunos reprovados é:" + reprovados);
        System.out.println("O número de alunos aprovados é:" + aprovados);
        System.out.println("A média das notas é:" + media);

entrada.close();
}
}