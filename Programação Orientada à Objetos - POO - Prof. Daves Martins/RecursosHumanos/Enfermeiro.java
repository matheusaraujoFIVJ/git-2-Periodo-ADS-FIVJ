
public class Enfermeiro extends Funcionario implements ISindicato, IPericulosidade
{
    private double salarioBase;
    private int numeroPlantoes;
    
    public double  salario(){
        return salarioBase + (numeroPlantoes * 500);
    }
    public double  DecimoTerceiro(){
        return salario();
    }
    public double  contribuicaoSindical(){
        return 0;
    }
    public double adicionalPericulosidade(){
        return 0;
    }
    
}
