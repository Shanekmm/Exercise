package encapsulation;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student anu=new Student();
		anu.setRollno(10);
		anu.setName("anu");
				
		System.out.println(anu.getName() +":"+ anu.getRollno());
	}

}
