
public class ResearchAsistant extends Academician {

	public ResearchAsistant(String name, String registernumber, String position, int startyear) {
		super(name, registernumber, position, startyear);
		
	}
	public double calculatessbenefit() {
		return Academician.basesalary*105/100;
}

private double sevpay=super.calculatesevpay();
private double ssbenefit=calculatessbenefit();
	public double calculatesalary() {
		return Academician.basesalary+sevpay+ssbenefit;
		
	}

}