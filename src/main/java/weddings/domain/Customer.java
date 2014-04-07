package weddings.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.GregorianCalendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import weddings.Ensure;

@Entity
@Table(name = "customers")
public class Customer extends BasePersistable {

	private static final long serialVersionUID = 3582148538990512161L;

	@Id
	@NotNull
	private int customerid;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy="customer")
	private Collection<Wedding> weddings;
	
	@Column(name = "firstname", length = 255)
	private String firstname;
	
	@NotNull
	@Column(name = "lastname", nullable = false, length = 255)
	private String lastname;
	
	@Column(name = "address", length = 255)
	private String address;
		
	protected Customer()
	{}
	
	public Customer(String firstname, String lastname, String address)
	{
		Ensure.notEmpty("lastname", lastname);
		this.firstname=firstname;
		this.lastname=lastname;
		this.address=address;
		this.weddings = new ArrayList<>();
	}

	/**
	 * @return the vorname
	 */
	public String getVorname() {
		return firstname;
	}

	/**
	 * @return the nachname
	 */
	public String getNachname() {
		return lastname;
	}

	/**
	 * @return the geburtsdatum
	 */
	public GregorianCalendar getGeburtsdatum() {
		return birthdate;
	}

	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return address;
	}

	/**
	 * @return the hochzeiten
	 */
	public Collection<Wedding> getHochzeiten() {
		return Collections.unmodifiableCollection(weddings);
	}
	
	
	
}
