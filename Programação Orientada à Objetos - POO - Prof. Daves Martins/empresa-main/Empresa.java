import java.util.ArrayList;

public class Empresa
{
    private String nome;
    private ArrayList<Funcionario> funcionarios;
    
    public Empresa(){
        nome = "";
        funcionarios = new ArrayList<Funcionario>();
    }
    public Empresa(String nome){
        this.nome = nome;
        funcionarios = new ArrayList<>();    
    }
    
    public double totalPagamento(){
        double total = 0;
       /* for (int i = 0; i < funcionarios.size(); i++){ 
            Funcionario f = funcionarios.get(i);
            total += f.salarioLiquido();
        } 
        */
        for(Funcionario f: funcionarios){
          // if (f != null) 
               total += f.salarioLiquido(); 
        }
        return total;
                
    }
    
    public ArrayList<Funcionario> getFuncionarios(){
        return funcionarios;
    }
    public void addFuncionario(Funcionario func){
        funcionarios.add(func);        
    }
    public void removeFuncionario(int pos){
        if (pos >= 0 && pos <= (funcionarios.size()-1)){
          funcionarios.remove(pos);
        }
    }    
    public Funcionario searchFuncionario(String nome){    
      for (int i = 0; i < funcionarios.size(); i++){          
          if (nome.equals( funcionarios.get(i).getNome() )){
             return  funcionarios.get(i);
          }
      }
      return null;
    }
    //public void setFuncionarios(Funcionario[] vetFunc){
    //   funcionarios =  vetFunc;
    //}    
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        if ( !nome.toUpperCase().equals("")   ){
           this.nome = nome;
        }
    }
}
