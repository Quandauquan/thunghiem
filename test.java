package Lab4;

public class test {
	public static void test(int i) {
		if(i<5) {
			
		 test2(i+1);
		 test(i+1);
		 test1(i+1);
		}
	}
	public static void test2(int i) {
		if(i < 5) {
						System.out.print("*");
		}
	}
	public static void test1(int i) {
		if(i < 5) {
						System.out.print(i);
		}
	}
	public static void main(String[] args) {
		//test(0);
		char a = 'O';
		int num = a;
		String b = "m";
		System.out.println( a);
			
			}
		
	
}
