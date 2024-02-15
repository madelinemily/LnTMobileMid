import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car extends Vehicle{
	private Integer enternSystem;

	@Override
	public void inputData(Scanner scanner) {
		do {
			System.out.print("Input brand [>= 5]: ");
	        brand = scanner.nextLine();
		}while(brand.length() < 5);
		do {
			System.out.print("Input name [>= 5]: ");
	        name = scanner.nextLine();
		}while(name.length() < 5);
		Matcher matcher;
        do {
        	String pola = "^[A-Z]\\s\\d{1,4}\\s[A-Z]{1,3}$";
        	Pattern pattern = Pattern.compile(pola);
        	System.out.print("Input license: ");
        	licenseNumber = scanner.nextLine();
        	matcher = pattern.matcher(licenseNumber);
        }while(!matcher.matches());
        do {
        	System.out.print("Input top speed [100 <= topSpeed <= 250]: ");
            topSpeed = scanner.nextInt();
            scanner.nextLine();
		}while(topSpeed < 100 || topSpeed > 250);
        do {
        	System.out.print("Input gas capacity [30 <= gasCap <= 60]: ");
            gasCap = scanner.nextInt();
            scanner.nextLine();
		}while(gasCap < 30 || gasCap > 60);
        do {
        	System.out.print("Input wheel [4 <= wheel <= 6]: ");
            wheel = scanner.nextInt();
            scanner.nextLine();
		}while(wheel < 4 || wheel > 6);
        do {
        	System.out.print("Input type [SUV | Supercar | Minivan]: ");
            vehicleType = scanner.nextLine();
        }while(!vehicleType.equals("SUV") && !vehicleType.equals("Supercar") && !vehicleType.equals("Minivan"));
        do {
        	System.out.print("Input entertaintment system amount [>= 1]: ");
            enternSystem = scanner.nextInt();
            scanner.nextLine();
		}while(enternSystem < 1);
	}

	@Override
	public void viewData() {
		System.out.println("Brand: " + brand);
        System.out.println("Name: " + name);
        System.out.println("License Plate: " + licenseNumber);
        System.out.println("Type: " + vehicleType);
        System.out.println("Gas Capacity: " + gasCap);
        System.out.println("Top Speed: " + topSpeed);
        System.out.println("Wheel(s): " + wheel);
        System.out.println("Entertainment System: " + enternSystem);
        System.out.println("Turning on entertainment system...");
        if(vehicleType == "Supercar") {
        	System.out.println("Boosting!");
        }
	}

	@Override
	public void viewSingleData() {
		System.out.println("Car " + name);
		
	}


}
