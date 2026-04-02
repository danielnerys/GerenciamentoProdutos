import java.util.ArrayList;

public class produtos {
    ArrayList<String> produtos = new ArrayList<String>();

    //Criar metodos C.R.U.D

    public void atualizarProduto(int indexProduto, String novoValor){
        try{
            produtos.set(indexProduto, novoValor);
        }catch (Exception e){
            System.out.println(e);
        }
    }



}
