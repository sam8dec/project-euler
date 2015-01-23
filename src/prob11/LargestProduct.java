package prob11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LargestProduct {

	public static void main(String[] args) throws FileNotFoundException {
		File F = new File("/home/sabanerjee/Eclipse/workspace/projecteuler/src/prob11/input.txt");
		Scanner in = new Scanner(F);
		int i,j,numbers[][]=new int[20][20];
		for(i=0;i<20;i++) {
			for(j=0;j<20;j++) {
				numbers[i][j]=in.nextInt();
			}
		}
		int max = 0;
		int p=0;
		for(i=0;i<20;i++) {
			for(j=0;j<20;j++) {
				if(j<=16) {
					p=numbers[i][j]*numbers[i][j+1]*numbers[i][j+2]*numbers[i][j+3];
					if(p>max) max=p;
				}
				if(i<=16) {
					p=numbers[i][j]*numbers[i+1][j]*numbers[i+2][j]*numbers[i+3][j];
					if(p>max) max=p;
				}
				if(i<=16 && j<=16) {
					p=numbers[i][j]*numbers[i+1][j+1]*numbers[i+2][j+2]*numbers[i+3][j+3];
					if(p>max) max=p;
				}
				if(i>=3 && j<=16) {
					p=numbers[i][j]*numbers[i-1][j+1]*numbers[i-2][j+2]*numbers[i-3][j+3];
					if(p>max) max=p;
				}
			}
		}
		System.out.println(max);
	}

}
