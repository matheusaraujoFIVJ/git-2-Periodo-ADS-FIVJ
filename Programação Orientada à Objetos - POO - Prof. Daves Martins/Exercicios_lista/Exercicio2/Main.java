import java.util.Scanner;
public class Main
{
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        Intervalo intv = new Intervalo();
        System.out.println("##Número ímpares no intervalo entre A e B##");
        System.out.println("A:");
        intv.setA(ler.nextInt());
        System.out.println("B:");
        intv.setB(ler.nextInt());
        
        System.out.println("\n\nIntervalo:");
        intv.imprimirImpar();
    }
}
