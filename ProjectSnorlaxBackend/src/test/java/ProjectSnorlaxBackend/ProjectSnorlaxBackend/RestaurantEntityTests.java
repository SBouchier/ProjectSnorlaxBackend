package ProjectSnorlaxBackend.ProjectSnorlaxBackend;

import static org.junit.Assert.*;

import org.joda.time.DateTime;
import org.junit.Test;

import ProjectSnorlaxBackend.ProjectSnorlaxBackend.Entities.RestaurantEntity;

public class RestaurantEntityTests {
	
	public RestaurantEntity testCreation(){
		DateTime opening = new DateTime(2008, 6, 25, 12, 00, 00);
		DateTime closing = new DateTime(2008, 6, 25, 3, 00, 00);

		RestaurantEntity restaurant = new RestaurantEntity("City", 22.4, 16.7, opening, closing);
		return restaurant;
	}
	
	@Test
	public void testSetName(){
		RestaurantEntity rest = testCreation();
		assertEquals("City", rest.getName());
		rest.setName("Downtown");
		assertEquals("Downtown", rest.getName());
	}
	
	@Test
	public void testSetLongitude(){
		RestaurantEntity rest = testCreation();
		assertEquals(22.4, rest.getLongitude());
		rest.setLongitude(10.9);
		assertEquals(10.9, rest.getLongitude());
	}
	
	@Test
	public void testSetLatitude(){
		RestaurantEntity rest = testCreation();
		assertEquals(16.7, rest.getLatitude());
		rest.setLongitude(28.3);
		assertEquals(28.3, rest.getLatitude());
	}
	
	@Test
	public void testSetOpeningTime(){
		RestaurantEntity rest = testCreation();
		DateTime opening = new DateTime(2008, 6, 25, 12, 00, 00);
		assertEquals(opening, rest.getOpening_time());
		
		DateTime newOpening = new DateTime(2030, 8, 15, 11, 30, 15);
		rest.setOpening_time(newOpening);
		assertEquals(newOpening, rest.getOpening_time());
	}
	
	@Test
	public void testSetClosingTime(){
		RestaurantEntity rest = testCreation();
		DateTime closing = new DateTime(2008, 6, 25, 3, 00, 00);
		assertEquals(closing, rest.getClosing_time());
		
		DateTime newClosing = new DateTime(2030, 8, 15, 18, 15, 59);
		rest.setClosing_time(newClosing);
		assertEquals(newClosing, rest.getClosing_time());
	}
}