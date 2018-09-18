public class CtoFTester.java() {
	public double celsiusToFahrenheit(double n) {
		return ((n - 32) * (5 / 9));
	}
	
	public double fahrenheittoCelsius(double n) {
		return ((n * (9 / 5)) + 32);
	}
	
	public static void main(String[] args) {
		celsiusToFahrenheit(64);
		fahrenheittoCelsius(50);
	}
}