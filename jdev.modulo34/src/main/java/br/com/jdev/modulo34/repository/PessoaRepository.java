package br.com.jdev.modulo34.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.jdev.modulo34.entity.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

	/**
	 * Consulta customizada para pesquisar por parte do nome
	 * 
	 * @param nome
	 * @return
	 */
	@Query("select p from Pessoa p where p.nome like %?1%") 
	List<Pessoa> findPessoaByName(String nome);
}
