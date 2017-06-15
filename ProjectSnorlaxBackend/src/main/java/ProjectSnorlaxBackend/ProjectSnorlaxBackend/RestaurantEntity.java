package ProjectSnorlaxBackend.ProjectSnorlaxBackend;

import java.sql.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.joda.time.DateTime;

public class RestaurantEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private String name;

	private double longitude;

	private	double latitude;

	private DateTime opening_time;

	private DateTime closing_time;

	public RestaurantEntity(String name, double longitude, double latitude, DateTime opening_time, DateTime closing_time){
		setName(name);
		setLongitude(longitude);
		setLatitude(latitude);
		setOpening_time(opening_time);
		setClosing_time(closing_time);
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

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public DateTime getOpening_time() {
		return opening_time;
	}

	public void setOpening_time(DateTime opening_time) {
		this.opening_time = opening_time;
	}

	public DateTime getClosing_time() {
		return closing_time;
	}

	public void setClosing_time(DateTime closing_time) {
		this.closing_time = closing_time;
	}
}