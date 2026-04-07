import java.util.ArrayList;

public class Produtos {
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

    public void listarProduto(){
        try{
            for( String produto : produtos){
                System.out.printf("Nome: %s", produto);
            }
        } catch(Exception e){
            System.out.println("Erro ao listar produtos\n");
            System.out.printf("ERRO --> : %s", e);
        }
    }

    public  void deletarProduto(String nomeProduto){
        try{
            produtos.remove(nomeProduto);
            System.out.println("O produto '%s' foi deletado com sucesso.");

        } catch (Exception e){
            System.out.printf("Erro ao deletar produto '%s'\n", nomeProduto);
            System.out.printf("ERRO --> : %s", e);
        }

    }

}
