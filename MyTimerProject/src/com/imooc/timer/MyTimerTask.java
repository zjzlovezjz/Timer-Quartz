package com.imooc.timer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimerTask;

public class MyTimerTask extends TimerTask{
    private String name;
    //计数器
    private Integer count = 0;
    public MyTimerTask(String inputName) {
    	name = inputName;
	}	
	@Override
	public void run() { 
		if(count < 3){
			//以yyyy-MM-dd HH:mm:ss的格式打印当前的时间
			Calendar calendar = Calendar.getInstance(); 
			SimpleDateFormat sf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			System.out.println("Current exec name is:"+sf.format(calendar.getTime()));
			//打印当前name的内容
			System.out.println("Current exec name is:"+name);	
			count++;
		}else{
			cancel();
			System.out.println("Task cancel!"); 
		}
		
		
		
		
	} 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}
