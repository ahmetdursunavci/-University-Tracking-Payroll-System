
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Personnel {
	private String name;
	private double salary;
	private String registernumber;
	private String position;
	private int startyear;
	public static final int currentyear=2020;
	
	public Personnel() {};
	
	public Personnel(String name,String registernumber,String position,int startyear) {
		salary=0;
		this.name=name;
		this.registernumber=registernumber;
		this.position=position;
		this.startyear=startyear;

}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getRegisternumber() {
		return registernumber;
	}
	public void setRegisternumber(String registernumber) {
		this.registernumber = registernumber;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getStartyear() {
		return startyear;
	}
	public void setStartyear(int startyear) {
		this.startyear = startyear;
	}
	public double calculatesevpay() {
		return (currentyear-getStartyear())*0.8*20;
	}
	public static String[] readFile(String path) { 
		try {
		int i = 0 ; 
		int length= Files.readAllLines(Paths.get(path)).size();
		String[] results=new String[length];
			for (String line : Files.readAllLines(Paths.get(path))) {
				results[i++]=line;
			}
		return results;
		} catch(IOException e ) {
			e.printStackTrace();
			return null;
		}
		
		
	}
    public void writing(){
	    
    File file = new File(this.getRegisternumber()+".txt");
    try(BufferedWriter a = new BufferedWriter(new FileWriter(file))){
    	String[] ad = this.getName().split(" ");
        a.write("Name : "+ad[0]+"\n"+"Surname : "+ad[1]+"\n");
        a.write("Registration Number : "+this.getRegisternumber()+"\n");
        a.write("Position : "+this.getPosition()+"\n");
        a.write("Year Of Start : "+this.getStartyear()+"\n");
        a.write("Total Salary : "+String.format(java.util.Locale.US,"%.2f",this.getSalary())+" TL");
        a.close();
    } catch (IOException e) {
        System.out.println("Unable to read file " +file.toString());
        
    }
    

}
	
}
