package edu.oit.lesson2;

import java.util.ArrayList;

//��ĳ��ĳ���ж����죬дһ������dayCount(int year, int month),��main�������һ������£����������������ӡ������
//����
//�£�һ�� �����������°���ʮ�� ʮ���� ��31�죬����������������ʮ��
//���£����꣺29�죬ƽ�꣺28��
//��ֳ���400��������Ϊ���ꡣ
//��ֳ���4������������100����������Ϊ���ꡣ
//��ֳ���4����������Ϊƽ�ꡣ
//��ֳ���100������������400����������Ϊƽ��
//@Created by Joshua Yao

public class DayCount {
	public static int[] dayCount(int year, int month) {
		int dayYear;
		int temp = 0;
		String istempyear;
		int day = 0;
		int tempMonth = month;
		int a = year;
		int b = month;
		int[] out = new int[3];

		if (year % 400 == 0) {
			dayYear = 366;
			temp = 0;// "is smooth";
		} // �ж��ܷ�400����
		else if (year % 100 == 0) {
			dayYear = 365;
			temp = 1;// "is flat";
		} // �ж��ܷ�100����
		else if (year % 4 == 0) {
			dayYear = 366;
			temp = 0;// "is smooth";
		} // �ж��ܷ�4����.
		else {
			dayYear = 365;
			temp = 1;// "is flat";
		}

		switch (tempMonth) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		// case 2:
		case 4:
		case 6:
		case 9:
		case 11:

			day = 30;
			break;
		case 2:// �ж�����ķ������ܱ�4������
			if (((a % 4 == 0) && !(a % 100 == 0)) || (a % 400 == 0)) {
				// System.out.println("29��");
				day = 29;
			} else {
				// System.out.println("28��");
				day = 28;
			}
			break;
		}
		out[0] = day;
		out[1] = dayYear;
		out[2] = temp;
		if (temp == 0)
			istempyear = "Smooth";
		else
			istempyear = "Flat";

		System.out.println(out[0] + "," + out[1] + "," + istempyear); //
		// return out[0]+","+out[1]+","+istempyear;
		return out;

	}

	public static void main(String[] args) {
		// TestStatic.callMe();
		// TestStatic testStatic = new TestStatic();
		// testStatic.callHim();
		// Product.product();
		DayCount.dayCount(1995, 12);

	}
}
