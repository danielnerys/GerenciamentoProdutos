import java.util.ArrayList;

public class Produtos {
    ArrayList<String> produtos = new ArrayList<String>();

    //Criar metodos C.R.U.D

    //Create
    public void cadastrarProduto(String nomeProduto){
        try {
            produtos.add(nomeProduto);
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
            System.out.printf("ERRO --> : %s", e.getMessage());
        }
    }

    public  void deletarProduto(String nomeProduto){
        try{
            produtos.remove(nomeProduto);

        } catch (Exception e){
            System.out.printf("Erro ao deletar produto '%s'\n", nomeProduto);
            System.out.printf("ERRO --> : %s", e.getMessage());
        }

    }

}
