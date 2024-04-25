import java.util.Scanner;
public class main
{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        empregado e = new empregado();
        
        System.out.print("Informe seu nome: ");
        e.setNome(scan.next());
        System.out.print("Informe sua idade: ");
        e.setIdade(scan.nextInt());
        System.out.print("Informe seu tempo de trabalho: ");
        e.setTempoTrabalhado(scan.nextInt());
        
        inss i = new inss(e);
        
        if(i.podeAposentar()){
            System.out.println("\n\n\nParabens, você consegue aposentar!!");
        }
        else{
            System.out.println("\n\n\nInfelizmente ainda não consegue aposentar!");
        }
    }
}

