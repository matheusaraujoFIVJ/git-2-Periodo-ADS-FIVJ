

public class Professor extends Funcionario implements ISindicato
{
    private int numeroAulas;    
    
    @Override
    public  double  salario(){
        return (numeroAulas * 8.00) * bonusEscolaridade();
    }
    @Override
    public double  DecimoTerceiro(){
        return salario() * (2 - bonusEscolaridade());
    }
    @Override
    public double  ferias(){
        return super.ferias() * 1.5;
    }
    @Override
    public double  contribuicaoSindical(){
        return 0;
    }
    
    public double bonusEscolaridade(){
        if (getEscolaridade() == EEscolaridade.MESTRADO){
            return 1.10;
        }else  if (getEscolaridade() == EEscolaridade.DOUTORADO){
             return 1.12;   
        }
        return 1;
    }
    
}
