package exercicio12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inicio");
		Pesquisa pesq = new Pesquisa(sc.nextLine(), "BNBFR");
		Entrevistado ent;
		
		System.out.println("####### "+ pesq.getNome() + " #######");
		System.out.println("\nData da pesquisa: " + pesq.getDataPesquisa());
		System.out.println("\nEntrevista\n");
		
		int i=1;
		while(true) {
			sc.nextLine();
			System.out.println("### Entrevistado "+ i);
			System.out.print("# Nome: ");
			ent = new Entrevistado(sc.nextLine());
			System.out.print("# Altura: ");
			ent.setAltura(sc.nextDouble());
			System.out.print("# Idade: ");
			ent.setIdade(sc.nextInt());
			System.out.print("# Sexo: ");
			ent.setSexo(sc.next().toUpperCase().charAt(0));
			System.out.print("# Cor do cabelo (loiro(1), castanho(2) ou preto(3)): ");
			ent.setCorCabelo(sc.nextInt());
			System.out.print("# Cor dos olhos (azul(1), verde(2) ou castanho(3)): ");
			ent.setCorOlhos(sc.nextInt());sc.nextLine();
			
			pesq.adicionarEntrevistado(ent);
			
			System.out.println("\n## Adicionar outro canditado? (S/N)");
			if(sc.next().equalsIgnoreCase("N"))
				break;
		}
		
		System.out.println("\n###### Resultados ######");
		System.out.println("# Maior altura: " + pesq.getEntrevistadoMaiorAltura().getAltura());
		System.out.println("# Menor altura: " + pesq.getEntrevistadoMenorAltura().getAltura());
		System.out.println("# Homem mais velho: "+ pesq.getHomemMaisVelho().getIdade() + ", " 
				+ pesq.getHomemMaisVelho().getNome());
		System.out.println("# Mulher mais velhas: " + pesq.getMulherMaisVelha().getIdade() + ", "
				+ pesq.getMulherMaisVelha().getNome());
		System.out.println("# Média altura das mulheres: " + pesq.getMediaAlturaMulheres());
		System.out.println("# Número de homens que participaram: " + pesq.getQuantidadeHomens());
		System.out.println("# Porcentagem homens: " + pesq.getPercentHomens());
		System.out.println("# Porcentagem mulheres: " + pesq.getPercentMulheres());
		System.out.println("# Porcentagem de mulheres entre 18 e 35 anos que tenham olhos verdes"
				+ " e cabelos loiros: " + pesq.getPercentPerfil());
		
		sc.close();
	}

}
