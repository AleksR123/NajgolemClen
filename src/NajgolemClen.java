import java.util.Scanner;

public class NajgolemClen {
 public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	System.out.println("Najgolem clen vo niza");
	System.out.print("Vcitaj broj na clenovi vo niza ");
	int n = input.nextInt();
	int niza[] = new int[n];
	System.out.println("Vcitaj clenovi vo niza:");
	for (int i = 0; i < niza.length; i++) {
	System.out.print(i + "-->");
	niza[i] = input.nextInt(); // ucitaj niza[i] - i-ti clen niza
	}
	int tmax = niza[0];
	System.out.print("niza: ");
	for (int i = 0; i < niza.length; i++)
	System.out.print(niza[i] + " "); // zapis niza[i] - i-ti clen niza
	// Postapka za trazenje maksimum vo tmax
	for (int i = 1; i < niza.length; i++) {
	if (tmax < niza[i])
	tmax = niza[i];
	}
	System.out.println("\nNajgolem clen vo nizata e: " + tmax);
	}
	}

