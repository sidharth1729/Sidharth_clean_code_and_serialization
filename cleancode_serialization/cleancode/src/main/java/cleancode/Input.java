package cleancode;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Logger;

public class Input {
	long area;
	long price;
	int choice;
	static ArrayList<String> arr = new ArrayList<String>();
	final BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
	final Logger logger = Logger.getLogger(Input.class.getName());
	Input(){
		arr.add("Enter 1 for Standard Materials...................................Cost is INR 1200 per sqft.");
		arr.add("Enter 2 for Above Standard Materials.............................Cost is INR 1500 per sqft.");
		arr.add("Enter 3 for High Standard Materials..............................Cost is INR 1800 per sqft.");
		arr.add("Enter 4 for Fully Automated House and High Standard Materials....Cost is INR 2500 per sqft.");
	}
	public int takeInputArea() {
	    try {
		    logger.info("Calculate the cost of construction of your house"); 
		    logger.info("Enter the area of your house (in square feet)");
		    this.area = Long.parseLong(reader.readLine());
		    takeInputOption();
		} catch (NumberFormatException e) {
			logger.log(null, " ", e);
			return -1;
		} catch (IOException e) {
			logger.log(null, " ", e);
			return -1;
		}
	    return choice;
	}
	
	private void takeInputOption() {
		try {
			printAllOptions();
		    logger.info("Enter your choice. Select any option from 1 - 4");
		    this.choice = Integer.parseInt(reader.readLine());
		} catch (NumberFormatException e) {
			logger.log(null, "context", e);
		} catch (IOException e) {
			logger.log(null, "context", e);
		}
	}
	
	private void printAllOptions() {
		for(String i: arr) {
			logger.info(i);
		}
	}

	public long getArea() {
		return area;
	}
	
	public long getPrice(int choice) {
		switch(choice) {
		case 1:
			this.price = 1200;
			break;
		case 2:
			this.price = 1500;
			break;
		case 3:
			this.price = 1800;
			break;
		case 4:
			this.price = 2500;
			break;
		default:
			logger.info("Enter any number between 1 to 4");
			takeInputOption();
			break;
		}
		return price;
	}
}
