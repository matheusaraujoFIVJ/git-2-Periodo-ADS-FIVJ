
public class Intervalo
{
    private int a, b;
    
    public Intervalo(){
    }
    
    public void setA(int a){
        this.a=a;
    }
    public int getA(){
        return a;
    }
    public void setB(int b){
        this.b=b;
    }
    public int getB(){
        return b;
    }
    
    public void imprimirImpar(){
        int menor = (a<b)?a:b;
        int maior = (a<b)?b:a;
        
        for(int i=menor; i<=maior; i++){
            if(i%2 != 0){
                System.out.print(" "+i+" ");
                i++;
            }
        }
    }
}
