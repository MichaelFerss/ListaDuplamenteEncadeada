
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		ListaDuplamenteEncadeada<String> nomes = new ListaDuplamenteEncadeada<String>();
		
		nomes.add("Michael");
		nomes.add("Maria");
		nomes.add("Fernando");
		
		System.out.println(nomes.toString());
		
		nomes.remover(3);

		System.out.println(nomes.toString());
		

		nomes.remover(1);

		System.out.println(nomes.toString());
		

		nomes.remover(1);

		System.out.println(nomes.toString());
		
	}

}
