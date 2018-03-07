package com.imooc.timer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimerTask;

public class MyTimerTask extends TimerTask{
    private String name;
    //������
    private Integer count = 0;
    public MyTimerTask(String inputName) {
    	name = inputName;
	}	
	@Override
	public void run() { 
		if(count < 3){
			//��yyyy-MM-dd HH:mm:ss�ĸ�ʽ��ӡ��ǰ��ʱ��
			Calendar calendar = Calendar.getInstance(); 
			SimpleDateFormat sf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			System.out.println("Current exec name is:"+sf.format(calendar.getTime()));
			//��ӡ��ǰname������
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
