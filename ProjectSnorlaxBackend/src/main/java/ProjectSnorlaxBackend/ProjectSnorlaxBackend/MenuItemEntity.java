package ProjectSnorlaxBackend.ProjectSnorlaxBackend;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.joda.time.DateTime;

@Entity
public class MenuItemEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    private String name;

    private String description;

    private String section;

    private double price;

    private Date date;

    //METHODS
    protected MenuItemEntity() {}

    public MenuItemEntity(String newName, String newDescription, String newSection, double newPrice, Date newDate) {
    	setName(newName);
    	setDescription(newDescription);
    	setSection(newSection);
    	setPrice(newPrice);
    	setDate(newDate);
    }

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
