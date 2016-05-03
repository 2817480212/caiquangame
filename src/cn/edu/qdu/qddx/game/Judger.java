package cn.edu.qdu.qddx.game;

import java.util.Scanner;

public class Judger {
	
	Scanner input = new Scanner(System.in);
	private int total;
	private Person person;
	private Computer computer;
	
	public void startGame(){
		
		System.out.println("*************");
		System.out.println("***��ȭ����ʼ***");	
		System.out.println("*************");
		System.out.println("��ȭ����1.���� 2.ʯͷ 3.��");
	}
	public void askName(){
		System.out.println("��ѡ��Է���ɫ��1.���� 2.��Ȩ 3.�ܲ٣���");
		computer.inputName();
		
		System.out.println("���������������");
		person.inputName();
		
		System.out.println(computer.getPlayerName() + "VS" + person.getPlayerName() + "��ս");
		
		
	}
    public void playGame(){
    	
    	System.out.println("Ҫ��ʼ�𣿣�y/n��");
    	String answer1 = null;
    	answer1 = input.next();
		String answer2;
		do{
		if (answer1.equalsIgnoreCase("y")) {
		
		System.out.println("���ȭ��");
		int personNum = person.myFist();
		switch (personNum) {
		case 1:
			System.out.println("����");
			break;
		case 2:
			System.out.println("ʯͷ");
			break;
		case 3:
			System.out.println("��");
			break;

		default:
			break;
		}
		System.out.println(computer.getPlayerName() + "��ȭ��");
		int computerNum = computer.myFist();
		switch (computerNum) {
		case 1:
			System.out.println("����");
			break;
		case 2:
			System.out.println("ʯͷ");
			break;
		case 3:
			System.out.println("��");
			break;

		default:
			break;
		}
		if (computerNum==personNum) {
			System.out.println("ƽ��");
		}
		if ((personNum==1&&computerNum==2)||(personNum==2&&computerNum==3)||(personNum==3&&computerNum==1)) {
			System.out.println("�����ˣ��汿��");
			computer.setWinningTimes(computer.getWinningTimes()+1);
			
		}
		if ((personNum==2&&computerNum==1)||(personNum==3&&computerNum==2)||(personNum==1&&computerNum==3)) {
			System.out.println("��Ӯ�ˣ������");
			person.setWinningTimes(person.getWinningTimes()+1);
		}
		total++;
		}else {
		}
		System.out.println("�Ƿ�ʼ��һ�֣���Y/N��");
		answer2=input.next();
		input.close();
		
	    }while(answer2.equalsIgnoreCase("y"));
		
	   // return ;
	}
	
	
	

    public void finalResult(){
    	System.out.println(computer.getPlayerName() + "VS" + person.getPlayerName());
		System.out.println("��ս������" +total);
		System.out.println("����   �÷�");
		System.out.println(person.getPlayerName() + person.getWinningTimes());
		System.out.println(computer.getPlayerName() + computer.getWinningTimes());
		System.out.print("�����");
		if(person.getWinningTimes() == computer.getWinningTimes()){
			System.out.println("��ߺ��ƽ��Ŷ��");
		}
		if(person.getWinningTimes() < computer.getWinningTimes()){
			System.out.println("�Ǻǣ������ˣ�����");
		}
		if(person.getWinningTimes() > computer.getWinningTimes()){
			System.out.println("��Ӯ�ˣ������ޣ�");
		}
	}
}
