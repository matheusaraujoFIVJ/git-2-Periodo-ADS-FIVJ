package exercicio12;

public class Entrevistado {
	private String nome;
	private char sexo;
	private double altura;
	private int idade;
	private ECorCabelo corCabelo;
	private ECorOlhos corOlhos;

	// construtores
	public Entrevistado() {
		this(" ");
	}

	public Entrevistado(String nome) {
		this.nome = nome;
	}

	// métodos
	public boolean ehPerfil() {
		if((getIdade()>=18 && getIdade()<=35) && (getCorOlhos() == ECorOlhos.VERDE) && 
				(getCorCabelo()==ECorCabelo.LOIRO)) {
			return true;
		}
		return false;
	}

	// get e set
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}

	public void setSexo(char sexo) {
		if(sexo == 'M' || sexo == 'F')
			this.sexo = sexo;
	}

	public char getSexo() {
		return this.sexo;
	}

	public void setAltura(double altura) {
		if(altura>0)
			this.altura = altura;
	}

	public double getAltura() {
		return this.altura;
	}

	public void setIdade(int idade) {
		if(idade>=0)
			this.idade = idade;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setCorCabelo(int n) {
		if(n == 1)
			this.corCabelo = corCabelo.LOIRO;
		else if( n == 2)
			this.corCabelo = corCabelo.CASTANHO;
		else
			this.corCabelo = corCabelo.PRETO;
	}

	public ECorCabelo getCorCabelo() {
		return this.corCabelo;
	}

	public void setCorOlhos(int n) {
		if(n == 1)
			this.corOlhos = corOlhos.AZUL;
		else if(n == 2)
			this.corOlhos = corOlhos.VERDE;
		else
			this.corOlhos = corOlhos.CASTANHO;
	}

	public ECorOlhos getCorOlhos() {
		return this.corOlhos;
	}
}
