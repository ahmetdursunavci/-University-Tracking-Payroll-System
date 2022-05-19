
public class Academician extends Personnel {
	public static final int basesalary = 2600;
	public Academician(String name, String registernumber, String position, int startyear) {
		super(name, registernumber, position, startyear);
		
	}
	public double calculatessbenefit() {
		return basesalary*135/100;
		
	}

}
