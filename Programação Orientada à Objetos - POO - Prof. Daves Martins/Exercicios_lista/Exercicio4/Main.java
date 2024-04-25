import java.util.Scanner;
public class Main
{
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        
        Pessoa p = new Pessoa();
        System.out.print("Informe seu nome: ");
        p.setNome(ler.next());
        System.out.print("Informe seu email: ");
        p.setEmail(ler.next());
        System.out.print("Informe seu ano de nascimento: ");
        p.setAnoNasc(ler.nextInt());
        
        System.out.print("Sou maior de 18? ");
        if(p.ehMaior18()){
            System.out.print("SIM!!!!");
        }
        else{
            System.out.print("NÃO!!!!");
        }
    }
}
