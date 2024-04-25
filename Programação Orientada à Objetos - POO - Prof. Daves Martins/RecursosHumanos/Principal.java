import java.util.Scanner;
import java.util.ArrayList;

public class Principal
{
    public static void main(String args[]){
        
        System.out.println("CADASTRO");
        Scanner le = new Scanner(System.in);
        
        //ISindicato sind = new Motorista(); 
        //ISindicato sind = new Bombeiro(); 
        //ISindicato sind = new ISindicato(); 
        ISindicato sind = new Enfermeiro(); 
        IPericulosidade peri = new Enfermeiro();
        Funcionario func = new Enfermeiro() ;
        Enfermeiro enf = new  Enfermeiro(); 
        
        //System.out.println( sind.getNome() ); 
        System.out.println( ((Enfermeiro)sind).getNome() ); 
        System.out.println( ((Funcionario)sind).getNome() ); 
        System.out.println( ((IPericulosidade)sind).adicionalPericulosidade() );
        
        
        sind = new Professor();
        //enf = new Bombeiro();
        System.out.println( ((IPericulosidade)sind).adicionalPericulosidade() );
        
       // Bombeiro b = new Professor(); 
       
       ArrayList<IPericulosidade> lista = new ArrayList<>();
       lista.add( new Bombeiro() );
       lista.add( new Enfermeiro() );
       IPericulosidade per = new Bombeiro();
       ISindicato sin = new Bombeiro();
       lista.add( per ); 
       lista.add( (Bombeiro)sin );
        
    }
}
