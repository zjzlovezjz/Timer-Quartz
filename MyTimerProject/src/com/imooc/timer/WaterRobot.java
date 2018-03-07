package com.imooc.timer;

import java.util.Timer;
import java.util.TimerTask;

public class WaterRobot extends TimerTask{

	private Timer timer;
	
	public WaterRobot(Timer inputTimer){
		timer = inputTimer;
	}
	
	//�������Ϊ5
	private Integer bucketCapacity = 0;
	
	@Override
	public void run() {
		//��ˮֱ��Ͱ��Ϊֹ
		if(bucketCapacity < 5){
			System.out.println(" Add 1L water into the bucket");
			bucketCapacity++;
		}else{
		//ˮ��֮���ִֹͣ��
			System.out.println("The number of canceled task in timer is:"+timer.purge());
			cancel(); 
			System.out.println("The waterRobot has been aborted"); 
			System.out.println("The number of canceled task in timer is:"+timer.purge());
			System.out.println("Current water is "+ bucketCapacity + "L");
			//�ȴ������ӣ���ֹtimer�������������
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			timer.cancel();
		}	
	}

}
