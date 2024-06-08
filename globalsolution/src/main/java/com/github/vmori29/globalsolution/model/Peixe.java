package com.github.vmori29.globalsolution.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "peixes")
public class Peixe extends AbstractEntity<Long> {

	@Column(nullable = false, length = 100)
	private String nome;

	@Column(nullable = false, length = 100)
	private String descricao;

	@Column(nullable = false, length = 100)
	private Long peso_max;

	@Column(columnDefinition = "DATE")
	private LocalDate data;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Long getPeso_max() {
		return peso_max;
	}

	public void setPeso_max(Long peso_max) {
		this.peso_max = peso_max;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

}