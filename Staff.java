package Assignment4;

import java.util.Scanner;

public class Staff extends Person{
private  String school;
private Double pay;
public  Staff(String name,String address,String school,Double pay) {
	super(name,address);
	this.school=school;
	this.pay=pay;
}

public String getSchool() {
	return school;
}

public void setSchool(String school) {
	this.school =school;
}

public Double getPay() {
	return pay;
}

public void setPay(Double pay) {
	this.pay = pay;
}
public void ShowStaffInfo() {
	System.out.println(super.toString());
	System.out.println("School:" + this.school);
	System.out.println("Payment:" + this.pay);
}

public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Staff st1=new Staff("U Hla","Mandalay","Main School",150000.0);
	  Staff st2=new Staff("Daw Mya","Yangon","Technological School",100000.0);
	  
	  st1.ShowStaffInfo();
	  System.out.println();
	  st2.ShowStaffInfo();
	
}
}
