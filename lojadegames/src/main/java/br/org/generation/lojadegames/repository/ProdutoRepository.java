package br.org.generation.lojadegames.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.generation.lojadegames.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);

	//Método para buscar produto com valor maior que o digitado em ordem crescente	 
	public List <Produto> findByPrecoGreaterThanOrderByPreco(BigDecimal preco);

	//Método para buscar produto com valor menor que o digitado em ordem decrescente	 
	public List <Produto> findByPrecoLessThanOrderByPrecoDesc(BigDecimal preco);

}
