

public class Entrevistado
{
    private int idade;
    private double altura;
    private char sexo;
    private String corOlhos;
    private ETipoCorCabelo corCabelos;
    
    public Entrevistado(){}
    public Entrevistado(int idade, double altura, char sexo,
    String corOlhos,ETipoCorCabelo corCabelos ){
        this.idade = idade;
        this.altura = altura;
        setSexo(sexo);
        setCorOlhos(corOlhos);
        this.corCabelos = corCabelos;
    }
    
    public boolean temPerfil(){
        return (getSexo() == 'F' || getSexo() == 'f') &&
                     (getIdade() >= 18 && getIdade() <= 35) &&
                     ( getCorOlhos().equals("VERDE") ) &&
                     ( getCorCabelos() == ETipoCorCabelo.LOIRO ); 
    }
    
    public void setCorCabelos(ETipoCorCabelo corCabelos){
        this.corCabelos = corCabelos;
    }
    public ETipoCorCabelo getCorCabelos(){
        return corCabelos;
    }
    
    public void setCorOlhos(String corOlhos){
        if (corOlhos.toUpperCase().equals("VERDE") ||
            corOlhos.toUpperCase().equals("CASTANHO") ||
            corOlhos.toUpperCase().equals("AZUL")
        ){
            this.corOlhos = corOlhos.toUpperCase();
        }
    }
    public String getCorOlhos(){
        return corOlhos;
    }
    
    public void setSexo(char sexo){
        if (sexo == 'M' || sexo == 'F' ||
            sexo == 'm' || sexo == 'f'){
            this.sexo = sexo;    
        }
        /*if ( "M".charAt(0) == sexo ) {   
            this.sexo = 'M';
        }
        if ( "F".charAt(0) == sexo )  {  
            this.sexo = 'F';
        }*/
    }
    public char getSexo(){
        return sexo;
    }
    
    public void setAltura(double altura){
        if (altura >= 0){
            this.altura = altura;
        }
    }
    public double getAltura(){
        return altura;
    }
    
    public void setIdade(int idade){
        if (idade >= 0){
            this.idade = idade;
        }
    }
    public int getIdade(){
        return idade;
    }
    
}
