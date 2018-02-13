import junit.framework.TestCase;

public class TestCalculator extends TestCase {
private JavaCalculator jc;
private int n1,n2;
    public void testAdd(){
	int result=jc.add(n1,n2);
	assertEquals(result,40);
	}
    public void testsub(){
    	int result=jc.sub(n1,n2);
    	assertEquals(result,20);
    	}
   
	public TestCalculator(String arg0) {
		super(arg0);
	}

	protected void setUp() throws Exception {
		super.setUp();
		jc= new JavaCalculator();
		n1=30;
		n2=10;
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
