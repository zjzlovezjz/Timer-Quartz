package com.imooc.timer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;

public class MyTimer {

	public static void main(String[] args) {
		//1.创建一个timer实例
		Timer timer = new Timer(); 
		//2.创建一个MyTimerTask的实例
		MyTimerTask myTimerTask = new MyTimerTask("No.1");
		//3.通过timer定时定频率调用myTimerTask的业务逻辑
		//即第一次执行是在当前时间的两秒之后，之后每隔一秒执行一次
		//timer.schedule(myTimerTask, 2000L, 1000L);
		/*
		 * 获取当前的时间，并设置成距离当前时间三秒之后的时间
		 * 例如当前是2016-11-10 23:59:57
		 * 则设置后的时间则为2016-11-11 00:00:00
		 */
		Calendar calendar = Calendar.getInstance(); 
		SimpleDateFormat sf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sf.format(calendar.getTime()));
		calendar.add(Calendar.SECOND, 3);
		//--------------schedule的用法---------------
		/*
		 * 1.在时间等于或者超过time的时候执行且执行一次task
		 * 如在2016-11-11 00:00:00执行一次task:打印任务的名字
		 */
		//myTimerTask.setName("schedule1");
		//timer.schedule(myTimerTask, calendar.getTime());
		
		/*
		 * 2.时间等于或者超过time时首次执行task
		 * 之后每隔period毫秒重复执行一次task
		 * 如在2016-11-11 00:00:00第一次执行task:打印任务的名字
		 * 之后每隔两秒执行一次task
		 */
		//myTimerTask.setName("schedule2");
		//timer.schedule(myTimerTask, calendar.getTime(),2000);
		
		/*
		 * 3.等待delay毫秒后执行且执行一次task
		 * 如现在是2016-11-11 00:00:00
		 * 则在2016-11-11 00:00:01执行一次task：打印任务的名字
		 */
		myTimerTask.setName("schedule3");
		timer.schedule(myTimerTask, 3000); 
		System.out.println("scheduled time is"+sf.format(myTimerTask.scheduledExecutionTime()));
		/*
		 * 4.等待delay毫秒后首次执行task
		 * 之后每隔period毫秒重复执行一次task
		 * 如现在是2016-11-11 00:00:00
		 * 则在2016-11-11 00:00:01第一次执行task:打印任务的名字
		 * 之后每隔两秒执行一次task
		 */
		  //myTimerTask.setName("schedule4");
		  //timer.schedule(myTimerTask, 3000, 2000);
		  
		 //---------  scheduleAtFixedRate的用法   ----------
		  /*
		   * 1.时间等于或超过time时首次执行task
		   *   之后每隔period毫秒重复执行一次task
		   */
		//myTimerTask.setName("scheduleAtFixedRate1");
		//timer.scheduleAtFixedRate(myTimerTask, calendar.getTime(), 2000); 
		
		/*
		 * 2.等待delay毫秒后首次执行task
		 * 之后每隔period毫秒重复执行一次task
		 */
		 //myTimerTask.setName("scheduleAtFixedRate2");
		// timer.scheduleAtFixedRate(myTimerTask, 3000, 2000); 
			
	}
}
