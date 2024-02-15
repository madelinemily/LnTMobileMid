//Madeline Emily/ 2602083575

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Vehicle> vehicle = new ArrayList<>();
		
		do{
			System.out.println("Choose menu:");
			System.out.println("1. Insert");
			System.out.println("2. View");
			Integer input = scanner.nextInt();
			scanner.nextLine();
			
			switch(input) {
			case 1:
				System.out.print("Input type [ Car | Motorcycle ]: ");
		        String vehicleType = scanner.nextLine();

		        if (vehicleType.equalsIgnoreCase("Car")) {
		        	Car car = new Car();
                    car.inputData(scanner);
                    vehicle.add(car);
		        } else if (vehicleType.equalsIgnoreCase("Motorcycle")) {
		        	Motorcycle motorcycle = new Motorcycle();
                    motorcycle.inputData(scanner);
                    vehicle.add(motorcycle);
		        } else {
		            System.out.println("Invalid vehicle type.");
		            return;
		        }
		        break;
			case 2:
				for (Vehicle v : vehicle) {
                    v.viewSingleData();
                }
				System.out.println("Pick a vehicle number to test drive[Enter '0' to exit]: ");
				
				Integer testDrive = scanner.nextInt();
				scanner.nextLine();
				
				if(testDrive != 0) {
					Vehicle pointer = vehicle.get(testDrive - 1);
					if(pointer instanceof Motorcycle) {
						((Motorcycle) pointer).viewData(scanner);
					}
					pointer.viewData();
				}
                break;
			default:
                System.out.println("Invalid menu choice.");
			}
		}while(true);
	}
}
