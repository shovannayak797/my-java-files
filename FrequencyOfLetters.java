package myPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FrequencyOfLetters {
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a string ");
		String s="";
		try {
			s=br.readLine();
			s=s.toUpperCase();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int f[]=new int[26];
		int i;
		for(i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='A' && c<='Z')
				f[c-65]++;
		}
		for(i=0;i<26;i++) {
			if(f[i]!=0)
				System.out.printf("Frequency of %c is %d\n",(65+i),f[i]);
		}
	}
}




















