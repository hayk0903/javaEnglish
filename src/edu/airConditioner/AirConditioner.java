package edu.airConditioner;
import java.util.ArrayList;

/**
 * The AirConditioner object represents an air conditioner.
 * It has a model and room in which is located. It can be turned on and off,
 * the temperature and mode(heat, freeze) can be set.
 */
public class AirConditioner {
	
	private static ArrayList<AirConditioner> condList = new ArrayList<AirConditioner>();
	private boolean isOn;
	private int temp;
	private String model;
	private String mode;
	private String room;
	
	
	public AirConditioner(String model, String room) {
		this.room = room;
		this.model = model;
		condList.add(this);
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}
	
	public void setMode(String mode, int temp) {
		isOn = true;
		this.mode = mode;
		this.temp = temp;
	}
	
	
	public String toString() {
		return "AirConditioner [isOn=" + isOn + ", temp=" + temp + ", model=" + model + ", mode=" + mode
				+ ", room=" + room+ "]";
	}
	
	/**
	 * Returns String representation of the object. If argument showAll is "true",
	 * returns String representation of all AirConditioner objects.
	 */
	public String toString(boolean showAll){
		if(showAll) return condList.toString();
		else return toString();
	}
	
	/**
	 * Returns number of air conditioners currently working.
	 */
	public static int condsWorking(){
		int count=0;
		for(AirConditioner i: condList){
			if(i.isTurnedOn()) count++;
		}
		return count;
	}

	private boolean isTurnedOn() {
		return isOn;
	}

	
	
}
