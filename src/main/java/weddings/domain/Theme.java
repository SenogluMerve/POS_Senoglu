package weddings.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

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
@Table(name = "themes")
public class Theme extends BasePersistable{

	private static final long serialVersionUID = -6230315245952824503L;

	@Id
	@NotNull
	private int themeid;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy="theme")
	private Collection<Wedding> weddings;
	
	@NotNull
	@Column(name = "description", nullable = false, length = 255)
	private String description;
	
	@Column(name = "additionalCharge")
	private int additionalCharge; //in Prozent
	
	@Column(name = "color")
	private String color;
	
	protected Theme()
	{}
	
	public Theme(String description, int additionalCharge, String color)
	{
		Ensure.notEmpty("description", description);
		this.description=description;
		this.additionalCharge=additionalCharge;
		this.color=color;
		this.weddings=new ArrayList<>();
	}

	/**
	 * @return the themeid
	 */
	public int getThemeid() {
		return themeid;
	}

	/**
	 * @return the hochzeiten
	 */
	public Collection<Wedding> getHochzeiten() {
		return Collections.unmodifiableCollection(weddings);
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the additionalCharge
	 */
	public int getAdditionalCharge() {
		return additionalCharge;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	
}
