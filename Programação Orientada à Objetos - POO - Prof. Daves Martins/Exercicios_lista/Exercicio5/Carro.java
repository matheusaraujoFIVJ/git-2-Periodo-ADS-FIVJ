
public class Carro
{
    private double precoInicial;
    private boolean temAr, temCambioAutomatico, temAlarme, pinturaEspecial, temTetoSolar, temKitMultimidia;
    
    public Carro(){
    }
    
    public void setPrecoInicial(double precoInicial){
        this.precoInicial = precoInicial;
    }
    public double getPrecoInicial(){
        return precoInicial;
    }
    public void setTemAr(boolean temAr){
        this.temAr = temAr;
    }
    public boolean getTemAr(){
        return temAr;
    }
    public void setTemCambioAutomatico(boolean temCambioAutomatico){
        this.temCambioAutomatico = temCambioAutomatico;
    }
    public boolean getTemCambioAutomatico(){
        return temCambioAutomatico;
    }
    public void setTemAlarme(boolean temAlarme){
        this.temAlarme = temAlarme;
    }
    public boolean getTemAlarme(){
        return temAlarme;
    }
    public void setPinturaEspecial(boolean pinturaEspecial){
        this.pinturaEspecial = pinturaEspecial;
    }
    public boolean getPinturaEspecial(){
        return pinturaEspecial;
    }
    public void setTemTetoSolar(boolean temTetoSolar){
        this.temTetoSolar = temTetoSolar;
    }
    public boolean getTemTetoSolar(){
        return temTetoSolar;
    }
    public void setTemKitMultimidia(boolean temKitMultimidia){
        this.temKitMultimidia = temKitMultimidia;
    }
    public boolean getTemKitMultimidia(){
        return temKitMultimidia;
    }
    
    
    
    public double precoFinal(){
        return precoInicial + ar() + cambioAutomatico() + alarme() + pinturaEspecial() + tetoSolar() + kitMultimidia();
    }
    
    
    
    public double ar(){
        return(temAr)?3000:0;
    }
    public double cambioAutomatico(){
        return(temCambioAutomatico)?5000:0;
    }
    public double alarme(){
        return(temAlarme)?800:0;
    }
    public double pinturaEspecial(){
        return(pinturaEspecial)?2500:0;
    }
    public double tetoSolar(){
        return(temTetoSolar)?4000:0;
    }
    public double kitMultimidia(){
        return(temKitMultimidia)?1800:0;
    }
}
