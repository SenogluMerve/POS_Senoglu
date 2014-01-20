package weddings.emp;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class FullTime extends WeddingPlanner {
	
	private static final long serialVersionUID = 5028767353657474061L;

	private Long salary;
	
	private int hours;

	protected FullTime() 
	{}

	public FullTime(String name, Date startDate, int age, Integer vacationDays, Long salary, int hours) {
		super(name, startDate, age, vacationDays);
		this.salary=salary;
		this.hours=hours;
	}

	public Long getSalary() {
		return salary;
	}

	/**
	 * @return the hours
	 */
	public int getHours() {
		return hours;
	}
	
}
