package weddings.emp;

import java.util.Date;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class WeddingPlanner extends Employee {
	
	private static final long serialVersionUID = 3389987177376360308L;

	private Integer vacationDays;

	protected WeddingPlanner()
	{}

	public WeddingPlanner(String name, Date startDate, int age, Integer vacationDays) {
		super(name, startDate, age);
		this.vacationDays = vacationDays;
	}

	public Integer getVacationDays() {
		return vacationDays;
	}
}
