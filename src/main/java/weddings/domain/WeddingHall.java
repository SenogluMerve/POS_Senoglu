package weddings.domain;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "weddinghalls")
public class WeddingHall extends BasePersistable{

	private static final long serialVersionUID = 5726485175799420644L;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy="weddingHall")
	private Collection<Wedding> weddings;
	
	@Column(name = "accommodations")
	private int accommodations;
	
	@Column(name = "costsPerHour")
	private int costsPerHour;
	
	protected WeddingHall()
	{}
	
	public WeddingHall(int accommodations, int costsPerHour)
	{
		this.accommodations=accommodations;
		this.costsPerHour=costsPerHour;
		this.weddings=new ArrayList<>();
	}

	/**
	 * @return the accommodations
	 */
	public int getAccommodations() {
		return accommodations;
	}

	/**
	 * @return the costsPerHour
	 */
	public int getCostsPerHour() {
		return costsPerHour;
	}
	
	
}
