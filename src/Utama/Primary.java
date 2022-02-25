package Utama;

import java.util.ArrayList;
import java.util.Scanner;

import Data.Car;
import Data.Motorcycle;

public class Primary {
	// Michael Edi Lee - 2540123901
	// Kelas LnT Mobile App Development - F
	// Praetorian : Nelsen
	// Due Date 27 Feb 2022

	Scanner scan = new Scanner(System.in);

	ArrayList<String> vehicleType = new ArrayList<>(); // Car or Motorcycle
	ArrayList<String> vehicleBrand = new ArrayList<>();; // minimum 5character
	ArrayList<String> name = new ArrayList<>();; // minimum 5character
	ArrayList<String> licenseNumber = new ArrayList<>();; // "A-Z" + " " + "minimum 1digit, max 4digit" + " " + "letter
															// 1-3"
	ArrayList<Integer> topSpeed = new ArrayList<>(); // 100-250
	ArrayList<Integer> gasCap = new ArrayList<>(); // 30-60
	ArrayList<Integer> wheel = new ArrayList<>(); // car 4-6, motorcycle 2-3
	ArrayList<Integer> entertainmentSystem = new ArrayList<>(); // only for car minimum 1
	ArrayList<String> carType = new ArrayList<>();
	ArrayList<Integer> helm = new ArrayList<>(); // only for motorcycle minimum 1

	public Primary() {
		int option;
		do {
			welcome();
			option = forOption();
			if (option == 1) {
				input();
			} else if (option == 2) {
				view();
			}
		} while (option != 3);
		System.out.println("Application is Done!");

	}

	void welcome() {
		System.out.println("\nPT Musang");
		System.out.println("===============");
		System.out.println("1. Input Vehicle");
		System.out.println("2. View Vehicle");
		System.out.println("3. Exit");
		System.out.print(">> ");
	}

	Integer forOption() {

		int choose = 0;
		do {
			try {
				System.out.print(">> ");
				choose = scan.nextInt();
				scan.nextLine();
			} catch (Exception e) {
				System.out.println("Only number 1, 2, 3!");
			}
		} while (choose < 1 || choose > 3);

		return choose;
	}

	void input() {
		System.out.println("PT Musang\n");

		String tempVehicleType;
		do {
			System.out.print("Input type [ Car | Motorcycle ]: ");
			tempVehicleType = scan.nextLine();
		} while (!tempVehicleType.equals("Car") && !tempVehicleType.equals("Motorcycle"));
		vehicleType.add(tempVehicleType);

		if (tempVehicleType.equals("Car")) {
			String tempVehicleBrand;
			do {
				System.out.print("Input Brand [ char more than 5 ]: ");
				tempVehicleBrand = scan.nextLine();
			} while (tempVehicleBrand.length() <= 4);
			vehicleBrand.add(tempVehicleBrand);

			String tempName;
			do {
				System.out.print("Input name [ char more than 5 ]: ");
				tempName = scan.nextLine();
			} while (tempName.length() <= 4);
			name.add(tempName);

			String tempLicenseNumber;
			do {
				System.out.print("Input License Number: ");
				tempLicenseNumber = scan.nextLine();
			} while (tempLicenseNumber.contains(" ") && tempLicenseNumber.contains(" "));
			licenseNumber.add(tempLicenseNumber);

			int tempTopSpeed;
			do {
				System.out.print("Input Top Speed [100 <= topSpeed <= 250]: ");
				tempTopSpeed = scan.nextInt();
			} while (!(tempTopSpeed >= 100 && tempTopSpeed <= 250));
			topSpeed.add(tempTopSpeed);

			int tempGasCap;
			do {
				System.out.print("Input gas capacity [30 <= gasCap <= 60]: ");
				tempGasCap = scan.nextInt();
			} while (!(tempGasCap >= 30 && tempGasCap <= 60));
			gasCap.add(tempGasCap);

			int tempWheel;
			do {
				System.out.print("Input wheel [4 <= wheel <= 6]: ");
				tempWheel = scan.nextInt();
			} while (!(tempWheel >= 4 || tempWheel <= 6));
			wheel.add(tempWheel);

			// Entertainment
			int tempEntertainmentSystem;
			do {
				System.out.print("Input wheel [4 <= wheel <= 6]: ");
				tempEntertainmentSystem = scan.nextInt();
			} while (!(tempEntertainmentSystem >= 1));
			entertainmentSystem.add(tempEntertainmentSystem);

			// SUV/Supercar/Minivan
			String tempCarType;
			do {
				System.out.print("Input type [ SUV | Supercar | Minivan ]: ");
				tempCarType = scan.nextLine();
				scan.nextLine();
			} while (!tempCarType.equals("SUV") && !tempCarType.equals("Supercar") && !tempCarType.equals("Minivan"));
			carType.add(tempCarType);

		} else if (tempVehicleType.equals("Motorcycle")) {
			String tempVehicleBrand;
			do {
				System.out.print("Input Brand [ char more than 5 ]: ");
				tempVehicleBrand = scan.nextLine();
			} while (tempVehicleBrand.length() <= 4);
			vehicleBrand.add(tempVehicleBrand);

			String tempName;
			do {
				System.out.print("Input name [ char more than 5 ]: ");
				tempName = scan.nextLine();
			} while (tempName.length() <= 4);
			name.add(tempName);

			String tempLicenseNumber;
			do {
				System.out.print("Input License Number: ");
				tempLicenseNumber = scan.nextLine();
			} while (tempLicenseNumber.contains(" ") && tempLicenseNumber.contains(" "));
			licenseNumber.add(tempLicenseNumber);

			int tempTopSpeed;
			do {
				System.out.print("Input Top Speed [100 <= topSpeed <= 250]: ");
				tempTopSpeed = scan.nextInt();
			} while (!(tempTopSpeed >= 100 && tempTopSpeed <= 250));
			topSpeed.add(tempTopSpeed);

			int tempGasCap;
			do {
				System.out.print("Input gas capacity [30 <= gasCap <= 60]: ");
				tempGasCap = scan.nextInt();
			} while (!(tempGasCap >= 30 && tempGasCap <= 60));
			gasCap.add(tempGasCap);

			int tempWheel;
			do {
				System.out.print("Input wheel [2 <= wheel <= 3]: ");
				tempWheel = scan.nextInt();
			} while (!(tempWheel >= 2 && tempWheel <= 3));
			wheel.add(tempWheel);

			// Helm
			int tempHelm;
			do {
				System.out.print("Input helm [Minimum 1]: ");
				tempHelm = scan.nextInt();
			} while (!(tempHelm >= 1));
			helm.add(tempHelm);
		}

		System.out.println("ENTER to return");
		scan.nextLine();

	}

