import java.util.ArrayList;

public class produtos {
    ArrayList<String> produtos = new ArrayList<String>();

    //Criar metodos C.R.U.D

    //Create
    public void cadastrarProduto(String nomeProduto){
        try {

        produtos.add(nomeProduto);
        System.out.printf("Produto '%s' cadastrado com sucesso!", nomeProduto);

        } catch (Exception e) {
            System.out.println("Erro ao tentar cadastrar produto! Tente novamente \n");
            System.out.println("Mensagem Erro: " + e.getMessage());
        }
    }

}
