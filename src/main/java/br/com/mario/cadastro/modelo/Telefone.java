package br.com.mario.cadastro.modelo;

// Generated 16/05/2015 14:37:37 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.envers.AuditTable;
import org.hibernate.envers.Audited;

/**
 * Telefone generated by hbm2java
 */
@Audited
@Entity
@Table(name = "TELEFONE", catalog = "cadastro")
@AuditTable(value="TELEFONE", schema="log", catalog="cadastro")
public class Telefone implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3345138542606265786L;
	private int telId;
	private Pessoa pessoa;
	private String telNumero;
	private String telOperadora;
	private Boolean telSms;

	public Telefone() {
	}

	public Telefone(int telId, Pessoa pessoa) {
		this.telId = telId;
		this.pessoa = pessoa;
	}

	public Telefone(int telId, Pessoa pessoa, String telNumero,
			String telOperadora, Boolean telSms) {
		this.telId = telId;
		this.pessoa = pessoa;
		this.telNumero = telNumero;
		this.telOperadora = telOperadora;
		this.telSms = telSms;
	}

	@Id
	@GeneratedValue
	@Column(name = "TEL_ID", unique = true, nullable = false)
	public int getTelId() {
		return this.telId;
	}

	public void setTelId(int telId) {
		this.telId = telId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PES_ID", nullable = false)
	public Pessoa getPessoa() {
		return this.pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Column(name = "TEL_NUMERO", length = 16)
	public String getTelNumero() {
		return this.telNumero;
	}

	public void setTelNumero(String telNumero) {
		this.telNumero = telNumero;
	}

	@Column(name = "TEL_OPERADORA", length = 60)
	public String getTelOperadora() {
		return this.telOperadora;
	}

	public void setTelOperadora(String telOperadora) {
		this.telOperadora = telOperadora;
	}

	@Column(name = "TEL_SMS")
	public Boolean getTelSms() {
		return this.telSms;
	}

	public void setTelSms(Boolean telSms) {
		this.telSms = telSms;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pessoa == null) ? 0 : pessoa.hashCode());
		result = prime * result + telId;
		result = prime * result
				+ ((telNumero == null) ? 0 : telNumero.hashCode());
		result = prime * result
				+ ((telOperadora == null) ? 0 : telOperadora.hashCode());
		result = prime * result + ((telSms == null) ? 0 : telSms.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telefone other = (Telefone) obj;
		if (pessoa == null) {
			if (other.pessoa != null)
				return false;
		} else if (!pessoa.equals(other.pessoa))
			return false;
		if (telId != other.telId)
			return false;
		if (telNumero == null) {
			if (other.telNumero != null)
				return false;
		} else if (!telNumero.equals(other.telNumero))
			return false;
		if (telOperadora == null) {
			if (other.telOperadora != null)
				return false;
		} else if (!telOperadora.equals(other.telOperadora))
			return false;
		if (telSms == null) {
			if (other.telSms != null)
				return false;
		} else if (!telSms.equals(other.telSms))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Telefone [telId=" + telId + "]";
	}

}
