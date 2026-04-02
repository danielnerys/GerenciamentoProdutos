import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> produtos = new ArrayList<>();

        int opcao;

        do{
            System.out.println("======menu======");
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
                    break;
                case 2:
                    //listar
                    break;
                case 3:
                    Produtos.deletarProduto(produtos, sc);
                    break;
                case 4:
                    //atualizar produto
                    break;
                case 0:
                    System.out.println("Saindo....");
                    break;

                default:
                    System.out.println("Opção invalida :(");

            }

        }while (opcao != 0);
        sc.close();
    }

}