	void view() {
		System.out.println("|------------PT Musang-----------|");
		System.out.println("|--------------------------------|");
		System.out.printf("|%-5s|%-10s|%-15s|\n", "No", "Type", "Name");
		System.out.println("|--------------------------------|");

		for (int i = 0; i < name.size(); i++) {
			System.out.printf("|%-5s|%-10s|%-15s|\n", i + 1, vehicleType.get(i), name.get(i));
			System.out.println("|--------------------------------|");
		}

//				FIX STARTING FROM HERE
		int number;

		do {
			System.out.println("Pick a vehicle number to test drive [ 0 - " + vehicleType.size() + "] ");
			System.out.println("[Enter '0' to exit]: ");
			number = scan.nextInt() - 1;
			scan.nextLine();

			String a = vehicleType.get(number);

//			if (number == -1) {
//				System.out.println("Application is Done!");
//			} else 
			if (a.equals("Car")) {
				vehicleBrand.get(number);
				name.get(number);
				licenseNumber.get(number);
				carType.get(number);
				gasCap.get(number);
				topSpeed.get(number);
				wheel.get(number);
				entertainmentSystem.get(number);

				System.out.print("Brand : ");
				System.out.println(vehicleBrand.get(number));

				System.out.println("Brand : " + vehicleBrand.get(number));
				System.out.println("Name : " + name.get(number));
				System.out.println("License Plate : " + licenseNumber.get(number));
				System.out.println("Type : " + vehicleType.get(number));
				System.out.println("Gas Capacity : " + gasCap.get(number));
				System.out.println("Top Speed : " + topSpeed.get(number));
				System.out.println("Wheel(s) : " + wheel.get(number));
				System.out.println("Entertainment System : " + entertainmentSystem.get(number));

				if (carType.get(number).equals("Supercar")) {
					Car c = new Car();
					System.out.println(c.fastCar());
				} else {
					Car c = new Car();
					System.out.println(c.notFastCar());
				}

			} else if (a.equals("Motorcycle")) {
				vehicleBrand.get(number);
				name.get(number);
				licenseNumber.get(number);
				carType.get(number);
				gasCap.get(number);
				topSpeed.get(number);
				wheel.get(number);
				helm.get(number);

				System.out.println("Brand : " + vehicleBrand.get(number));
				System.out.println("Name : " + name.get(number));
				System.out.println("License Plate : " + licenseNumber.get(number));
				System.out.println("Type : " + vehicleType.get(number));
				System.out.println("Gas Capacity : " + gasCap.get(number));
				System.out.println("Top Speed : " + topSpeed.get(number));
				System.out.println("Wheel(s) : " + wheel.get(number));
				System.out.println("Helm : " + helm.get(number));

				// Motorcycle, "<name> is standing!"
				Motorcycle m = new Motorcycle();
				System.out.print(name + " ");
				System.out.println(m.motor());

				// If on motorcycle, Ask to input price of Helmet
				int price;
				System.out.println("Input price of helm: Rp");
				price = scan.nextInt();
				
				// Then print "Price : <Price>"
				System.out.println("Price : " + price);

			}

		} while (number > vehicleType.size());
	}

	public static void main(String[] args) {
		new Primary();
	}

}
