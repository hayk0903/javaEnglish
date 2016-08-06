package edu.airConditioner;

public class Conditioner {
	public static void main(String[] args){
		AirConditioner a = new AirConditioner("LG","kitchen");
		AirConditioner b = new AirConditioner("Mitsubishi", "Dining room");
		a.setMode("freeze", 19);
		b.setMode("heat", 25);
		System.out.println(AirConditioner.condsWorking());
	}

}
