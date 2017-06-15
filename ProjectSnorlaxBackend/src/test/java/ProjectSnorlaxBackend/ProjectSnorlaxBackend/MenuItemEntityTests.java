package ProjectSnorlaxBackend.ProjectSnorlaxBackend;

import java.sql.Date;
import org.junit.Test;
import junit.framework.TestCase;

public class MenuItemEntityTests extends TestCase {

	@Test
	public MenuItemEntity testCreation() {
		Date date = new Date(2008,6,25);
		MenuItemEntity menu = new MenuItemEntity("Pasta", "Raw pasta. Yuck.", "Cheap Bargains", 0.50, date);
		assertNotNull(menu);
		return menu;
	}
	
	@Test
	public void testSetName(){
		MenuItemEntity tempMenu = testCreation();
		assertEquals("Pasta", tempMenu.getName());
		tempMenu.setName("Luxury Pasta");
		assertEquals("Luxury Pasta", tempMenu.getName());
	}
	
	@Test
	public void testSetDescription(){
		MenuItemEntity tempMenu = testCreation();
		assertEquals("Raw pasta. Yuck.", tempMenu.getDescription());
		tempMenu.setDescription("Cooked pasta.");
		assertEquals("Cooked pasta.", tempMenu.getDescription());
	}
	
	@Test
	public void testSetSection(){
		MenuItemEntity tempMenu = testCreation();
		assertEquals("Cheap Bargains", tempMenu.getSection());
		tempMenu.setSection("Supposedly Average");
		assertEquals("Supposedly Average", tempMenu.getSection());
	}
	
	@Test
	public void testSetPrice(){
		MenuItemEntity tempMenu = testCreation();
		assertEquals(0.50, tempMenu.getPrice());
		tempMenu.setPrice(1.25);
		assertEquals(1.25, tempMenu.getPrice());
	}
	
	@Test
	public void testSetDate(){
		Date date = new Date(2008,6,25);
		MenuItemEntity tempMenu = testCreation();
		assertEquals(date, tempMenu.getDate());
		
		Date newDate = new Date(2020,8,14);
		tempMenu.setDate(newDate);
		assertEquals(newDate, tempMenu.getDate());
	}
}
