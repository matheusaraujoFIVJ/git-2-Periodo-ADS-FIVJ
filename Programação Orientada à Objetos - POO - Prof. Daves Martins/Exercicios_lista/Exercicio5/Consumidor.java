
//Consumidor: nome, idade, cpf
public class Consumidor
{
    private String nome;
    private int idade, cpf;
    private boolean temAr, temCambioAutomatico, temAlarme, pinturaEspecial, temTetoSolar, temKitMultimidia;
    
    public Consumidor(){
    }
    public Consumidor(String nome){
        this.nome=nome;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return nome;
    }
    
    public void setIdade(int idade){
        this.idade=idade;
    }
    public int getIdade(){
        return idade;
    }
    
    public void setCpf(int cpf){
        this.cpf=cpf;
    }
    public int getCpf(){
        return cpf;
    }
    
    //temAr, temCambioAutomatico, temAlarme, pinturaEspecial, temTetoSolar, temKitMultimidi
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
}
