package abstraction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sports sp=new Sports();
		Sports sport=new Football();
		Sports s=new Cricket();
		sport.league();
		sport.team();
		s.league();
		s.team();
		sport.cup();
	}

}
