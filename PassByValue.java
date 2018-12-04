package alpha;

public class PassByValue {
	
	public static void main(String[] args) {
		
		int a = 5;
		demo d = new demo(10);
		System.out.println(a + "   " + d);
		alter(a, d);
		System.out.println(a + "   " + d);		
	}
	
	public static void alter(int a, demo d) {
		a = 10;
		d.setval(20);
		d = new demo(30);
	}
	
}

class demo {
	int val;
	public demo(int val) {
		this.val = val;
	}
	public void setval(int val) {
		this.val = val;
	}
	@Override
	public String toString() {
		return val + "";
	}
}

