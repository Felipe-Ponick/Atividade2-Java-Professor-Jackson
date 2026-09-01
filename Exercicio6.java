import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.HashSet;

public class Exercicio6
{
    public static void main(String[] args) 
        {
            Scanner entrada = new Scanner(System.in);
            Map<String, Integer> estoqueProdutos = new HashMap<String, Integer>();
            String adicionarProduto;
            String removerProduto;
            String consultarProduto;
            String atualizarProduto;
            int quantidadeProduto;
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
                System.out.println("Opção 4: Consultar estoque."); 
                System.out.println("Opção 5: Atualizar quantidade."); 
                System.out.println("Opção 6: Encerrar."); 
                System.out.println("============================================");

                try
                {
                    opcao = entrada.nextInt();
                }
                catch (InputMismatchException e)
                {
                    System.out.println("Opção inválida! Digite um número de 1 a 6.");
                    entrada.next();
                    opcao = 0;
                    continue;
                }
                
                switch (opcao) 
                {
                    case 1 :
                        System.out.println("Informe qual produto você deseja cadastrar:");
                        adicionarProduto = entrada.next(); 

                        try
                        {
                            System.out.println("Informe a quantidade desse produto:");
                            quantidadeProduto = entrada.nextInt(); 
                        }
                        catch (InputMismatchException e)
                        {
                            System.out.println("Quantidade inválida! Digite um número inteiro.");
                            entrada.next();
                            break;
                        }

                        if (estoqueProdutos.containsKey(adicionarProduto))
                        {
                            System.out.println("Este produto já está cadastrado. Use a opção 5 para atualizar.");
                        }
                        else
                        {
                            estoqueProdutos.put(adicionarProduto, quantidadeProduto);
                            System.out.println("Produto cadastrado com sucesso!");
                        }
                        break;  

                    case 2: 
                        System.out.println("Informe qual produto você deseja remover:");
                        removerProduto = entrada.next(); 

                        if (estoqueProdutos.containsKey(removerProduto))
                        {
                            estoqueProdutos.remove(removerProduto);
                            System.out.println("Produto removido do estoque.");
                        }
                        else
                        {
                            System.out.println("Este produto não está no estoque.");
                        }
                        break;  

                    case 3:
                        if (estoqueProdutos.isEmpty())
                        {
                            System.out.println("Nenhum produto cadastrado no momento.");
                        }
                        else
                        {
                            System.out.println("Os produtos listados no momento são: " + estoqueProdutos);
                        }
                        break;

                    case 4:
                        System.out.println("Informe o nome do produto que você deseja consultar: ");
                        consultarProduto = entrada.next(); 

                        if (estoqueProdutos.containsKey(consultarProduto)) 
                        {
                            System.out.println("Este produto está no estoque.");
                            System.out.println("Quantidade disponível: " + estoqueProdutos.get(consultarProduto));
                        }
                        else
                        {
                            System.out.println("Este produto não está no estoque.");
                        }
                        break;

                    case 5:
                        System.out.println("Informe o nome do produto que deseja atualizar:");
                        atualizarProduto = entrada.next();

                        if (estoqueProdutos.containsKey(atualizarProduto))
                        {
                            System.out.println("Quantidade atual: " + estoqueProdutos.get(atualizarProduto));

                            try
                            {
                                System.out.println("Informe a nova quantidade:");
                                quantidadeProduto = entrada.nextInt();
                            }
                            catch (InputMismatchException e)
                            {
                                System.out.println("Quantidade inválida! Digite um número inteiro.");
                                entrada.next();
                                break;
                            }

                            if (quantidadeProduto < 0)
                            {
                                System.out.println("A quantidade não pode ser negativa.");
                            }
                            else
                            {
                                estoqueProdutos.put(atualizarProduto, quantidadeProduto);
                                System.out.println("Quantidade atualizada com sucesso!");
                            }
                        }
                        else
                        {
                            System.out.println("Este produto não está cadastrado no estoque.");
                        }
                        break;

                    case 6:
                        break;

                    default:
                        System.out.println("Opção inexistente! Escolha de 1 a 6.");
                }
            }
            while(opcao != 6);
            {
                System.out.println("Programa encerrado.");
            }
        }   
}