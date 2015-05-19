package br.com.mario.cadastro.modelo;

// Generated 16/05/2015 14:37:37 by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.envers.AuditTable;
import org.hibernate.envers.Audited;

/**
 * Usuario generated by hbm2java
 */
@Audited
@Entity
@Table(name = "USUARIO", catalog = "cadastro")
@AuditTable(value="USUARIO", schema="log", catalog="cadastro")
public class Usuario implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 302528644322739756L;
	private int pesId;
	private Pessoa pessoa;
	private String useSenha;
	private String useLogin;
	private Boolean useAtivo;
	private String useCargo;
	private Set<String> permissao=new HashSet<String>();

	public Usuario() {
	}

	public Usuario(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Usuario(Pessoa pessoa, String useSenha, String useLogin,
			Boolean useAtivo, String useCargo,Set<String> permissao) {
		this.pessoa = pessoa;
		this.useSenha = useSenha;
		this.useLogin = useLogin;
		this.useAtivo = useAtivo;
		this.useCargo = useCargo;
		this.permissao=permissao;	
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "pessoa"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "PES_ID", unique = true, nullable = false)
	public int getPesId() {
		return this.pesId;
	}

	public void setPesId(int pesId) {
		this.pesId = pesId;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Pessoa getPessoa() {
		return this.pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Column(name = "USE_SENHA", length = 900)
	public String getUseSenha() {
		return this.useSenha;
	}

	public void setUseSenha(String useSenha) {
		this.useSenha = useSenha;
	}

	@Column(name = "USE_LOGIN", length = 190)
	public String getUseLogin() {
		return this.useLogin;
	}

	public void setUseLogin(String useLogin) {
		this.useLogin = useLogin;
	}

	@Column(name = "USE_ATIVO")
	public Boolean getUseAtivo() {
		return this.useAtivo;
	}

	public void setUseAtivo(Boolean useAtivo) {
		this.useAtivo = useAtivo;
	}

	@Column(name = "USE_CARGO", length = 90)
	public String getUseCargo() {
		return this.useCargo;
	}

	public void setUseCargo(String useCargo) {
		this.useCargo = useCargo;
	}
	
	@ElementCollection(targetClass = String.class)
	@JoinTable(
	           name = "USUARIO_PERMISSAO", 
			     uniqueConstraints = {@UniqueConstraint(columnNames = {"USUARIO", "PERMISSAO"})}, 
			     joinColumns = @JoinColumn(name = "USUARIO"))
	@Column(name = "PERMISSAO", length = 600)
	public Set<String> getPermissao() {
		return permissao;
	}

	public void setPermissao(Set<String> permissao) {
		this.permissao = permissao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((permissao == null) ? 0 : permissao.hashCode());
		result = prime * result + pesId;
		result = prime * result + ((pessoa == null) ? 0 : pessoa.hashCode());
		result = prime * result
				+ ((useAtivo == null) ? 0 : useAtivo.hashCode());
		result = prime * result
				+ ((useCargo == null) ? 0 : useCargo.hashCode());
		result = prime * result
				+ ((useLogin == null) ? 0 : useLogin.hashCode());
		result = prime * result
				+ ((useSenha == null) ? 0 : useSenha.hashCode());
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
		Usuario other = (Usuario) obj;
		if (permissao == null) {
			if (other.permissao != null)
				return false;
		} else if (!permissao.equals(other.permissao))
			return false;
		if (pesId != other.pesId)
			return false;
		if (pessoa == null) {
			if (other.pessoa != null)
				return false;
		} else if (!pessoa.equals(other.pessoa))
			return false;
		if (useAtivo == null) {
			if (other.useAtivo != null)
				return false;
		} else if (!useAtivo.equals(other.useAtivo))
			return false;
		if (useCargo == null) {
			if (other.useCargo != null)
				return false;
		} else if (!useCargo.equals(other.useCargo))
			return false;
		if (useLogin == null) {
			if (other.useLogin != null)
				return false;
		} else if (!useLogin.equals(other.useLogin))
			return false;
		if (useSenha == null) {
			if (other.useSenha != null)
				return false;
		} else if (!useSenha.equals(other.useSenha))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Usuario [pesId=" + pesId + "]";
	}

}
