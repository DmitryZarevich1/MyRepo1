package stepic2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CivilT ct = new CivilT("троллейбус",70,"наземный транспорт");
		System.out.println(ct.toString());
		ct.model();
		System.out.println(ct.type());
		
		CivilT ct1 = new CivilT();
		System.out.println(ct1);
		
		MillT mt = new MillT("истребитель",3200,"воздушный транспорт");
		System.out.println(mt.toString());
		mt.model();
		System.out.println(mt.type());
		
		civilTrans cT = new CivilT();
		militaryTrans cT1 = new MillT();
		System.out.println();
		System.out.println(cT);
		System.out.println();
		System.out.println(cT1);
		//dfldlfldfkldlfldflk
		

	}

}
