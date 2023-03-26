/*13020210054
Rifdah Salsabila
jumat, 24 Maret 2023*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.*;
public class BacaString{
	public static void main (String[] args) throws IOException {
	String str;

	BufferedReader dataAIn = new BufferedReader (new InputStreamReader (System.in));
	System.out.println ("\nBaca string dan Integer: \n");
	
	System.out.println ("masukkan sebuah string: ");

	str= dataAIn.readLine();

	System.out.println ("String yang dibaca : "+ str);

	}

}