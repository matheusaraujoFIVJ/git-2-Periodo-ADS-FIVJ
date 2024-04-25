import java.util.Scanner;
public class main
{
    public static void main(String args[]){
        Scanner ler = new Scanner (System.in);
        Triangulo triangulo = new Triangulo();
        System.out.println("Dê os lados do triângulo:");
        System.out.print("Lado A: ");
        triangulo.setA(ler.nextDouble());
        System.out.print("Lado B: ");
        triangulo.setB(ler.nextDouble());
        System.out.print("Lado C: ");
        triangulo.setC(ler.nextDouble());
        
        System.out.println("\n\nPerímetro do triângulo: "+triangulo.perimetro());
        System.out.println("Área do triângulo: "+triangulo.area());
        
        System.out.println("Tipo de triângulo: "+ triangulo.tipo());
        
    }
}
