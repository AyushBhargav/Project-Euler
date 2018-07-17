import java.math.BigInteger;

public class Problem16 {

	public static void main(String[] args) {
		BigInteger b = new BigInteger("2");
		BigInteger num = new BigInteger("1");
		for(int i = 0; i < 1000; i++) {
			num = num.multiply(b);
		}
		String str = num.toString();
		int sum = 0;
		for(char c: str.toCharArray()) {
			int digit = (int)c - (int)'0';
			sum += digit;
		}
		System.out.println(sum);
	}

}
