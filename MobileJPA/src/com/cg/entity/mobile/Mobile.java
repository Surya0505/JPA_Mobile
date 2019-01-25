package com.cg.entity.mobile;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "mobileDetails")
public class Mobile {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int mobileId;
	private String mobileName;
	private double price;
	@Transient
	private String imeiNo;

	public Mobile() {
		// TODO Auto-generated constructor stub
	}

	public int getMobileId() {
		return mobileId;
	}

	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImeiNo() {
		return imeiNo;
	}

	public void setImeiNo(String imeiNo) {
		this.imeiNo = imeiNo;
	}

	@Override
	public String toString() {
		return "Mobile [mobileId=" + mobileId + ", mobileName=" + mobileName + ", price=" + price + ", imeiNo=" + imeiNo
				+ "]";
	}

	
}
