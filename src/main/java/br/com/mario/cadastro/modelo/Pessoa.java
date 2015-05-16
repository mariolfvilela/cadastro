package br.com.mario.cadastro.modelo;

// Generated 16/05/2015 14:37:37 by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Pessoa generated by hbm2java
 */
@Entity
@Table(name = "PESSOA", catalog = "cadastro")
public class Pessoa implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7425661327958224487L;
	private int pesId;
	private String pesNome;
	private Set<Telefone> telefones = new HashSet<Telefone>(0);
	private Set<EMail> EMails = new HashSet<EMail>(0);
	private Endereco endereco;
	private PessoaJuridica pessoaJuridica;
	private Vendedor vendedor;
	private Cliente cliente;
	private Usuario usuario;
	private PessoaFisica pessoaFisica;

	public Pessoa() {
	}

	public Pessoa(int pesId) {
		this.pesId = pesId;
	}

	public Pessoa(int pesId, String pesNome, Set<Telefone> telefones,
			Set<EMail> EMails, Endereco endereco,
			PessoaJuridica pessoaJuridica, Vendedor vendedor, Cliente cliente,
			Usuario usuario, PessoaFisica pessoaFisica) {
		this.pesId = pesId;
		this.pesNome = pesNome;
		this.telefones = telefones;
		this.EMails = EMails;
		this.endereco = endereco;
		this.pessoaJuridica = pessoaJuridica;
		this.vendedor = vendedor;
		this.cliente = cliente;
		this.usuario = usuario;
		this.pessoaFisica = pessoaFisica;
	}

	@Id
	@GeneratedValue
	@Column(name = "PES_ID", unique = true, nullable = false)
	public int getPesId() {
		return this.pesId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setPesId(int pesId) {
		this.pesId = pesId;
	}

	@Column(name = "PES_NOME", length = 81)
	public String getPesNome() {
		return this.pesNome;
	}

	public void setPesNome(String pesNome) {
		this.pesNome = pesNome;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pessoa")
	public Set<Telefone> getTelefones() {
		return this.telefones;
	}

	public void setTelefones(Set<Telefone> telefones) {
		this.telefones = telefones;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pessoa")
	public Set<EMail> getEMails() {
		return this.EMails;
	}

	public void setEMails(Set<EMail> EMails) {
		this.EMails = EMails;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "pessoa")
	public Endereco getEndereco() {
		return this.endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "pessoa")
	public PessoaJuridica getPessoaJuridica() {
		return this.pessoaJuridica;
	}

	public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
		this.pessoaJuridica = pessoaJuridica;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "pessoa")
	public Vendedor getVendedor() {
		return this.vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "pessoa")
	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "pessoa")
	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "pessoa")
	public PessoaFisica getPessoaFisica() {
		return this.pessoaFisica;
	}

	public void setPessoaFisica(PessoaFisica pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((EMails == null) ? 0 : EMails.hashCode());
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result
				+ ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + pesId;
		result = prime * result + ((pesNome == null) ? 0 : pesNome.hashCode());
		result = prime * result
				+ ((pessoaFisica == null) ? 0 : pessoaFisica.hashCode());
		result = prime * result
				+ ((pessoaJuridica == null) ? 0 : pessoaJuridica.hashCode());
		result = prime * result
				+ ((telefones == null) ? 0 : telefones.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
		result = prime * result
				+ ((vendedor == null) ? 0 : vendedor.hashCode());
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
		Pessoa other = (Pessoa) obj;
		if (EMails == null) {
			if (other.EMails != null)
				return false;
		} else if (!EMails.equals(other.EMails))
			return false;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (pesId != other.pesId)
			return false;
		if (pesNome == null) {
			if (other.pesNome != null)
				return false;
		} else if (!pesNome.equals(other.pesNome))
			return false;
		if (pessoaFisica == null) {
			if (other.pessoaFisica != null)
				return false;
		} else if (!pessoaFisica.equals(other.pessoaFisica))
			return false;
		if (pessoaJuridica == null) {
			if (other.pessoaJuridica != null)
				return false;
		} else if (!pessoaJuridica.equals(other.pessoaJuridica))
			return false;
		if (telefones == null) {
			if (other.telefones != null)
				return false;
		} else if (!telefones.equals(other.telefones))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		if (vendedor == null) {
			if (other.vendedor != null)
				return false;
		} else if (!vendedor.equals(other.vendedor))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pessoa [pesId=" + pesId + "]";
	}

}