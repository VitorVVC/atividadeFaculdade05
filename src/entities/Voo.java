package entities;

public class Voo {

	private Data dataOperacao;
	private int quantidadeAssentos;
	private boolean[] assentoVago;

	public Voo(Data dataOperacao, int quantidadeAssentos) {
		this.dataOperacao = dataOperacao;
		this.quantidadeAssentos = quantidadeAssentos;
		this.assentoVago = new boolean[quantidadeAssentos];
		// Opcional a funcão abaixo pois boolean sempre será por default false
		for (int i = 0; i < quantidadeAssentos; i++) {
			assentoVago[i] = false;
		}
	}

	public boolean verifica(int pos) {
		return assentoVago[pos - 1];
	}

	public void ocupa(int pos) {
		if (!assentoVago[pos - 1]) {
			assentoVago[pos - 1] = true;
		} else {
			System.out.println("Assento já ocupado");
		}
	}

	public int vagas() {
		int vagas = 0;
		for (boolean assentos : assentoVago) {
			if (!assentos) {
				vagas++;
			}
		}
		return vagas;
	}

	public boolean lotado() {
		for (int i = 0; i < quantidadeAssentos; i++) {
			if (assentoVago[i] == false) {
				return false;
			}
		}
		return false;
	}

	public void imprimir() {
		System.out.printf("Data: %02d/%02d/%04d", dataOperacao.getDia(), dataOperacao.getMes(), dataOperacao.getAno());
		System.out.print("\nQuantidade de cadeiras disponiveis: ( " + vagas() + " ) ");
		for (int i = 0; i < assentoVago.length; i++) {
			if (!assentoVago[i]) {
				System.out.print((i + 1) + " ");
			}
		}
	}

	public int getQuantidadeAssentos() {
		return quantidadeAssentos;
	}

	public void setQuantidadeAssentos(int quantidadeAssentos) {
		this.quantidadeAssentos = quantidadeAssentos;
	}

	public Data getDataOperacao() {
		return dataOperacao;
	}

	public boolean[] getAssentoVago() {
		return assentoVago;
	}

}
