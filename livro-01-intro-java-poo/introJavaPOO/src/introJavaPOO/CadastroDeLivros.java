package introJavaPOO;

public class CadastroDeLivros {

	public static void main(String[] args) {
		Autor autor = new Autor();

		autor.setNome("Jean Santos");
		autor.setEmail("email@email.com");
		autor.setCpf("12312312312");

		Livro livro = new Livro(autor);

		livro.setNome("Java 8");
		livro.setDescricao("Novos recursos da linguagem");
		livro.setValor(59.90);
		livro.setIsbn("123456789");
		

		livro.mostrarDetalhes();

		livro.aplicaDescontoDe(.1);

		livro.mostrarDetalhes();

	}

}
