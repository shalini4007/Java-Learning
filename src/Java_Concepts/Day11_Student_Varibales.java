package java_Concepts;

public class Day11_Student_Varibales {
	
	int sid;
	String sname;
	char grade;
	
	void printStudentData() {
		System.out.println(sid +" " + "sname" + " " + grade);
	}
	
	void setStudentData(int id, String name, char gr) {
		sid=id;
		sname=name;
		grade=gr;
	}

}
