import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> produtos = new ArrayList<>();
        Produtos produto = new Produtos();
        String nomeProduto;

        int opcao;

        do{
            System.out.println("\n====== Menu ======");
            System.out.println("1 - Cadastrar produtos");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Deletar produto");
            System.out.println("4 - Atualizar produto");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();
            //sc.nextInt();  //limpar o que nao foi pedido

            switch (opcao) {

                case 1:
                    //cadastrar
                    System.out.println("Insira o nome do Produto a ser cadastrado: ");
                    nomeProduto = sc.next();
                    produto.cadastrarProduto(nomeProduto);
                    System.out.printf("\nProduto '%s' cadastrado com sucesso!\n", nomeProduto);
                    break;
                case 2:
                    System.out.println("--- PRODUTOS --- \n");
                    produto.listarProduto();
                    break;
                case 3:
                    System.out.println("Insira o nome do Produto a ser deletado: ");
                    nomeProduto = sc.next();
                    produto.deletarProduto(nomeProduto);
                    System.out.printf("\nProduto '%s' deletado com sucesso!\n", nomeProduto);
                    break;
                case 4:
                    //atualizar produto
                    break;
                case 0:
                    System.out.println("Saindo....");
                    break;

                default:
                    System.out.println("Opção invalida :(\n");

            }

        }while (opcao != 0);
            sc.close();
        
    }

}