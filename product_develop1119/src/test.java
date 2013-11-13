import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class test {
	student st;
	@Before
	public void setUp() throws Exception {
		st = new student();
		
	}
	

	@Test
	public void test() {
		st.setName("anokhi");
		st.setCourse("mca");
		st.setAge(22);
		assertEquals("anokhi",st.getName());
		
		
	}

}
