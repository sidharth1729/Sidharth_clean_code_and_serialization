package simplecompound;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

public class Input {
	double p;
	double t;
	double r;
	
	public boolean takeInput() {
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
	    Logger logger = Logger.getLogger(App.class.getName());
	    try {
		    logger.info("Enter the principle amount:"); 
			this.p = Double.parseDouble(reader.readLine());
		    logger.info("Enter the Time period:");
		    this.t = Double.parseDouble(reader.readLine());
		    logger.info("Enter the Rate of Interest");
		    this.r = Double.parseDouble(reader.readLine());
		} catch (NumberFormatException e) {
			logger.log(null, "context", e);
			return false;
		} catch (IOException e) {
			logger.log(null, "context", e);
			return false;
		}
	    return true;
	}
	
	public double getPrinciple() {
		return p;
	}
	
	public double getRate() {
		return r;
	}
	
	public double getTime() {
		return t;
	}
}
