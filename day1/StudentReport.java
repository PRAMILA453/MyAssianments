package week1.day1;

public class StudentReport {
 public void report(String StudentName,int RollNumber,String CollegeName,float Markscored,float CGPA) {
	System.out.println("student name is :"+StudentName);
	System.out.println("RollNumber :"+RollNumber);
	System.out.println("College Name :"+CollegeName);
	System.out.println("mark scored :"+Markscored);
	System.out.println("CGPA :"+CGPA);
	
 }
 public static void main(String[] args) {
	StudentReport mark =new StudentReport();
	mark.report("pramila",71164,"Anna university",90f,69f);
	
 
	
}
}