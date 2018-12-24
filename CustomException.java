/*PROGRAM AS DEMO ON CUSTOM EXCEPTION*/


package com.common;


class SpeedException extends Exception{
	
	public SpeedException(String message){
		super(message);
	}
	
}



public class CustomException {

	public static void checkSpeed() throws SpeedException{
		
		int speed=10;
		boolean isOverSpeed=false;
		
		while(!isOverSpeed){
			if(speed>60){
				try {
					throw new SpeedException("Your vehicle is at OVERSPEED");
				} catch (SpeedException e) {
					e.printStackTrace();
					isOverSpeed=true;
				}
			}
			//System.out.println(speed);
			speed=speed+10;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
		try {
			checkSpeed();
		} catch (SpeedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
