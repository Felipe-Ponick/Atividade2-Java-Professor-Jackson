import java.lang.reflect.Array;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio2{
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numerosDefinidos = new int[10];
        boolean encontrado = false;

        for(int i = 0; i < 10; i++){
            try {
                System.out.println("Digite o " + (i+1) + "º número para armazenar no vetor: ");
                numerosDefinidos[i] = entrada.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido! Digite um número inteiro.");
                entrada.next();
                i--;
            }
        }

        int numero = 0;
        while (true) {
            try {
                System.out.println("Informe outro número: ");
                numero = entrada.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido! Digite um número inteiro.");
                entrada.next();
            }
        }

        for(int i = 0; i < numerosDefinidos.length; i++)
        {
            if(numero == numerosDefinidos[i])
            {
                encontrado = true;
                break;
            }
        }

        if(encontrado = true)
        {
            System.out.println("Este número já está no vetor.");
        }else {
            System.out.println("Este número não está no vetor.");
        }
        entrada.close();
}
}