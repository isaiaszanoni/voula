package com.voulaapi.voulaapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "tb_avaliacao")
public class Avaliacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idAvaliacao;
	
	@NotBlank
	private String descriAvaliacao;
	
	@NotBlank 
	private long geralAvaliacao;
	
	private boolean corrimaoAvaliacao;
	
	private boolean rampaAvaliacao;
	
	private boolean pisoAvaliacao;
	
	private boolean transAvaliacao;
	
	private boolean cegasAvaliacao;
	
	private boolean surdasAvaliacao;
	
	private boolean mobiliAvaliacao;
	
	private boolean violenciaRacialAvaliacao;
	
	private boolean machismoAvaliacao;
	
	private boolean lbgtfobiaAvaliacao;

	public long getIdAvaliacao() {
		return idAvaliacao;
	}

	public void setIdAvaliacao(long idAvaliacao) {
		this.idAvaliacao = idAvaliacao;
	}

	public String getDescriAvaliacao() {
		return descriAvaliacao;
	}

	public void setDescriAvaliacao(String descriAvaliacao) {
		this.descriAvaliacao = descriAvaliacao;
	}

	public long getGeralAvaliacao() {
		return geralAvaliacao;
	}

	public void setGeralAvaliacao(long geralAvaliacao) {
		this.geralAvaliacao = geralAvaliacao;
	}

	public boolean isCorrimaoAvaliacao() {
		return corrimaoAvaliacao;
	}

	public void setCorrimaoAvaliacao(boolean corrimaoAvaliacao) {
		this.corrimaoAvaliacao = corrimaoAvaliacao;
	}

	public boolean isRampaAvaliacao() {
		return rampaAvaliacao;
	}

	public void setRampaAvaliacao(boolean rampaAvaliacao) {
		this.rampaAvaliacao = rampaAvaliacao;
	}

	public boolean isPisoAvaliacao() {
		return pisoAvaliacao;
	}

	public void setPisoAvaliacao(boolean pisoAvaliacao) {
		this.pisoAvaliacao = pisoAvaliacao;
	}

	public boolean isTransAvaliacao() {
		return transAvaliacao;
	}

	public void setTransAvaliacao(boolean transAvaliacao) {
		this.transAvaliacao = transAvaliacao;
	}

	public boolean isCegasAvaliacao() {
		return cegasAvaliacao;
	}

	public void setCegasAvaliacao(boolean cegasAvaliacao) {
		this.cegasAvaliacao = cegasAvaliacao;
	}

	public boolean isSurdasAvaliacao() {
		return surdasAvaliacao;
	}

	public void setSurdasAvaliacao(boolean surdasAvaliacao) {
		this.surdasAvaliacao = surdasAvaliacao;
	}

	public boolean isMobiliAvaliacao() {
		return mobiliAvaliacao;
	}

	public void setMobiliAvaliacao(boolean mobiliAvaliacao) {
		this.mobiliAvaliacao = mobiliAvaliacao;
	}

	public boolean isViolenciaRacialAvaliacao() {
		return violenciaRacialAvaliacao;
	}

	public void setViolenciaRacialAvaliacao(boolean violenciaRacialAvaliacao) {
		this.violenciaRacialAvaliacao = violenciaRacialAvaliacao;
	}

	public boolean isMachismoAvaliacao() {
		return machismoAvaliacao;
	}

	public void setMachismoAvaliacao(boolean machismoAvaliacao) {
		this.machismoAvaliacao = machismoAvaliacao;
	}

	public boolean isLbgtfobiaAvaliacao() {
		return lbgtfobiaAvaliacao;
	}

	public void setLbgtfobiaAvaliacao(boolean lbgtfobiaAvaliacao) {
		this.lbgtfobiaAvaliacao = lbgtfobiaAvaliacao;
	}
	
	

}
