package simplecompound;



import java.util.logging.Logger;

public class App 
{
	static {
		Logger logger = Logger.getLogger(App.class.getName());
		calculateInterest calc = new calculateInterest();
		boolean inputFlag = calc.takeInput();
		if(!inputFlag) {
			logger.info("Wrong Input Format....Exiting process");
			System.exit(0);
		}
		else {
			logger.info("Calculation of Simple Interest and Compound Interest!!!");
			logger.info("Simple Interest is "+Double.toString(calc.calSimInterest()));
			logger.info("Compound Interest is "+ Double.toString(calc.calcCompInterest()));
		}
		}
    public static void main( String[] args )
    {
    	throw new UnsupportedOperationException();
    }
}
