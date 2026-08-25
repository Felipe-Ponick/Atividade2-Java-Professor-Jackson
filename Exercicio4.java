import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.HashSet;

public class Exercicio4
{
    public static void main(String[] args) 
        {
            Scanner entrada = new Scanner(System.in);
            HashSet<String> nomes = new HashSet<>();
            List<String> listaCompras = new ArrayList<String>();//Cria uma lista/vetor para guardar os números
            String adicionarProduto;
            String removerProduto;
            String consultarProduto;
            int opcao;
            do
            {
                System.out.println("============================================");
                System.out.println("--------------Menu de escolhas--------------");
                System.out.println("============================================"); 
                System.out.println("-------Escolha uma das opções abaixo:-------"); 
                System.out.println("Opção 1: Adicionar produto."); 
                System.out.println("Opção 2: Remover produto."); 
                System.out.println("Opção 3: Listar produtos."); 
                System.out.println("Opção 4: Consultar produto."); 
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
                        System.out.println("Informe qual produto você deseja cadastrar:");
                        adicionarProduto = entrada.next(); 
                        listaCompras.add(adicionarProduto);
                        break;

                    case 2: 
                        System.out.println("Informe qual produto você deseja remover:");
                        removerProduto = entrada.next(); 
                        listaCompras.remove(removerProduto);  
                        break;

                    case 3:
                        System.out.println("Os produtos listados no momento são: " + listaCompras);
                        break;
                    case 4:
                        System.out.println("Informe o nome do produto que você deseja consultar: ");
                        consultarProduto = entrada.next(); 

                        if (listaCompras.contains(consultarProduto)) 
                        {
                            System.out.println("Este produto já está cadastrado.");                       
                        }
                        else
                        {
                            System.out.println("Este produto não está cadastrado.");
                        }
                        break;

                            case 5:
                            break;
                }
            }
            while(opcao != 5);
            {
                System.out.println("Programa encerrado.");
            }
        }   
}