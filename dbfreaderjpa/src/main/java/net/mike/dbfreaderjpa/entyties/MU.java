package net.mike.dbfreaderjpa.entyties;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="MU")
@NamedQuery(name = "MU.getAll", query = "SELECT c FROM MU c")

public class MU implements Serializable  {
	@Id
	private int id;
	@Column(name="MD_TOVAR")
	private String md_tovar;
	@Column(name="NAME")
	private String name;
	@Column(name="CODE_1C")
	private String code_1c;
	@Column(name="CODE_L")
	private String code_l;
	@Column(name="CODE_P")
	private String code_p;
	@Column(name="CODE_A1")
	private String code_a1;
	@Column(name="FIRMA")
	private String firma;
	@Column(name="PRIMEN")
	private String primen;
	@Column(name="PRICE_1")
	private String price_1;
	@Column(name="PRICE_2")
	private String price_2;
	@Column(name="PRICE_3")
	private String price_3;
	@Column(name="SKLAD")
	private String sklad;
	@Column(name="PROD")
	private String prod;
	@Column(name="PEREMES")
	private String peremes;
	@Column(name="OSTATOK")
	private String ostatok;
	@Column(name="NEWTOVAR")
	private String newtovar;
	@Column(name="DATAPRIH")
	private Date dataprih;
	@Column(name="POSTAV")
	private Date postav;
	
	@Column(name="PRICE")
	private String price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMd_tovar() {
		return md_tovar;
	}

	public void setMd_tovar(String md_tovar) {
		this.md_tovar = md_tovar;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode_1c() {
		return code_1c;
	}

	public void setCode_1c(String code_1c) {
		this.code_1c = code_1c;
	}

	public String getCode_l() {
		return code_l;
	}

	public void setCode_l(String code_l) {
		this.code_l = code_l;
	}

	public String getCode_p() {
		return code_p;
	}

	public void setCode_p(String code_p) {
		this.code_p = code_p;
	}

	public String getCode_a1() {
		return code_a1;
	}

	public void setCode_a1(String code_a1) {
		this.code_a1 = code_a1;
	}

	public String getFirma() {
		return firma;
	}

	public void setFirma(String firma) {
		this.firma = firma;
	}

	public String getPrimen() {
		return primen;
	}

	public void setPrimen(String primen) {
		this.primen = primen;
	}

	public String getPrice_1() {
		return price_1;
	}

	public void setPrice_1(String price_1) {
		this.price_1 = price_1;
	}

	public String getPrice_2() {
		return price_2;
	}

	public void setPrice_2(String price_2) {
		this.price_2 = price_2;
	}

	public String getPrice_3() {
		return price_3;
	}

	public void setPrice_3(String price_3) {
		this.price_3 = price_3;
	}

	public String getSklad() {
		return sklad;
	}

	public void setSklad(String sklad) {
		this.sklad = sklad;
	}

	public String getProd() {
		return prod;
	}

	public void setProd(String prod) {
		this.prod = prod;
	}

	public String getPeremes() {
		return peremes;
	}

	public void setPeremes(String peremes) {
		this.peremes = peremes;
	}

	public String getOstatok() {
		return ostatok;
	}

	public void setOstatok(String ostatok) {
		this.ostatok = ostatok;
	}

	public String getNewtovar() {
		return newtovar;
	}

	public void setNewtovar(String newtovar) {
		this.newtovar = newtovar;
	}

	public Date getDataprih() {
		return dataprih;
	}

	public void setDataprih(Date dataprih) {
		this.dataprih = dataprih;
	}

	public Date getPostav() {
		return postav;
	}

	public void setPostav(Date postav) {
		this.postav = postav;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code_1c == null) ? 0 : code_1c.hashCode());
		result = prime * result + ((code_a1 == null) ? 0 : code_a1.hashCode());
		result = prime * result + ((code_l == null) ? 0 : code_l.hashCode());
		result = prime * result + ((code_p == null) ? 0 : code_p.hashCode());
		result = prime * result + ((dataprih == null) ? 0 : dataprih.hashCode());
		result = prime * result + ((firma == null) ? 0 : firma.hashCode());
		result = prime * result + id;
		result = prime * result + ((md_tovar == null) ? 0 : md_tovar.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((newtovar == null) ? 0 : newtovar.hashCode());
		result = prime * result + ((ostatok == null) ? 0 : ostatok.hashCode());
		result = prime * result + ((peremes == null) ? 0 : peremes.hashCode());
		result = prime * result + ((postav == null) ? 0 : postav.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((price_1 == null) ? 0 : price_1.hashCode());
		result = prime * result + ((price_2 == null) ? 0 : price_2.hashCode());
		result = prime * result + ((price_3 == null) ? 0 : price_3.hashCode());
		result = prime * result + ((primen == null) ? 0 : primen.hashCode());
		result = prime * result + ((prod == null) ? 0 : prod.hashCode());
		result = prime * result + ((sklad == null) ? 0 : sklad.hashCode());
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
		MU other = (MU) obj;
		if (code_1c == null) {
			if (other.code_1c != null)
				return false;
		} else if (!code_1c.equals(other.code_1c))
			return false;
		if (code_a1 == null) {
			if (other.code_a1 != null)
				return false;
		} else if (!code_a1.equals(other.code_a1))
			return false;
		if (code_l == null) {
			if (other.code_l != null)
				return false;
		} else if (!code_l.equals(other.code_l))
			return false;
		if (code_p == null) {
			if (other.code_p != null)
				return false;
		} else if (!code_p.equals(other.code_p))
			return false;
		if (dataprih == null) {
			if (other.dataprih != null)
				return false;
		} else if (!dataprih.equals(other.dataprih))
			return false;
		if (firma == null) {
			if (other.firma != null)
				return false;
		} else if (!firma.equals(other.firma))
			return false;
		if (id != other.id)
			return false;
		if (md_tovar == null) {
			if (other.md_tovar != null)
				return false;
		} else if (!md_tovar.equals(other.md_tovar))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (newtovar == null) {
			if (other.newtovar != null)
				return false;
		} else if (!newtovar.equals(other.newtovar))
			return false;
		if (ostatok == null) {
			if (other.ostatok != null)
				return false;
		} else if (!ostatok.equals(other.ostatok))
			return false;
		if (peremes == null) {
			if (other.peremes != null)
				return false;
		} else if (!peremes.equals(other.peremes))
			return false;
		if (postav == null) {
			if (other.postav != null)
				return false;
		} else if (!postav.equals(other.postav))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (price_1 == null) {
			if (other.price_1 != null)
				return false;
		} else if (!price_1.equals(other.price_1))
			return false;
		if (price_2 == null) {
			if (other.price_2 != null)
				return false;
		} else if (!price_2.equals(other.price_2))
			return false;
		if (price_3 == null) {
			if (other.price_3 != null)
				return false;
		} else if (!price_3.equals(other.price_3))
			return false;
		if (primen == null) {
			if (other.primen != null)
				return false;
		} else if (!primen.equals(other.primen))
			return false;
		if (prod == null) {
			if (other.prod != null)
				return false;
		} else if (!prod.equals(other.prod))
			return false;
		if (sklad == null) {
			if (other.sklad != null)
				return false;
		} else if (!sklad.equals(other.sklad))
			return false;
		return true;
	}
	
	
	
}
