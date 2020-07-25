package Assignment4;

public class Student extends Person{
      public String program;
      public int year;
      public Double fee;
      public Student(String name,String address,String program,int year,Double fee) {
    	  super(name,address);
    	  this.program=program;
    	  this.year=year;
    	  this.fee=fee;
   }
     public void ShowStudentInfo() {
    	 System.out.println(super.toString());
    	 System.out.println("Program Name:" + this.program);
    	 System.out.println("Year:" + this.year);
    	 System.out.println("Fee:" + this.fee);
     }
      public static void main(String[] args) {
    			// TODO Auto-generated method stub
    	          Student stu1=new Student("Ya Min","Monywa","Physics",2,20000.0);
    	          Student stu2=new Student("Mg Mg","Yangon","CU",3,30000.0);
    	          Student stu3=new Student("Phyu Pyar","Pathein","TU",4,20000.0);
    	          
    	          stu1.ShowStudentInfo();
    	          System.out.println();
    	          stu2.ShowStudentInfo();
    	          System.out.println();
    	          stu3.ShowStudentInfo();
    		}
      }
	


