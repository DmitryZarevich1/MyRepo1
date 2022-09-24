package stepic2;

public class CivilT implements civilTrans {
	
	int maxSpeed;
	String model;
	String type;
	
	public CivilT(String model,int maxSpeed,String type) {
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.type = type;
	}

	public CivilT() {
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

}
