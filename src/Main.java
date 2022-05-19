

public class Main {

	public static void main(String[] args) {
		Personnel read = new Personnel();
		String[] dosya1=read.readFile(args[0]);
		String[] dosya2=read.readFile(args[1]);
		for(int i = 0 ; i < dosya1.length; i++) {
			String[] a = dosya1[i].split("	");
			String[] b = dosya2[i].split("	");
			if(a[1].charAt(0)=='F') {
				Facultymember facultymember=new Facultymember(a[0],a[1],a[2],Integer.parseInt(a[3]));
				facultymember.setSalary(facultymember.calculatesalary(b));
				facultymember.writing();
			}
			else if(a[1].charAt(0)=='W') {
				Worker worker=new Worker(a[0],a[1],a[2],Integer.parseInt(a[3]));
				worker.setSalary(worker.calculatesalary(b));
				worker.writing();
				
			}
			else if(a[1].charAt(0)=='S') {
				Security security = new Security(a[0],a[1],a[2],Integer.parseInt(a[3]));
				security.setSalary(security.calculatesalary(b));
				security.writing();
			}
			else if(a[1].charAt(0)=='O') {
				Officer officer = new Officer(a[0],a[1],a[2],Integer.parseInt(a[3]));
				officer.setSalary(officer.calculatesalary(b));
				officer.writing();
				
			}
			else if(a[1].charAt(0)=='C') {
				Chief chief = new Chief(a[0],a[1],a[2],Integer.parseInt(a[3]));
				chief.setSalary(chief.calculatesalary(b));
				chief.writing();
			}
			else if(a[1].charAt(0)=='P') {
				PartTime parttime = new PartTime(a[0],a[1],a[2],Integer.parseInt(a[3]));
				parttime.setSalary(parttime.calculatesalary(b));
				parttime.writing();
				
			}
			else if(a[1].charAt(0)=='R') {
				ResearchAsistant rasistant = new ResearchAsistant(a[0],a[1],a[2],Integer.parseInt(a[3]));
				rasistant.setSalary(rasistant.calculatesalary());
				rasistant.writing();
				
			}
		}

	}

}
