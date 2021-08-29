package com.aksonenko.cars_data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cars")
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "person")
	private String person;

	@Column(name = "reg_addr_koatuu")
	private long regAddrKoatuu;

	@Column(name = "oper_code")
	private int operCode;

	@Column(name = "oper_name")
	private String operName;

	@Column(name = "d_reg")
	private String dReg;

	@Column(name = "dep_code")
	private int depCode;

	@Column(name = "dep")
	private String dep;

	@Column(name = "brand")
	private String brand;

	@Column(name = "model")
	private String model;

	@Column(name = "vin")
	private String vin;

	@Column(name = "make_year")
	private int makeYear;

	@Column(name = "color")
	private String color;

	@Column(name = "kind")
	private String kind;

	@Column(name = "body")
	private String body;

	@Column(name = "purpose")
	private String purpose;

	@Column(name = "fuel")
	private String fuel;

	@Column(name = "capacity")
	private int capacity;

	@Column(name = "own_weight")
	private int ownWeight;

	@Column(name = "total_weight")
	private int totalWeight;

	@Column(name = "n_reg_new")
	private String nRegNew;

	public Car() {
	}

	private Car(String person, int regAddrKoatuu, int operCode, String operName, String dReg, int depCode, String dep,
			String brand, String model, String vin, int makeYear, String color, String kind, String body,
			String purpose, String fuel, int capacity, int ownWeight, int totalWeight, String nRegNew) {
		this.person = person;
		this.regAddrKoatuu = regAddrKoatuu;
		this.operCode = operCode;
		this.operName = operName;
		this.dReg = dReg;
		this.depCode = depCode;
		this.dep = dep;
		this.brand = brand;
		this.model = model;
		this.vin = vin;
		this.makeYear = makeYear;
		this.color = color;
		this.kind = kind;
		this.body = body;
		this.purpose = purpose;
		this.fuel = fuel;
		this.capacity = capacity;
		this.ownWeight = ownWeight;
		this.totalWeight = totalWeight;
		this.nRegNew = nRegNew;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public long getRegAddrKoatuu() {
		return regAddrKoatuu;
	}

	public void setRegAddrKoatuu(long regAddrKoatuu) {
		this.regAddrKoatuu = regAddrKoatuu;
	}

	public int getOperCode() {
		return operCode;
	}

	public void setOperCode(int operCode) {
		this.operCode = operCode;
	}

	public String getOperName() {
		return operName;
	}

	public void setOperName(String operName) {
		this.operName = operName;
	}

	public String getdReg() {
		return dReg;
	}

	public void setdReg(String dReg) {
		this.dReg = dReg;
	}

	public int getDepCode() {
		return depCode;
	}

	public void setDepCode(int depCode) {
		this.depCode = depCode;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public int getMakeYear() {
		return makeYear;
	}

	public void setMakeYear(int makeYear) {
		this.makeYear = makeYear;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getOwnWeight() {
		return ownWeight;
	}

	public void setOwnWeight(int ownWeight) {
		this.ownWeight = ownWeight;
	}

	public int getTotalWeight() {
		return totalWeight;
	}

	public void setTotalWeight(int totalWeight) {
		this.totalWeight = totalWeight;
	}

	public String getnRegNew() {
		return nRegNew;
	}

	public void setnRegNew(String nRegNew) {
		this.nRegNew = nRegNew;
	}

	
}
