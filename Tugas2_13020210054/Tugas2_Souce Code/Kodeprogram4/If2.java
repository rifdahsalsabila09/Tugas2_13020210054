/*13020210054
Rifdah Salsabila
Jumat, 24 Maret 2023*/

import java.util.Scanner;
public class If2{
	public static void main (String[] args) {
		int a;
		Scanner masukan=new Scanner (System.in);

		System.out.print ("Contoh If dua kasus \n");

		System.out.print ("Ketikkan suatu nilai integer :");
		a=masukan.nextInt();

		if (a >= 0) {
			System.out.println ("Nilai a positif "+ a);
		}else 
		{
			System.out.println ("Nilai a negatif "+ a);
		}

	}
}