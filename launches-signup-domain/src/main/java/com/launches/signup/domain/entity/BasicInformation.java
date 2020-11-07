package com.launches.signup.domain.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author <a href="mailto:dafediegogean@gmail.com">Diego Gean da Fé</a>
 * @version
 * @since 10 de out de 2020, 18:10:14
 */
@Entity
@Table(name = "tb_basic_information")
public class BasicInformation {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@JsonProperty("firstName")
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "second_name")
	private String secondName;
	
	@Column(name = "birth_day")
	private Date birthDay;
	
	@Transient
	private String day;
	
	@Transient
	private String month;
	
	@Transient
	private String year;
	
	@Column(name = "gross_value")
	private BigDecimal grossValue;

	public BasicInformation() {
		
	}
	
	public BasicInformation(Long id, String firstName, String secondName, Date birthDay, String day, String month,
			String year, BigDecimal grossValue) {
		this.id = id;
		this.firstName = firstName;
		this.secondName = secondName;
		this.birthDay = birthDay;
		this.day = day;
		this.month = month;
		this.year = year;
		this.grossValue = grossValue;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public BigDecimal getGrossValue() {
		return grossValue;
	}

	public void setGrossValue(BigDecimal grossValue) {
		this.grossValue = grossValue;
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
		BasicInformation other = (BasicInformation) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BasicInformation [id=" + id + ", firstName=" + firstName + ", secondName=" + secondName + ", birthDay="
				+ birthDay + ", day=" + day + ", month=" + month + ", year=" + year + ", grossValue=" + grossValue
				+ "]";
	}
	
}
