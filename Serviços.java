
package marketplace;


public class Serviços implements Controle {

    
	
int idProduto;   
private String nome;

    //construtor
    public Serviços(int idProduto, String nome) {
        
        if (idProduto < 0.0) 
         throw new IllegalArgumentException(
            "Id produto must be >= 0.0");
        
        
        



        this.idProduto = idProduto;
        this.nome = nome;
        
    }



//gets e sets


public int getIdProduto() {
	return idProduto;
}

public void setIdProduto(int idProduto) {
	this.idProduto = idProduto;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

//formatação
@Override
    public String toString() {
        return String.format("%s: %s / %s: %s","id",getIdProduto(),"nome", getNome());
    }

    @Override
    public void Array() {
        throw new UnsupportedOperationException("Not supported yet.");
    }


    
     


}
