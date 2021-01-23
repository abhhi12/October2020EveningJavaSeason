package JavaSeason;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser = "Opera";

		switch (browser) {

		case "Chrome":
			System.out.println("launch chrome");
			break;

		case "Firefox":
			System.out.println("launch FF");
			break;

		case "Safari":
			System.out.println("launch Safari");
			break;

		case "IE":
			System.out.println("launch IE");
			break;

		default:
			System.out.println("Please pass the correct browser name : " + browser);
			break;
		}

	}

}
