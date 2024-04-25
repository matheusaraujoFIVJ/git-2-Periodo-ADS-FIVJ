
public class inss
{
    private empregado e;
    
    public inss(){
    }
    public inss(empregado e){
        this.e = e;
    }
    
    public boolean podeAposentar(){
        if(e.getIdade() >= 65 || e.getTempoTrabalhado() >= 30 ||
        (e.getIdade() >=60 && e.getTempoTrabalhado() >= 25)){
            return true;
        }
        else{
            return false;
        }
    }
}
