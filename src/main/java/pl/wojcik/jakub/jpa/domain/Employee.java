package pl.wojcik.jakub.jpa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name = "Pracownicy")
@SecondaryTable(name = "Adresy", pkJoinColumns = @PrimaryKeyJoinColumn(name = "employeeId"))
public class Employee {
	// wrzucamy do tabeli "pracownicy"
	@Id
	@GeneratedValue
	private long id;

	@Column(name = "imie")
	private String firstName;

	@Column(name = "nazwisko")
	private String lastName;

	@Column(name = "pensja")
	private double salary;

	public Employee() {
		super();
	}

	// wrzucamy do tabeli "adres"
	@Column(table = "Adresy", name = "miejsce_zamieszkania")
	private String locality;

	@Column(table = "Adresy", name = "kod_pocztowy")
	private String zipCode;

	@Column(table = "Adresy", name = "ulica")
	private String street;

	@Column(table = "Adresy", name = "nr_ulicy")
	private int streetNumber;

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
