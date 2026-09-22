package Exercicio1;
import java.util.Scanner;

public class Produto {
    public String nome;
    public int quantidade;
    public double preco;
    public double estoque;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public void adicionarEstoque(int qntEstoque){
        this.quantidade = quantidade + qntEstoque;
    }

    public void cadastrarEstoque(int qntEstoque){
        this.quantidade = quantidade + qntEstoque;
    }

    public void removerEstoque(int qntEstoqueRemover){
        this.quantidade = quantidade - qntEstoqueRemover;
    }

    public void exibirDados(){
        System.out.println("Produto: " + nome);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço: " + preco);
        System.out.println("O valor total do estoque é: " + quantidade *preco);
    }
} 
