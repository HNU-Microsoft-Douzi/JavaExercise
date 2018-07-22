
public class Computer {
	
	private int state = 3;//当前为正常状态
	public void run() throws LanPingException,MaoYanException{
		if(state == 2) {
			throw new LanPingException("电脑蓝屏了");
		}
		else if(state == 3) {
			throw new MaoYanException("电脑冒烟了");
		}
		System.out.println("电脑运行");
	}
	
	public void reset() {
		System.out.println("电脑重启");
	}
}
