package cleancode;


public class calculateCost extends Input{
	public long calculate(int choice) {
		return getArea()*getPrice(choice);
	}
}
