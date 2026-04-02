import java.util.ArrayList;
import java.util.Scanner;

public class Produtos {
    ArrayList<String> produtos = new ArrayList<String>();


    //Lucas
    public static void deletarProduto(ArrayList<String> produtos, Scanner sc) {
        System.out.print("Digite o nome do Produto que queira deletar: ");
        String nome = sc.nextLine();

        boolean encontrado = false; //achar produto

        //loop
        for (int i = 0; i < produtos.size(); i++) {

            if (produtos.get(i).equalsIgnoreCase(nome)) {
                produtos.remove(i); //apagou a posição do produto e deixou vazio
                encontrado = true; //achou o produto

                System.out.println("Produto removido!");
                break;
            }
        }
        if (!encontrado) {//caso o produto nao seja encontrado
            System.out.println("Produto nao encontrado :(");
        }
    }

}