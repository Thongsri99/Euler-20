import java.math.*;

public class Factorial_digit_sum {

	public static void main(String[] args) {
		long sum = 0L;
		String total = String.valueOf(factorial(100));

		for (int i = 0; i < total.length(); i++) {
			// Need to subtract '0' to get the true value.
			int value = total.charAt(i) - '0';
			sum += value;
		}

		System.out.println(sum);
	}

	//The following is a recursive method to get 100!
	public static BigInteger factorial(int a) {
		BigInteger number = BigInteger.valueOf(a);

		if (number.intValue() == 1) {
			return number;
		} else
			return number.multiply(factorial(number.intValue() - 1));
	}
}
