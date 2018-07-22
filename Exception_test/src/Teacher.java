
public class Teacher {
	
	private static String name;
	private Computer cmpt;
	
	public Teacher(String name) {
		Teacher.name = name;
		cmpt = new Computer();
	}
	
	public void prelect() throws PrelectException {
		try {
			cmpt.run();
		}catch(LanPingException e) {
			System.out.println("电脑蓝屏了，准备开始重启");
			cmpt.reset();
		}catch(MaoYanException e) {
			System.out.println("电脑冒烟了");
			//造成的影响是，老师无法继续上课了，所以抛一个老师可以处理的异常
			throw new PrelectException("由于电脑冒烟，您无法继续上课");
		}
		
		System.out.println("讲课");
	}
}
