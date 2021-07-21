
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.jupiter.api.Test;

class SomeMethodsTest {

	@Test
	void testWeight_index() {
		assertEquals(SomeMethods.weight_index(12, 2),2/9);
		
	}

	@Test
	void testGet_weight() {
		SomeMethods get_weight = new SomeMethods();
		String input = "50.0";
		InputStream in = new ByteArrayInputStream(input.getBytes()); 
		System.setIn(in);
		assertEquals("50.0",get_weight.get_weight());
	}

	@Test
	void testGet_height() {
		SomeMethods get_height = new SomeMethods();
		String input = "50.0";
		InputStream in = new ByteArrayInputStream(input.getBytes()); 
		System.setIn(in);
		assertEquals("50.0",get_height.get_height());
	}

}
