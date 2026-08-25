import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Exercicio3
{
    public static void main(String[] args) 
        {
            Scanner entrada = new Scanner(System.in);
            int[] numerosDefinidos = new int[15];
            List<Integer> pares = new ArrayList<>();//Cria uma lista/vetor para guardar os números
            List<Integer> impares = new ArrayList<>();
            int par = 0;
            int impar = 0;

                for(int i = 0; i < numerosDefinidos.length; i++)
                {
                    try
                    {
                        System.out.println("Digite o " + (i+1) + "º número para armazenar no vetor: ");
                        numerosDefinidos[i] = entrada.nextInt();
                    }
                    catch (InputMismatchException e)
                    {
                        System.out.println("Valor incorreto! Digite um número inteiro.");
                        entrada.next();
                        i--;
                    }
                }

                for(int i = 0; i < numerosDefinidos.length; i++)
                {
                    if( numerosDefinidos[i] % 2 == 0)
                    {
                        par ++;
                        pares.add(numerosDefinidos[i]);
                    }
                    else               
                    {
                        impar++;
                        impares.add(numerosDefinidos[i]);
                    }   
                        
                }
                    System.out.println("Quantidade de números impares:" + impar);
                    System.out.println("Números ímpares:" + impares);
                    System.out.println("Quantidade de números pares:" + par);
                    System.out.println("Números pares:" + pares);
        entrada.close();
    }
}