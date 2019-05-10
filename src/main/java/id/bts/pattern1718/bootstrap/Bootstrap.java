package id.bts.pattern1718.bootstrap;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import id.bts.pattern1718.services.Pattern17Generator;
import id.bts.pattern1718.services.Pattern18Generator;

@Component
public class Bootstrap implements CommandLineRunner {

	Pattern17Generator pattern17Generator;
	Pattern18Generator pattern18Generator;

	public Bootstrap(Pattern17Generator pattern17Generator, Pattern18Generator pattern18Generator) {
		super();
		this.pattern17Generator = pattern17Generator;
		this.pattern18Generator = pattern18Generator;
	}

	@Override
	public void run(String... args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukan Size segitiga: ");
		int size = scanner.nextInt();
		
		pattern17Generator.generatePattern17(size);
		pattern18Generator.generatePattern18(size);
		
		scanner.close();
	}

}
