package cn.edu.qdu.qddx.game;

import java.util.Scanner;

public class Computer extends Player{
	Scanner input = new Scanner(System.in);
	
	
	public  void inputName(){
		
		int num = input.nextInt();
		String playerName = null;
		switch (num) {
		case 1:
			playerName = "����";
			break;
		case 2:
			playerName = "��Ȩ";
			break;
		case 3:
			playerName = "�ܲ�";
			break;
		default:
			break;
		}
		setPlayerName(playerName);
		
	}
	
    public int myFist(){
    	int f=(int) (Math.random()*3+1);
		return f;
    }
}
