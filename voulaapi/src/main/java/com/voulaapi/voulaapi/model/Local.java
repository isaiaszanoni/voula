package com.voulaapi.voulaapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_local")
public class Local {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLocal;

	@NotBlank
	private String nomeLocal;

	@NotBlank
	private String ruaLocal;

	@NotNull
	private int numeroLocal;

	@NotBlank
	private String bairroLocal;

	@NotBlank
	@Size(min = 8, max = 8)
	private String cepLocal;

	@NotBlank
	private String cidadeLocal;

	@NotBlank
	private String EstadoLocal;

	@NotNull
	private int mediaLocal;

	@NotBlank
	private String descricaoLocal;

	public Long getIdLocal() {
		return idLocal;
	}

	public void setIdLocal(Long idLocal) {
		this.idLocal = idLocal;
	}

	public String getNomeLocal() {
		return nomeLocal;
	}

	public void setNomeLocal(String nomeLocal) {
		this.nomeLocal = nomeLocal;
	}

	public String getRuaLocal() {
		return ruaLocal;
	}

	public void setRuaLocal(String ruaLocal) {
		this.ruaLocal = ruaLocal;
	}

	public int getNumeroLocal() {
		return numeroLocal;
	}

	public void setNumeroLocal(int numeroLocal) {
		this.numeroLocal = numeroLocal;
	}

	public String getBairroLocal() {
		return bairroLocal;
	}

	public void setBairroLocal(String bairroLocal) {
		this.bairroLocal = bairroLocal;
	}

	public String getCepLocal() {
		return cepLocal;
	}

	public void setCepLocal(String cepLocal) {
		this.cepLocal = cepLocal;
	}

	public String getCidadeLocal() {
		return cidadeLocal;
	}

	public void setCidadeLocal(String cidadeLocal) {
		this.cidadeLocal = cidadeLocal;
	}

	public String getEstadoLocal() {
		return EstadoLocal;
	}

	public void setEstadoLocal(String estadoLocal) {
		EstadoLocal = estadoLocal;
	}

	public void setMediaLocal(int mediaLocal) {
		this.mediaLocal = mediaLocal;
	}

	public Integer getMediaLocal() {
		return mediaLocal;
	}

	public void setMediaLocal(Integer mediaLocal) {
		this.mediaLocal = mediaLocal;
	}

	public String getDescricaoLocal() {
		return descricaoLocal;
	}

	public void setDescricaoLocal(String descricaoLocal) {
		this.descricaoLocal = descricaoLocal;
	}
	
	

}
