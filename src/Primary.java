import java.util.*;

public class Primary {

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
	}

	public static void main(String[] args) {
		new Primary();
	}

}