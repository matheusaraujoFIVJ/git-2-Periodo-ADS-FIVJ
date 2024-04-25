
import java.util.ArrayList;
public class RH
{
    private String nome;
    // lista de funcionarios
    private ArrayList<Funcionario> empregados;
    
    private ArrayList<Motorista> motorista;
        
    private ArrayList<IPericulosidade> funcPerigosos;
        
    //funcPerigosos.add( new Professor() );
    //funcPerigosos.add( new Funcionario() );
    //funcPerigosos.add( new Enfermeiro() );
    //funcPerigosos.add( new Bombeiro() );
    
    public double totalSindicato(){
        double total = 0;
        for (Funcionario f : empregados){
            //if (f instanceof Professor || f instanceof Enfermeiro){
            if (f instanceof ISindicato){    
                total += ((ISindicato)f).contribuicaoSindical();
            }
        }
        return total;
    }
    
    public double totalSalarioDoutor(){
        double total = 0;
        for (Funcionario f : empregados){
            //if (f instanceof Professor || f instanceof Enfermeiro){
            if (f instanceof Professor 
            && f.getEscolaridade() == EEscolaridade.DOUTORADO ){    
                total += ((Professor)f).contribuicaoSindical();
            }
        }
        return total;
    }
    /*
    public boolean AposentadoriaEspecial(Professor func){
        
        //if ( func.getIdade() >= 95 && func instanceof Professor ){
            if ( func.getIdade() >= 95 ){
            return true;
        }
        return false;
    }
    */
    public RH(){
        this("");
    }
    public RH(String nome){
        this.nome = nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
}
