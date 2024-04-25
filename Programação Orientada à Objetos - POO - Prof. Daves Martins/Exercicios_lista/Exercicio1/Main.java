import java.lang.Math;
import java.util.Scanner;
public class Main
{
   public static void main(String args[]){
       double x1, y1, x2, y2;
       Scanner ler = new Scanner(System.in);
       System.out.print("Ponto 1: ");
       x1=ler.nextDouble();
       System.out.print("Ponto 1: ");
       y1=ler.nextDouble();
       System.out.print("\n\nPonto 2: ");
       x2=ler.nextDouble();
       System.out.print("Ponto 2: ");
       y2=ler.nextDouble();
    
       
       
       System.out.println("\n\n\n\nDistancia entre os pontos: "+ distanciaPontos(x1,y1,x2,y2));
   }
   
   public static double distanciaPontos(double x1, double y1, double x2, double y2){
       return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
   }
}
