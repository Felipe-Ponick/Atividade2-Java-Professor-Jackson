import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        HashSet<String> nomes = new HashSet<>();
        int opcao = 0;

        do {
            System.out.println("============================================");
            System.out.println("--------------Menu de escolhas--------------");
            System.out.println("============================================");
            System.out.println("-------Escolha uma das opções abaixo:-------");
            System.out.println("Opção 1: Inserir nome.");
            System.out.println("Opção 2: Listar nomes cadastrados.");
            System.out.println("Opção 3: Verificar cadastro.");
            System.out.println("Opção 4: Quantidade de cadastros.");
            System.out.println("Opção 5: Encerrar");
            System.out.println("============================================");

            try 
            {
                opcao = entrada.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Opção inválida! Digite apenas números.");
                entrada.next();          // descarta o texto inválido do buffer
                continue;
            }
            entrada.nextLine();          // limpa o \n que sobrou do nextInt

            switch (opcao) 
            {

                case 1:
                    System.out.println("Informe qual nome você deseja cadastrar:");
                    String adicionarNome = entrada.nextLine().trim();

                    if (adicionarNome.isEmpty()) {
                        System.out.println("Nome não pode ser vazio.");
                    } else if (nomes.add(adicionarNome)) {
                        System.out.println("Nome cadastrado!!");
                    } else {
                        System.out.println("Esse nome já está cadastrado.");
                    }
                    break;

                case 2:
                    if (nomes.isEmpty()) {
                        System.out.println("Nenhum nome cadastrado ainda.");
                    } else {
                        System.out.println("Os nomes cadastrados no momento são: " + nomes);
                    }
                    break;

                case 3:
                    System.out.println("Informe o nome que você deseja consultar:");
                    String consultarNome = entrada.nextLine().trim();

                    if (nomes.contains(consultarNome)) {
                        System.out.println("Este nome já está cadastrado.");
                    } else {
                        System.out.println("Este nome não está cadastrado.");
                    }
                    break;

                case 4:
                    System.out.println("A quantidade de pessoas cadastradas é: " + nomes.size());
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Opção inexistente! Escolha de 1 a 5.");
            }

        } while (opcao != 5);

        System.out.println("Programa encerrado.");
        entrada.close();
    }
}