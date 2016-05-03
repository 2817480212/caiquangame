package cn.edu.qdu.qddx.game;

import java.util.Scanner;

public class Judger {
	
	Scanner input = new Scanner(System.in);
	private int total;
	private Person person;
	private Computer computer;
	
	public void startGame(){
		
		System.out.println("*************");
		System.out.println("***猜拳，开始***");	
		System.out.println("*************");
		System.out.println("出拳规则：1.剪刀 2.石头 3.布");
	}
	public void askName(){
		System.out.println("请选择对方角色（1.刘备 2.孙权 3.曹操）：");
		computer.inputName();
		
		System.out.println("请输入你的姓名：");
		person.inputName();
		
		System.out.println(computer.getPlayerName() + "VS" + person.getPlayerName() + "对战");
		
		
	}
    public void playGame(){
    	
    	System.out.println("要开始吗？（y/n）");
    	String answer1 = null;
    	answer1 = input.next();
		String answer2;
		do{
		if (answer1.equalsIgnoreCase("y")) {
		
		System.out.println("你出拳：");
		int personNum = person.myFist();
		switch (personNum) {
		case 1:
			System.out.println("剪刀");
			break;
		case 2:
			System.out.println("石头");
			break;
		case 3:
			System.out.println("布");
			break;

		default:
			break;
		}
		System.out.println(computer.getPlayerName() + "出拳：");
		int computerNum = computer.myFist();
		switch (computerNum) {
		case 1:
			System.out.println("剪刀");
			break;
		case 2:
			System.out.println("石头");
			break;
		case 3:
			System.out.println("布");
			break;

		default:
			break;
		}
		if (computerNum==personNum) {
			System.out.println("平局");
		}
		if ((personNum==1&&computerNum==2)||(personNum==2&&computerNum==3)||(personNum==3&&computerNum==1)) {
			System.out.println("你输了，真笨！");
			computer.setWinningTimes(computer.getWinningTimes()+1);
			
		}
		if ((personNum==2&&computerNum==1)||(personNum==3&&computerNum==2)||(personNum==1&&computerNum==3)) {
			System.out.println("你赢了，真棒！");
			person.setWinningTimes(person.getWinningTimes()+1);
		}
		total++;
		}else {
		}
		System.out.println("是否开始下一轮？（Y/N）");
		answer2=input.next();
		input.close();
		
	    }while(answer2.equalsIgnoreCase("y"));
		
	   // return ;
	}
	
	
	

    public void finalResult(){
    	System.out.println(computer.getPlayerName() + "VS" + person.getPlayerName());
		System.out.println("对战次数：" +total);
		System.out.println("姓名   得分");
		System.out.println(person.getPlayerName() + person.getWinningTimes());
		System.out.println(computer.getPlayerName() + computer.getWinningTimes());
		System.out.print("结果：");
		if(person.getWinningTimes() == computer.getWinningTimes()){
			System.out.println("哎吆，平局哦。");
		}
		if(person.getWinningTimes() < computer.getWinningTimes()){
			System.out.println("呵呵，你输了，笨笨");
		}
		if(person.getWinningTimes() > computer.getWinningTimes()){
			System.out.println("你赢了！厉害噢！");
		}
	}
}
