import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class test {
	student st;
	marks mk;
	caltotmarks cal;
	@Before
	public void setUp() throws Exception {
		st = new student();
		mk = new marks();
		cal = new caltotmarks();
	}
	

	@Test
	public void test() {
		st.setName("anokhi");
		st.setCourse("mca");
		st.setAge(22);
		assertEquals("anokhi",st.getName());
		
		
	}

	public void testmarks() {
		String Name = new String ("anokhi");
	      String course = new String ("mca");
	   
	      mk.setSE(50);
	      mk.setAI(40);
	      //Check that a condition is true
	      assertTrue(50==mk.getAI());

	      //Check that a condition is false
	      assertFalse(30==mk.getSE());

	      //Check that an object isn't null
	      assertNotNull(Name);
	      assertNotNull(course);	
	}
	
	
	public void testExceptionIsThrown()
	{
		cal.setAI(99);
		cal.setSE(100);
		cal.addition(99,101);
	}
	
	 public void testadd() {
		   
		    assertEquals("99 + 100 must be 199", 199, cal.addition(10, 5));
		  }
	
}
