package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import workers.Gain;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Gain> gain = new ArrayList<>();
		
		System.out.println("WELLCOME \n how many workers do you want file? ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.printf("name of #%d worker: ", i);
			String name = sc.nextLine();
			System.out.print("hours worker: ");
			int hours = sc.nextInt();
			System.out.print("value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			gain.add(new Gain(name, hours, valuePerHour));
			
		}
		
		for(Gain g : gain) {
			System.out.println(g.toString());
		}
		
		
		sc.close();

	}

}
