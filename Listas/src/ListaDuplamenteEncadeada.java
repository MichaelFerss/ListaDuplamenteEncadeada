
public class ListaDuplamenteEncadeada<T> {

	private No<T> primeiro;
	private int tamanho;

	public ListaDuplamenteEncadeada() {
		
		tamanho = 0;
		primeiro = null;
	}

	public void add(T item) {

		No<T> novoNo = new No(item);

		if (primeiro == null) {

			primeiro = novoNo;

		} else {

			int cont = 1;

			No<T> noAux = primeiro;

			No<T> noPenultimo = primeiro;

			while (noAux != null) {
				noPenultimo = noAux;
				noAux = noAux.prox;

			}

			novoNo.ant = noPenultimo;

			noPenultimo.prox = novoNo;

		}
		tamanho++;

	}

	private boolean eVazio() {

		return primeiro == null;
	}

	public String toString() {

		No<T> aux = primeiro;
		String to_string = "";
		if (primeiro == null) {
			return "Vazio";
		} else {
			while (aux != null) {
				to_string += "<- " + aux.item + " -> ";
				aux = aux.prox;

			}
			return to_string;
		}
	}

	public int tamanho() {
		return this.tamanho;
	}

	public T remover(int posicao) {

		if (posicao > this.tamanho || posicao < 0) {
			throw new IllegalArgumentException("Erro: posição informada inválida.");
		}

		T noRemovido = null;

		No<T> noAux = primeiro;

		No<T> noAnterior = null;

		int cont = 1;

		while (noAux != null) {

			if (cont == posicao) {

				noRemovido = noAux.item;

				if (primeiro.prox == null && primeiro.ant == null) {
					primeiro = null;

				} else {

					if (noAux.ant == null && noAux.prox != null) {
						
						noAux.prox.ant = null;

						primeiro = noAux.prox;
						

					}
					else if (noAux.prox != null) {

						noAnterior.prox = noAux.prox;
						noAux.prox.ant = noAnterior;

					}

					else {

						noAnterior.prox = null;

					}

				}

				tamanho--;

				break;

			} else {
				noAnterior = noAux;
				noAux = noAux.prox;
				cont++;
			}

		}

		return noRemovido;
	}

	public T get(int index) {

		if (index > this.tamanho || index < 0) {
			throw new IllegalArgumentException("Erro: posição informada inválida.");
		}

		No<T> aux = primeiro;
		No<T> aux2 = null;

		int cont = 1;
		while (cont <= index) {
			aux2 = aux;
			aux = aux.prox;
			cont++;
		}

		return aux2.item;
	}

	public void proximoNo() {

	}

	public void noAnterior() {

	}

}
