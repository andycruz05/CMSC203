import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {

	private GradeBook g1;
    private GradeBook g2;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception
	{
		g1 = new GradeBook(5);
		g1.addScore(50.0);
		g1.addScore(75.0);
		g2 = new GradeBook(5);
		g2.addScore(10.0);
		g2.addScore(30.0);
	}

	@AfterEach
	void tearDown() throws Exception 
	{
		g1 = null;
		g2 = null;
	}

	@Test
	void testGradeBook() {
		
	}

	@Test
	void testAddScore() 
	{
		assertTrue((g1.toString()).equals(" 50.0 75.0 "));
		assertTrue((g2.toString()).equals(" 10.0 30.0 "));
		assertEquals(2, g1.getScoreSize(), 0.001);
		assertEquals(2, g2.getScoreSize(), 0.001);
	}

	@Test
	void testSum() {
		assertEquals(125.0, g1.sum(), .0001);
		assertEquals(40.0, g2.sum(), .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(50.0, g1.minimum(), .001);
		assertEquals(10.0, g2.minimum(), .001);
	}

	@Test
	void testFinalScore() {
		assertEquals(75.0, g1.finalScore(), .0001);
		assertEquals(30.0, g2.finalScore(), .0001);
	}

	@Test
	void testGetScoreSize() {
		
	}

	@Test
	void testToString() {
		
	}

}
