package exercicio12;

import java.util.ArrayList;

public class Pesquisa {
	private String dataPesquisa, nome;
	private ArrayList<Entrevistado> entrevistados;

	// construtores
	public Pesquisa(String dataPesquisa, String nome) {
		this.dataPesquisa = dataPesquisa;
		this.nome = nome;
		entrevistados = new ArrayList<>();
	}

	// get e set
	public void setDataPesquisa(String dataPesquisa) {
		this.dataPesquisa = dataPesquisa;
	}

	public String getDataPesquisa() {
		return this.dataPesquisa;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void adicionarEntrevistado(Entrevistado e) {
		entrevistados.add(e);
	}

	public ArrayList<Entrevistado> getEntrevistados() {
		return entrevistados;
	}

	// métodos
	public Entrevistado getEntrevistadoMaiorAltura() {
		if (entrevistados.size() > 0) {
			Entrevistado maior = entrevistados.get(0);
			for (Entrevistado e : entrevistados) {
				if (e.getAltura() > maior.getAltura())
					maior = e;
			}
			return maior;
		}
		return null;
	}

	public Entrevistado getEntrevistadoMenorAltura() {
		if (entrevistados.size() > 0) {
			Entrevistado menor = entrevistados.get(0);
			for (Entrevistado e : entrevistados) {
				if (e.getAltura() < menor.getAltura())
					menor = e;
			}
			return menor;
		}
		return null;
	}

	public Entrevistado getHomemMaisVelho() {
		if (entrevistados.size() > 0) {
			Entrevistado maisVelho = new Entrevistado();
			maisVelho.setIdade(0);
			for (Entrevistado e : entrevistados) {
				if (e.getSexo() == 'M' && e.getIdade() > maisVelho.getIdade())
					maisVelho = e;
			}
			return maisVelho;
		}
		return null;
	}

	public Entrevistado getMulherMaisVelha() {
		if (entrevistados.size() > 0) {
			Entrevistado maisVelho = new Entrevistado();
			maisVelho.setIdade(0);
			for (Entrevistado e : entrevistados) {
				if (e.getSexo() == 'F' && e.getIdade() > maisVelho.getIdade())
					maisVelho = e;
			}
			return maisVelho;
		}
		return null;
	}

	public double getMediaAlturaMulheres() {
		if (entrevistados.size() > 0) {
			double soma = 0;
			for (Entrevistado e : entrevistados) {
				if (e.getSexo() == 'F')
					soma += e.getAltura();
			}
			return soma / getQuantidadeMulheres();
		}
		return 0.0;
	}

	public int getQuantidadeMulheres() {
		if (entrevistados.size() > 0) {
			int cont = 0;
			for (Entrevistado e : entrevistados) {
				if (e.getSexo() == 'F')
					cont++;
			}
			return cont;
		}
		return 0;
	}

	public int getQuantidadeHomens() {
		if (entrevistados.size() > 0) {
			return entrevistados.size() - getQuantidadeMulheres();
		}
		return 0;
	}

	public double getPercentHomens() {
		return getQuantidadeHomens() * 100 / entrevistados.size();
	}

	public double getPercentMulheres() {
		return getQuantidadeMulheres() * 100 / entrevistados.size();
	}

	public double getPercentPerfil() {
		if (entrevistados.size() > 0) {
			int total = 0;
			for (Entrevistado e : entrevistados) {
				if (e.ehPerfil())
					total++;
			}
			return total * 100 / entrevistados.size();
		}
		return 0;
	}
}
