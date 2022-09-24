package stepic2;

public class MillT implements militaryTrans {
	
	int maxSpeed;
	String model;
	String type;
	
	public MillT(String model,int maxSpeed,String type) {
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.type = type;
	}

	public MillT() {
		// TODO Auto-generated constructor stub
	}
	
	public void model() {
		System.out.println("model: "+model);
	}
	
	
	public String type() {
		return "type: "+type;
	}
	
	public String toString() {
		return "Тип транспорта: "+type+"\n"+"Модель: "+model+"\n"+"Максимальная скорость: "+maxSpeed;
	}
//d;lfvmd;'v,'
}
