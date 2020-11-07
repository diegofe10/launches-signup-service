package com.launches.signup.domain.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author <a href="mailto:dafediegogean@gmail.com">Diego Gean da Fé</a>
 * @version
 * @since 07 de nov de 2020, 12:54:10
 */
@Entity
@Table(name = "tb_launche")
public class Launche implements Serializable {
	
	/**
	 * Serial UID
	 */
	private static final long serialVersionUID = -584309795221244248L;
	
	private Long id;
	
	private String descricao;
	
	private BigDecimal value;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Launche other = (Launche) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Launches [id=" + id + ", descricao=" + descricao + ", value=" + value + "]";
	}
	
}
