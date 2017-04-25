package edu.oit.lesson2;

import java.util.ArrayList;

//求某年某月有多少天，写一个方法dayCount(int year, int month),在main方法里给一个年和月，调用这个函数，打印出天数
//规则：
//月：一月 三月五月七月八月十月 十二月 是31天，其他除二月外是三十天
//二月：闰年：29天，平年：28天
//年分除以400可整除，为闰年。
//年分除以4可整除但除以100不可整除，为闰年。
//年分除以4不可整除，为平年。
//年分除以100可整除但除以400不可整除，为平年
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
		} // 判断能否被400整除
		else if (year % 100 == 0) {
			dayYear = 365;
			temp = 1;// "is flat";
		} // 判断能否被100整除
		else if (year % 4 == 0) {
			dayYear = 366;
			temp = 0;// "is smooth";
		} // 判断能否被4整除.
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
		case 2:// 判断闰年的方法，能被4整除，
			if (((a % 4 == 0) && !(a % 100 == 0)) || (a % 400 == 0)) {
				// System.out.println("29天");
				day = 29;
			} else {
				// System.out.println("28天");
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
