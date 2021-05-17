import wipro.Solution;

public class Main {
	public static void main(String[] args) {
		Solution countryCapital = new Solution();
		countryCapital.saveCoutryCapital("India", "Delhi");
		countryCapital.saveCoutryCapital("Japan", "Tokyo");
		countryCapital.saveCoutryCapital("Pakistan", "Islamabad");
		countryCapital.saveCoutryCapital("England", "London");
		countryCapital.saveCoutryCapital("China", "Bejing");
		countryCapital.saveCoutryCapital("Nepal", "Bhootan");
		countryCapital.saveCoutryCapital("Afganistan", "Kabul");
		System.out.println(countryCapital.getCapital("India"));
		System.out.println(countryCapital.getCountry("Delhi"));
		System.out.println(countryCapital.getAllCountry());
		System.out.println(countryCapital.capitalCountry());
	}
}
