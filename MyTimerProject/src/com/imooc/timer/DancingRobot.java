package com.imooc.timer;

import java.text.SimpleDateFormat;
import java.util.TimerTask;

public class DancingRobot extends TimerTask {

	@Override
	public void run() {
		 //	获取最近的一次任务执行的时间，并将其格式化
		 SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 System.out.println("Schediled exec time is:"+sf.format(scheduledExecutionTime()));
		 System.out.println("Dancing happily!");
	}

}
