/* O(log n) */
public class lcm {
	public static int recursiveGCD(int a, int b){
		if (b == 0)
			return a;
		return recursiveGCD(b,a%b);
	}
	
	public static int lcm(int a, int b){
		return a*b/recursiveGCD(a, b);
	}
	
	public static void main(String []a){
		System.out.print(lcm(81,63));
	}

}
