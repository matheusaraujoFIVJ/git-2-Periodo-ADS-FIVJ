
public class Pessoa
{
    private String nome, email;
    private int anoNasc;
    
    //construtor
    public Pessoa(){
    }
    
    public Pessoa(String nome){
        this.nome = nome;
    }
    
    //get e set
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    
    public void setAnoNasc(int anoNasc){
        this.anoNasc = anoNasc;
    }
    public int getAnoNasc(){
        return anoNasc;
    }
    
    //metodos
    public boolean ehMaior18(){
        return(2022 - anoNasc > 18)?true:false;
    }
}
