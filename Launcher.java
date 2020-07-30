package testing;

import java.util.ArrayList;
import java.util.List;

public class Launcher {

	public static void main(String[] args) {
		// var modifiée par l'opération n-1 -> boucle infinie
		/*for (int n=1; n!=0; n--)
			System.out.println(n-1);*/
		myFunc(1057);
	}
	
	public static List<Integer> myFunc(int motErreur){
		int hexaTab[] = {0x1, 0x2, 0x4, 0x8, 0x10, 0x20, 0x40, 0x80, 0x100, 0x200,
				0x400, 0x800, 0x1000, 0x2000, 0x4000, 0x8000, 0x10000, 0x20000, 0x40000, 0x80000,
				0x100000, 0x200000, 0x400000, 0x800000, 0x1000000, 0x2000000, 0x4000000, 0x8000000, 
				0x10000000, 0x20000000, 0x40000000, 0x80000000};
		List<Integer> myResult = new ArrayList<Integer>();
		// valeur 0 jamais testée en binaire car tjrs egale à 0 (utiliser int
		if ((motErreur) == 0) {  // position bit 1 
			System.err.println("position bit 0 : " + (motErreur & 0b0));
			myResult.add(0b0);
		} else {
			for (int i=0; i<hexaTab.length; i++) {
				if ((motErreur & hexaTab[i]) == hexaTab[i]) { // position bit 1 
					System.err.println("position bit "+i+" : " + (motErreur & hexaTab[i]));
					myResult.add(hexaTab[i]);
				}
			}
		}
		System.out.println(myResult);
		return null;
	}

}
