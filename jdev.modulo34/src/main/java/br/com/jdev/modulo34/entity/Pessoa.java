package br.com.jdev.modulo34.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Data - Gera automaticamente getters, setters, toString, equals e hashCode
 * @NoArgsConstructor - Construtor sem parâmetros
 * @AllArgsConstructor - Construtor com todos os parâmetros
 * @Builder - Padrão Builder para criação de objetos
 * @EqualsAndHashCode(onlyExplicitlyIncluded = true)Controla quais campos usar no equals/hashCode
 * @ToString - Gera toString automaticamente
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String sobrenome;
	private int idade;

}
