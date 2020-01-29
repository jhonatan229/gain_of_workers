package workers;

public class Gain {

	private String name;
	private int hourInWeek;
	private double valuePerHour;
	private static final double EXTRA = 1.5;
	
	public Gain(String name, int hourInWeek, double valuePerHour) {
		this.name = name;
		this.hourInWeek = hourInWeek;
		this.valuePerHour = valuePerHour;
	}

	public String getName() {
		return name;
	}

	public int getHourInWeek() {
		return hourInWeek;
	}


	public double getValuePerHour() {
		return valuePerHour;
	}

	public double valueGain() {
		if(hourInWeek > 40) {
			return ((hourInWeek - 40) * valuePerHour) * EXTRA + (40 * valuePerHour);
		}
		else {
			return hourInWeek * valuePerHour;
		}
		
	}
	
	public String toString() {
		return "worker: " + getName() + "   gain in week: R$ " + String.format("%.2f", valueGain());
	}
}
