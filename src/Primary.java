import java.util.*;

public class Primary {
	// Michael Edi Lee - 2540123901
	// Kelas LnT Mobile App Development - F
	// Praetorian : Nelsen
	// Due Date 27 Feb 2022

	Scanner scan = new Scanner(System.in);

	ArrayList<Integer> number = new ArrayList<>();
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

		
		
//		FIX STARTING FROM HERE
		
		int number;
		do {
			System.out.println("Pick a vehicle number to test drive [ 0 - " + vehicleType.size() + "] ");
			System.out.print("[Enter '0' to exit]: ");
			number = scan.nextInt();
			scan.nextLine();
			if (number == 0) {
				System.out.println("Application is Done!");
			}
		} while (number > +vehicleType.size());

		if (vehicleType.get(number).equals("Car")) {
			number -= 1;

			System.out.println("Brand : " + vehicleBrand.get(number));
			System.out.println("Name : " + name.get(number));
			System.out.println("License Plate : " + licenseNumber.get(number));
			System.out.println("Type : " + vehicleType.get(number));
			System.out.println("Gas Capacity : " + gasCap.get(number));
			System.out.println("Top Speed : " + topSpeed.get(number));
			System.out.println("Wheel(s) : " + wheel.get(number));
			System.out.println("Entertainment System : " + entertainmentSystem.get(number));

			// Use OOP "Turning on entertainment system...

			// But on Supercar. "Boosting!"

		} else if (vehicleType.get(number).equals("Motorcycle")) {
			number -= 1;

			System.out.println("Brand : " + vehicleBrand.get(number));
			System.out.println("Name : " + name.get(number));
			System.out.println("License Plate : " + licenseNumber.get(number));
			System.out.println("Type : " + vehicleType.get(number));
			System.out.println("Gas Capacity : " + gasCap.get(number));
			System.out.println("Top Speed : " + topSpeed.get(number));
			System.out.println("Wheel(s) : " + wheel.get(number));
			System.out.println("Helm : " + helm.get(number));

			// Motorcycle, "<name> is standing!"

			// If on motorcycle, Ask to input price of Helmet
			// Then print "Price : <Price>"

			vehicleBrand.remove(number);
			name.remove(number);
			licenseNumber.remove(number);
			vehicleType.remove(number);
			gasCap.remove(number);
			topSpeed.remove(number);
			wheel.remove(number);
			entertainmentSystem.remove(number);
		}

	}
	

//	void menu2() {
//		if(namesList.isEmpty()) {
//			System.out.println("Movie list is empty!");
//		}else {
//			for(int i = 0; i < namesList.size() - 1; i++) {
//				for(int j = 0; j < namesList.size() - i - 1; j++) {
//					if(ratingsList.get(j).compareTo(ratingsList.get(j + 1)) < 0) {
//						Collections.swap(namesList, j, j + 1);
//						Collections.swap(genresList, j, j + 1);
//						Collections.swap(ratingsList, j, j + 1);
//						Collections.swap(statusList, j, j + 1);
//					}
//				}
//			}
//			
//			for(int i = 0; i < namesList.size(); i++) {
//				System.out.println( "| " + (i + 1) + " | " + namesList.get(i) + " | " + genresList.get(i) + " | " + ratingsList.get(i) + " | " + statusList.get(i) + " |");
//			}
//		}
//	}

//	void menu3(String idNumber) {
//		if(namesList.isEmpty()) {
//			System.out.println("Movie list is empty!");
//		}else {
//			menu2();
//			
//			int rentChoice = 0;
//			
//			do {
//				System.out.print("Which movie do you want to rent? [1-1]\n>>");
//				rentChoice = scan.nextInt();
//				scan.nextLine();
//			}while(rentChoice < 1 || rentChoice > namesList.size());
//			
//			rentChoice -= 1;
//			namesList.get(rentChoice);
//			genresList.get(rentChoice);
//			ratingsList.get(rentChoice);
//			idList.get(rentChoice);
//			
//			int rentDuration = 0;
//			
//			do {
//				System.out.print("How many days do you want to borrow the movie> [1-7]\n>>");
//				rentDuration = scan.nextInt();
//				scan.nextLine();
//			}while(rentDuration < 1 || rentDuration > 7);
//			
//			double basePrice = 1000 * ratingsList.get(rentChoice);
//			double additionalPrice = 2000 * rentDuration;
//			double price = basePrice + additionalPrice;
//			
//			System.out.println("Rent Movie");
//			System.out.println("==========");
//			System.out.println("ID: TR-" + idList.get(rentChoice));
//			System.out.println("Movie: " + namesList.get(rentChoice));
//			System.out.println("Genre: " + genresList.get(rentChoice));
//			System.out.println("Rating: " + ratingsList.get(rentChoice));
//			System.out.println("Price: " + price);
//			
//			statusList.set(rentChoice, "Not available");
//		}
//	}


	public static void main(String[] args) {
		new Primary();
	}

}