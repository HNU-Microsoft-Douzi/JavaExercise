
public class exception_test {
	
	public static void main(String [] args) {
		Teacher t = new Teacher("张老师");
		try {
			t.prelect();
		}catch(PrelectException e) {
			System.out.println("我们在这个地方捕获到了老师能够处理的冒烟异常");
		}
	}
}
