import junit.framework.Test;
import junit.framework.TestSuite;

public class TestCalculatorSuite {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for default package");
		//$JUnit-BEGIN$
		suite.addTestSuite(TestCalculator.class);
		//$JUnit-END$
		return suite;
	}

}
