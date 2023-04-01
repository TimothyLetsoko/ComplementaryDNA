package complementaryDNA;

import java.util.Scanner;

public class ComplementaryDNA {
	public static String makeComplement(String dna) {
		char[] DNA = dna.toUpperCase().toCharArray();
		String complement = "";
		
		for(int i=0;i<DNA.length;i++) {
			if(DNA[i]=='A') {
				complement+="T";
			}else if(DNA[i]=='T') {
				complement+="A";
			}else if(DNA[i]=='G') {
				complement+="C";
			}else {
				complement += "G";
			}
		}		
		return complement;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		try {
			System.out.print("Enter DNA sequence ONLY to get complementary sequence:");
			
			String sequence = scan.nextLine();
			scan.close();
			
			System.out.println(makeComplement(sequence));
		}catch(Exception e) {
			System.out.println("Something went wrong.");
		}
	}

}
