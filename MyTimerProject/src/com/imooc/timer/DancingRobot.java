package com.imooc.timer;

import java.text.SimpleDateFormat;
import java.util.TimerTask;

public class DancingRobot extends TimerTask {

	@Override
	public void run() {
		 //	��ȡ�����һ������ִ�е�ʱ�䣬�������ʽ��
		 SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 System.out.println("Schediled exec time is:"+sf.format(scheduledExecutionTime()));
		 System.out.println("Dancing happily!");
	}

}
