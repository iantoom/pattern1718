package id.bts.pattern1718.services;

import org.springframework.stereotype.Service;

@Service
public class Pattern18Generator {

	public void generatePattern18(int size) {

		// Print Baseline
		for (int i = 0; i < size; i++) {
			System.out.print("*");
		}
		System.out.println("");
		System.out.println("");
		
		for (int i = 1; i < size; i++) {
			
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			
			System.out.print("*");
			
			for (int j = 0; j < size - (2 + i); j++) {
				System.out.print(" ");
			}
			
			if (i < size - 1) {
				System.out.print("*");
			}
			
			System.out.println(" ");
			System.out.println(" ");
		}
	}

}
