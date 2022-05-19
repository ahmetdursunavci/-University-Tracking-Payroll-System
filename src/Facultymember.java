

public class Facultymember extends Academician {
	public Facultymember(String name, String registernumber, String position, int startyear) {
		super(name, registernumber, position, startyear);
	}
	private double sevpay=super.calculatesevpay();
	private double ssbenefit=super.calculatessbenefit();
	public double calculatesalary(String[] a) {
		int[] b = {Integer.parseInt(a[1]),Integer.parseInt(a[2]),Integer.parseInt(a[3]),Integer.parseInt(a[4])};
		double salary = 0;
		for(int i = 0 ; i < b.length ; i++) {
			if (b[i]-40>=8) {
				salary+=8*20;
			}
			else {
				salary+=(b[i]-40)*20;
			}
		}
		salary+=Academician.basesalary+sevpay+ssbenefit;
		return salary;
	}
	

}
