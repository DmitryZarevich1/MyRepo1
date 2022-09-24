package stepic2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CivilT ct = new CivilT("троллейбус",70,"наземный транспорт");
		System.out.println(ct.toString());
		ct.model();
		System.out.println(ct.type());
		
		MillT mt = new MillT("истребитель",3200,"воздушный транспорт");
		System.out.println(mt.toString());
		mt.model();
		System.out.println(mt.type());
		

	}

}
