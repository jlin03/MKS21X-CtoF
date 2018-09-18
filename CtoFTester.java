public class CtoFTester {
	public static double celsiusToFahrenheit(double n) {
		return ((n - 32.0) * (5.0 / 9.0));
	}
	
	public static double fahrenheitToCelsius(double n) {
		return ((n * (9.0 / 5.0)) + 32.0);
	}
	
	public static void main(String[] args) {
		System.out.println(celsiusToFahrenheit(64));
		System.out.println(fahrenheitToCelsius(50));
		System.out.println(celsiusToFahrenheit(122));
		System.out.println(fahrenheitToCelsius(17.77777777));
	}
}