package com.algaworks.festa.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Convidado implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	
	private Integer qtdeAcompanhantes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQtdeAcompanhantes() {
		return qtdeAcompanhantes;
	}

	public void setQtdeAcompanhantes(Integer qtdeAcompanhantes) {
		this.qtdeAcompanhantes = qtdeAcompanhantes;
	}
	
	

}
