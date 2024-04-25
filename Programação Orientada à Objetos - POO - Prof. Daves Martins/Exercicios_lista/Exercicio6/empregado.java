
public class empregado
{
    private String nome;
    private int idade, tempoTrabalhado;
    
    public empregado(){
    }
    public empregado(String nome){
        this.nome = nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return idade;
    }
    public void setTempoTrabalhado(int tempoTrabalhado){
        this.tempoTrabalhado = tempoTrabalhado;
    }
    public int getTempoTrabalhado(){
        return tempoTrabalhado;
    }
}
