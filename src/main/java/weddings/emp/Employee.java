package weddings.emp;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import weddings.domain.BasePersistable;


@Entity
@Table(name = "employees")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Employee extends BasePersistable {
	
	private static final long serialVersionUID = 5141355714467083790L;

	private String name;

	private Date startDate;
	
	private int age;

	protected Employee() {
	}

	public Employee(String name, Date startDate, int age) {
		this.name=name;
		this.startDate=(Date)startDate.clone();
		this.age=age;
	}

	public String getName() {
		return name;
	}

	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	

}
