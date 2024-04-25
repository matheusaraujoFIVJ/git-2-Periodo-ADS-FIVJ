import java.lang.Math;
public class Triangulo
{
    private double a, b, c;
    
    public Triangulo(){
    }
    
    public void setA(double a){
        this.a=a;
    }
    public double getA(){
        return a;
    }
    
    public void setB(double b){
        this.b=b;
    }
    public double getB(){
        return b;
    }
    
    public void setC(double c){
        this.c=c;
    }
    public double getC(){
        return c;
    }
    
    public boolean ehEscaleno(){
        return (a != b && a != c && b != c)? true: false;
    }
    
    public boolean ehEquilatero(){
        return (a == b && a == c && b == c)? true: false;
    }
    
    public boolean ehIsoceles(){
        if(ehEscaleno() == false && ehEquilatero() == false)
            return true;
        else
            return false;
    }
    
    public String tipo(){
        if(ehEscaleno())
            return "Escaleno";
        else if(ehEquilatero())
            return "Equilatero";
        else
            return "Isóceles";
    }
    
    public double perimetro(){
        return a+b+c;
    }
    
    public double area(){
        double s = perimetro()/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    
}
