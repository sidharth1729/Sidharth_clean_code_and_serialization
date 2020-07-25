package cleancode;


import java.util.logging.Logger;

public class App 
{
	static {
		Logger logger = Logger.getLogger(App.class.getName());
		calculateCost calc= new calculateCost();
		int choice = calc.takeInputArea();
		logger.info("Calculating the construction cost !!!");
		if(choice == -1) {
			logger.info("Wrong Input Format....Exiting process");
			System.exit(0);
		}
		else {
			logger.info("Total cost of construction is INR "+Long.toString((calc.calculate(choice))));
		}
		}
    public static void main( String[] args )
    {
    	System.exit(0);
    }
}
