package prob42;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleWord {
	public static boolean sieve[] = new boolean[1300];
	public static void main(String[] args) throws FileNotFoundException {
		int i,j=0,count=0;
		for(i=1;(j=i*(i+1)/2)<1300;i++) sieve[j]=true;
		File F = new File("src/prob42/words.txt");
		Scanner in = new Scanner(F);
		String allWords = in.nextLine();
		String[] words = allWords.split(",");
		for(String word:words) {
			//System.out.println(word);
			word = word.substring(1,word.length()-1); // removing quotes
			int s=0;
			for(char c: word.toCharArray()) s+=c-'A'+1;
			System.out.println(word);
			if(sieve[s]) count++;
		}
		System.out.println(count);
	}

}
