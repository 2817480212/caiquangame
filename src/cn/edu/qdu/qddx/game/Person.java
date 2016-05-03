package cn.edu.qdu.qddx.game;

import java.util.Scanner;

public class Person extends Player{
	

	
	Scanner input = new Scanner(System.in);
	
	public  void inputName(){
		String playerName = null;
	    playerName = input.next();
		setPlayerName(playerName);
	}
	
    public int myFist(){
    	int f = 0;
    	f = input.nextInt(); 
		return f;
    }


}
