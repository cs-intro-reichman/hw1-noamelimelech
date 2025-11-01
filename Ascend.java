// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
	int max = Integer.parseInt(args[0]);
	int x = (int) (Math.random() * max);
	int a = (int) (Math.random() * max);
	int b = (int) (Math.random() * max);
	int maxAXB = Math.max(Math.max(x, a), b);
	int minAXB = Math.min(Math.min(a, x), b);
	int midAXB =(int) (a + b + x ) - (maxAXB + minAXB);
	System.out.println(x + " " + a + " " + b);
	System.out.println(minAXB + " " + midAXB + " " + maxAXB);





	}
}
