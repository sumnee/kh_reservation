package com.kh.lsm;

import java.util.Random;
import java.util.Scanner;

public class VineFunction {
	Vine viner;
	
	public VineFunction() {
		viner = new Vine();
	}

	
	public int printMenu() {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("~~~@~~~< VineWine ���� ���α׷� >~~~@~~~");
		System.out.println("1. �����û �ۼ�");
		System.out.println("2. ������Ȳ Ȯ��");
		System.out.println("3. ��ǥ�޴� �ȳ�");
		System.out.println("4. ���α׷� ����");
		System.out.print("��ȣ ���� : ");
		int input = sc.nextInt();
		return input;
	}
	
	public void reservation() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("~~~< ������ ���� �Է� >~~~");
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.print("����ó : ");
		String number = sc.next();
		System.out.print("�ο� : [ ]��");
		int member = sc.nextInt();
		System.out.println("��¥ (yyyymmdd �������� �Է�) : ");
		int day = sc.nextInt();
		System.out.println("�̿� �ð��� 1�� 17~19�� / 2�� 19��~21�� �� ���� �����մϴ�.");
		System.out.print("���ϴ� �ð��� : [ ]��");
		int time = sc.nextInt();
		System.out.println();
		System.out.println("VineWine�� �������ּż� �����մϴ�.");
		System.out.println();
		System.out.println();
		
		viner = new Vine (name, number, member, day, time);	
	}
	public void check() {
		Random ran = new Random();
		int com = ran.nextInt(2);
		System.out.println();
		System.out.println("~~~< ���� ���� Ȯ�� >~~~");
		System.out.println(viner.getName() + "���� ���� �����Դϴ�.");
		if(com == 1) {
			System.out.println("���� : ������ Ȯ���Ǿ����ϴ�!");
		} else {
			System.out.println("���� : ���Կ��� ���� ���� ���θ� Ȯ�� ���Դϴ�.");
		}
		System.out.println("����ó : " + viner.getNumber());
		System.out.println("���� �ο� : " + viner.getMember() + "��");
		System.out.println("���� �Ͻ� : " + viner.getDay() + " / " + viner.getTime() + "��");
	}

	public void bestMenu() {
		System.out.println();
		System.out.println("~~~< �̴��� ��õ �޴� >~~~");
		System.out.println("* �Ļ�� > ���� ũ�� ������: 16,000��");
		System.out.println("* ���ַ� > ���� ���� ����Ÿġ��� �ٰ�Ʈ: 7,000��");
		System.out.println("* �̴��� ���� > ������ ũ���� �� ���� �긴: 55,000��");
		System.out.println("                û���, ������ �������� �������� ����� ����Ŭ�� �����Դϴ�.");
	}
	
	public void goodBye() {
		System.out.println();
		System.out.println("VineWine�� �̿����ּż� �����մϴ� ^^*");
	}
	
	public void printException() {
		System.out.println();
		System.out.println("1~4�� �߿� �������ּ���.");		
	}
}
