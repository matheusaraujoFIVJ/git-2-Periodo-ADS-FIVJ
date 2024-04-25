import java.util.Scanner;

public class Principal
{
    public static void main(String args[]){
        Scanner le = new Scanner(System.in);
        
        System.out.println("## Data da Pesquisa: ");
        Pesquisa pesq = new Pesquisa( le.nextLine() );
        
        while (true){
            Entrevistado e = new Entrevistado();
            System.out.print("## idade : ");
            e.setIdade( le.nextInt() );
            System.out.print("## altura : ");
            e.setAltura( le.nextDouble() );
            System.out.print("## Sexo (M/F): ");
            e.setSexo( le.next().toUpperCase().charAt(0) );            
            System.out.print("## Cor dos Olhos (1 - VERDE | 2 - CASTANHO | 3 - AZUL): ");
            //e.setCorOlhos( le.next().toUpperCase() );            
            int esc = le.nextInt();
            if (esc == 1){ e.setCorOlhos("VERDE");} else
            if (esc == 2){ e.setCorOlhos("CASTANHO");} else
            {e.setCorOlhos("AZUL");}
            
            System.out.print("## Cor dos Cabelos (1 - LOIRO, 2 - CASTANHO, 3 - PRETO): ");
            esc = le.nextInt();
            if (esc == 1){ e.setCorCabelos( ETipoCorCabelo.LOIRO );} else
            if (esc == 2){ e.setCorCabelos(ETipoCorCabelo.CASTANHO);} else
            {e.setCorCabelos( ETipoCorCabelo.PRETO );}
            
            
            pesq.AdicionaEntrevistado( e );
            System.out.print("#### Deseja Sair? (S | N) ");
            if (le.next().equalsIgnoreCase("S")){
                break;
            }
        }
        
        System.out.println("########## RESULTADOS ##########");
        System.out.println("# a) mais alto "+pesq.getEntrevistadoMaiorAltura().getAltura() );
        System.out.println("# a) mais baixo "+pesq.getEntrevistadoMenorAltura().getAltura() );
        System.out.println("# b) Homen mais Velho "+pesq.getHomenMaisVelho().getIdade() );
        System.out.println("# b) Mulher mais Velha "+pesq.getMulherMaisVelha().getIdade() );
        System.out.println("# c) media de altura das mulheres "+
            pesq.getMediaAlturaMulheres() );
        System.out.println("# d) numero de homens "+
            pesq.getQuantidadeHomens() );
        System.out.println("# e) % de homens  "+
            pesq.getPercentualHomens() );
        System.out.println("# e) % de mulheres  "+
            pesq.getPercentualMulheres() );
        System.out.println("# % feminino de 18 ate 35 anos olhos verdes e loiras "+
            pesq.getPercentualPerfil() );
        
        
        
        
        
    }
}
