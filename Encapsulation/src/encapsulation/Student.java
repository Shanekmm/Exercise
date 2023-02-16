package encapsulation;

public class Student {
private int rollno;
 private String name;
 public void setName(String name) {
	 this.name=name;
 }
 public String getName()
 {
	 return name;
 }
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
//Student(int rollno){
//	this.rollno=rollno;
//System.out.println(rollno);
//}
}

