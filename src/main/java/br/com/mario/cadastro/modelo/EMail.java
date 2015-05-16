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

/**
 * EMail generated by hbm2java
 */
@Entity
@Table(name = "E_MAIL", catalog = "cadastro")
public class EMail implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8964067840305650280L;
	private int maiId;
	private Pessoa pessoa;
	private String maiEndereco;
	private Boolean maiSpam;

	public EMail() {
	}

	public EMail(int maiId, Pessoa pessoa) {
		this.maiId = maiId;
		this.pessoa = pessoa;
	}

	public EMail(int maiId, Pessoa pessoa, String maiEndereco, Boolean maiSpam) {
		this.maiId = maiId;
		this.pessoa = pessoa;
		this.maiEndereco = maiEndereco;
		this.maiSpam = maiSpam;
	}

	@Id
	@GeneratedValue
	@Column(name = "MAI_ID", unique = true, nullable = false)
	public int getMaiId() {
		return this.maiId;
	}

	public void setMaiId(int maiId) {
		this.maiId = maiId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PES_ID", nullable = false)
	public Pessoa getPessoa() {
		return this.pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Column(name = "MAI_ENDERECO", length = 200)
	public String getMaiEndereco() {
		return this.maiEndereco;
	}

	public void setMaiEndereco(String maiEndereco) {
		this.maiEndereco = maiEndereco;
	}

	@Column(name = "MAI_SPAM")
	public Boolean getMaiSpam() {
		return this.maiSpam;
	}

	public void setMaiSpam(Boolean maiSpam) {
		this.maiSpam = maiSpam;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((maiEndereco == null) ? 0 : maiEndereco.hashCode());
		result = prime * result + maiId;
		result = prime * result + ((maiSpam == null) ? 0 : maiSpam.hashCode());
		result = prime * result + ((pessoa == null) ? 0 : pessoa.hashCode());
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
		EMail other = (EMail) obj;
		if (maiEndereco == null) {
			if (other.maiEndereco != null)
				return false;
		} else if (!maiEndereco.equals(other.maiEndereco))
			return false;
		if (maiId != other.maiId)
			return false;
		if (maiSpam == null) {
			if (other.maiSpam != null)
				return false;
		} else if (!maiSpam.equals(other.maiSpam))
			return false;
		if (pessoa == null) {
			if (other.pessoa != null)
				return false;
		} else if (!pessoa.equals(other.pessoa))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EMail [maiId=" + maiId + "]";
	}

}