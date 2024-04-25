
//-Concessionária: modeloCarro// precoTotal
public class Concessionaria
{
    private String modelo;
    private double precoInicial, preco;
    
    public Concessionaria(){
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
        if(this.modelo.equalsIgnoreCase("1.0"))
            precoInicial = 20000;
        else if(this.modelo.equalsIgnoreCase("1.6"))
            precoInicial = 40000;
        else
            precoInicial = 60000;
    }
    public String getModelo(){
        return modelo;
    }
    public double getPrecoInicial(){
        return (precoInicial!=0)? precoInicial : -10000;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public double precoTotal(){
        return preco + ipi() + importante();
    }
    
    public double ipi(){
        return (this.modelo.equalsIgnoreCase("1.0"))? preco * 0.1 : preco * 0.2;
    }
    
    public double importante(){
        return (ehImportante())? preco * 0.3 : 0;
    }
    
    public boolean ehImportante(){
        return (this.modelo.equalsIgnoreCase("2.0"))? true:false;
    }
}
