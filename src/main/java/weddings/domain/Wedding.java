package weddings.domain;

import java.util.GregorianCalendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import weddings.Ensure;

@Entity
@Table(name = "weddings")
public class Wedding extends BasePersistable{
	
	private static final long serialVersionUID = -8356656993335631026L;

	private final Logger log = LoggerFactory.getLogger(Wedding.class);
	
	@Id
	@NotNull
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "customer_id")
	private Customer customer; 
	
	@Id
	@NotNull
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "wedding_hall_id")
	private WeddingHall weddingHall;
	
	@Id
	@NotNull
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "theme_id")
	private Theme theme;
	
	@Column(name = "day")
	private GregorianCalendar day;
	
	@Column(name = "discount")
	private int discount;
	
	protected Wedding()
	{}
	
	public Wedding(Customer customer, WeddingHall weddingHall, Theme theme, GregorianCalendar day, int discount)
	{
		Ensure.notNull("customer", customer);
		Ensure.notNull("weddingHall", weddingHall);
		Ensure.notNull("theme", theme);
		this.customer=customer;
		this.weddingHall=weddingHall;
		this.theme=theme;
		this.day=day;
		this.discount=discount;
	}
	
	public Wedding(int discount) //logging
	{
		if(discount<0)
		{
			log.info("Sorry, but discount must be >= 0 but is {}", discount);
		}
		else
			this.discount=discount;
	}
	
	//zum testen ob die Logging message auch ausgegeben wird
	public static void main(String[] args) {
    	@SuppressWarnings("unused")
		Wedding h=new Wedding(-3);
    }

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @return the weddingHall
	 */
	public WeddingHall getWeddingHall() {
		return weddingHall;
	}

	/**
	 * @return the theme
	 */
	public Theme getTheme() {
		return theme;
	}

	/**
	 * @return the day
	 */
	public GregorianCalendar getDay() {
		return day;
	}

	/**
	 * @return the discount
	 */
	public int getDiscount() {
		return discount;
	}
   
	
}
