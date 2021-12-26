package filiPack;

public class TestClass {

	public static void main(String[] args) {
		int yValue = counter();
		System.out.println(yValue);
				
	}
	
	public static int counter() {
		int x = 0;
		int y = 5;
		while (x<5) {
			y++;
			x++;
		}
		return x;
				
	}

}
