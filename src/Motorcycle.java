import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Motorcycle extends Vehicle{
	private Integer helmAmount;

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
        	System.out.print("Input wheel [2 <= wheel <= 3]: ");
            wheel = scanner.nextInt();
            scanner.nextLine();
		}while(wheel < 2 || wheel > 3);
        do {
        	System.out.print("Input type [Automatic | Manual]: ");
            vehicleType = scanner.nextLine();
        }while(!vehicleType.equals("Automatic") && !vehicleType.equals("Manual"));
        do {
        	System.out.print("Input helm amount [>= 1]: ");
            helmAmount = scanner.nextInt();
            scanner.nextLine();
        }while(helmAmount < 1);
	}
	
	public void viewData(Scanner scanner) {
		System.out.println("Brand: " + brand);
        System.out.println("Name: " + name);
        System.out.println("License Plate: " + licenseNumber);
        System.out.println("Type: " + vehicleType);
        System.out.println("Gas Capacity: " + gasCap);
        System.out.println("Top Speed: " + topSpeed);
        System.out.println("Wheel(s): " + wheel);
        System.out.println("Helm Amount: " + helmAmount);
        System.out.println(name + " is standing!");
        System.out.println("Input price: ");
        Integer price = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Price: " + price);
	}

	public Integer getHelmAmount() {
		return helmAmount;
	}

	public void setHelmAmount(Integer helmAmount) {
		this.helmAmount = helmAmount;
	}

	@Override
	public void viewSingleData() {
		System.out.println("Motorcycle " + name);
		
	}

	@Override
	public void viewData() {
		// TODO Auto-generated method stub
		
	}

}
