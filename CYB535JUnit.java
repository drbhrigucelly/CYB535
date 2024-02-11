import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import HelloWorld.HelloWorld;



class CYB535JUnit {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		CYB535HelloWorld hw = new CYB535HelloWorld();
		System.out.println("Square" + hw.square(4));
		assertEquals("Expected and actual coefficients DON'T match", 16, hw.square(4));
		//fail("Not yet implemented");

		}
	
	@Test
	void test2() {
		CYB535HelloWorld hw = new CYB535HelloWorld();
		System.out.println("add" + hw.add(4,5));
		assertEquals("Expected and actual coefficients DON'T match", 9, hw.add(4,5));
		//fail("Not yet implemented");
		
	}

}
