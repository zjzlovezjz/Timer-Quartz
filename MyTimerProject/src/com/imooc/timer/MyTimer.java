package com.imooc.timer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;

public class MyTimer {

	public static void main(String[] args) {
		//1.����һ��timerʵ��
		Timer timer = new Timer(); 
		//2.����һ��MyTimerTask��ʵ��
		MyTimerTask myTimerTask = new MyTimerTask("No.1");
		//3.ͨ��timer��ʱ��Ƶ�ʵ���myTimerTask��ҵ���߼�
		//����һ��ִ�����ڵ�ǰʱ�������֮��֮��ÿ��һ��ִ��һ��
		//timer.schedule(myTimerTask, 2000L, 1000L);
		/*
		 * ��ȡ��ǰ��ʱ�䣬�����óɾ��뵱ǰʱ������֮���ʱ��
		 * ���統ǰ��2016-11-10 23:59:57
		 * �����ú��ʱ����Ϊ2016-11-11 00:00:00
		 */
		Calendar calendar = Calendar.getInstance(); 
		SimpleDateFormat sf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sf.format(calendar.getTime()));
		calendar.add(Calendar.SECOND, 3);
		//--------------schedule���÷�---------------
		/*
		 * 1.��ʱ����ڻ��߳���time��ʱ��ִ����ִ��һ��task
		 * ����2016-11-11 00:00:00ִ��һ��task:��ӡ���������
		 */
		//myTimerTask.setName("schedule1");
		//timer.schedule(myTimerTask, calendar.getTime());
		
		/*
		 * 2.ʱ����ڻ��߳���timeʱ�״�ִ��task
		 * ֮��ÿ��period�����ظ�ִ��һ��task
		 * ����2016-11-11 00:00:00��һ��ִ��task:��ӡ���������
		 * ֮��ÿ������ִ��һ��task
		 */
		//myTimerTask.setName("schedule2");
		//timer.schedule(myTimerTask, calendar.getTime(),2000);
		
		/*
		 * 3.�ȴ�delay�����ִ����ִ��һ��task
		 * ��������2016-11-11 00:00:00
		 * ����2016-11-11 00:00:01ִ��һ��task����ӡ���������
		 */
		myTimerTask.setName("schedule3");
		timer.schedule(myTimerTask, 3000); 
		System.out.println("scheduled time is"+sf.format(myTimerTask.scheduledExecutionTime()));
		/*
		 * 4.�ȴ�delay������״�ִ��task
		 * ֮��ÿ��period�����ظ�ִ��һ��task
		 * ��������2016-11-11 00:00:00
		 * ����2016-11-11 00:00:01��һ��ִ��task:��ӡ���������
		 * ֮��ÿ������ִ��һ��task
		 */
		  //myTimerTask.setName("schedule4");
		  //timer.schedule(myTimerTask, 3000, 2000);
		  
		 //---------  scheduleAtFixedRate���÷�   ----------
		  /*
		   * 1.ʱ����ڻ򳬹�timeʱ�״�ִ��task
		   *   ֮��ÿ��period�����ظ�ִ��һ��task
		   */
		//myTimerTask.setName("scheduleAtFixedRate1");
		//timer.scheduleAtFixedRate(myTimerTask, calendar.getTime(), 2000); 
		
		/*
		 * 2.�ȴ�delay������״�ִ��task
		 * ֮��ÿ��period�����ظ�ִ��һ��task
		 */
		 //myTimerTask.setName("scheduleAtFixedRate2");
		// timer.scheduleAtFixedRate(myTimerTask, 3000, 2000); 
			
	}
}
