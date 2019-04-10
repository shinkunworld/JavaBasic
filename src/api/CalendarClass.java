package api;

import java.util.Calendar;//import랑class명이랑 같으면 안됨
public class CalendarClass {

	public static void main(String[] args) {
	
		Calendar calendar = Calendar.getInstance();
		//인스턴스할때 클래스의 이름이 아닌 Calender로 선언해야한다.
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		//java month는 0부터 시작하므로 1을 더해줘야한다
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		
		System.out.println(year + "년 " + month + "월 " + day + "일");
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
	}

}
