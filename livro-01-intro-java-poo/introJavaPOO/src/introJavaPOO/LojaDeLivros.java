package introJavaPOO;

public class LojaDeLivros {

	public static void main(String[] args) {
		Autor autor = new Autor();

		autor.setNome("Jean Santos");
		autor.setEmail("email@email.com");
		autor.setCpf("12312312312");

		Livro livro = new LivroFisico(autor);
		livro.setNome("Java 8");
		livro.setDescricao("Novos recursos da linguagem");
		livro.setValor(59.90);
		livro.setIsbn("123456789");
		livro.mostrarDetalhes();

		Ebook ebook = new Ebook(autor);
		ebook.setValor(29.90);
		ebook.setNome("Java 11");
		ebook.setDescricao("Novíssimas adições a linguagem java!");
		ebook.mostrarDetalhes();

		Editora editora = new Editora();
		
		editora.setNomeFantasia("Javilson");
		editora.setCnpj("123456789123000");
		editora.setRazaoSocial("Racional da favela");
		
		Revista revista = new Revista();

		revista.setNome("Novidades Java");
		revista.setDescricao("Tudo de novo na linguagem mais usada!");
		revista.setValor(10);
		revista.setEditora(editora);

		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

		carrinhoDeCompras.adiciona(livro);
		carrinhoDeCompras.adiciona(ebook);
		carrinhoDeCompras.adiciona(revista);
		System.out.println(carrinhoDeCompras.getTotal());
	}

}
