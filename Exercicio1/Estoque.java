package Exercicio1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Estoque
{
    public static void main(String[] args) 
        {
            Scanner entrada = new Scanner(System.in);
            ArrayList<Produto> produtos = new ArrayList();//Cria uma lista/vetor para guardar os números
            int opcao;
            do
            {
                System.out.println("============================================");
                System.out.println("--------------Menu de escolhas--------------");
                System.out.println("============================================"); 
                System.out.println("-------Escolha uma das opções abaixo:-------"); 
                System.out.println("Opção 1: Cadastrar produto."); 
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
                        System.out.println("Preço");
                        double preco = entrada.nextDouble();
                        System.out.println("Quantidade:");
                        int quantidadeProduto = entrada.nextInt();

                        Produto produto = new Produto(
                            nome,
                            preco,
                            quantidadeProduto);

                        produtos.add(produto);
                        break;

                    case 2: 
                        System.out.println("Informe qual produto você deseja remover:");
                        String produtoRemove = entrada.next(); 
                        System.out.println("Informe a quantidade que você deseja remover:");
                        int qntEstoqueRemover = entrada.nextInt();
                        for(Produto p : produtos) {
                            if (p.nome.equals(produtoRemove)) {
                                p.removerEstoque(qntEstoqueRemover);
                            }
                        }
                        break;  

                    case 3:
                        System.out.println("Informe qual produto você deseja adicionar:");
                        String produtoAdd = entrada.next();

                        System.out.println("Informe a quantidade que você deseja adicionar:");
                        int qntEstoque = entrada.nextInt();
                        for(Produto p : produtos) {
                            if (p.nome.equals(produtoAdd)) {
                                p.adicionarEstoque(qntEstoque);
                            }
                        }  
                        break;  

                    case 4:
                        System.out.println("Produtos no Estoque!");
                        
                        if(produtos.isEmpty()){
                            System.out.print("Nenhum produto no estoque");
                        }else{
                            for(Produto p : produtos){
                                p.exibirDados();
                            }
                        }

                        
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