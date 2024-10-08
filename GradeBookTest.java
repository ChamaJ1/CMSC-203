import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	GradeBook score1 = new GradeBook(5);
	GradeBook score2 = new GradeBook(5);
	
	@BeforeEach
	void setUp() throws Exception {
		
		score1.addScore(50.0);
		score1.addScore(75.0);
		
		score2.addScore(50);
		score2.addScore(50);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		 score1 = null;
		 score2 = null;
	}
	

	@Test
	void testToString() {
		score1.toString();
		score2.toString();
		
	}

	@Test
	void testGetScoreSIze() {
		score1.getScoreSIze();
		score2.getScoreSIze();
	}

	@Test
	void testAddScore() {
		assertTrue(score1.toString().equals("50.0 75.0 "));
		assertTrue(score2.toString().equals("50.0 50.0 "));
	}


	@Test
	void testSum() {
		assertEquals(125, score1.sum(), .0001);
		assertEquals(100, score2.sum(), .0001);

		
	}

	@Test
	void testMinimum() {
		assertEquals(50, score1.minimum(), .0001);
		assertEquals(50, score2.minimum(), .0001);

	}

	@Test
	void testFinalScore() {
		score1.finalScore();
		score2.finalScore();
	}

}
