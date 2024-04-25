import java.util.Scanner;

class Main{
    
    
    public static void main(String [] args){
        
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        int notaObj = teclado2.nextInt();
        String nomeObj = teclado.next();
        Aluno obj = new Aluno(nomeObj,notaObj);
        
        System.out.println(obj.retornaNome());
        
        if(obj.soma()){
            System.out.println("eh");
        
        
    }   else{
            System.out.println("nao");
        
    }
}
}