package prob18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MaximumPathSum {
	
	public static void main(String[] args) throws FileNotFoundException {
		File F = new File("/home/sabanerjee/Eclipse/workspace/projecteuler/src/prob18/prob67.txt");
		Scanner in = new Scanner(F);
		int triangle[][] = new int[100][100];
		int path_cost[][] = new int[100][100];
		int i=0;
		while(in.hasNextLine()) {
			String str = in.nextLine();
			Scanner in2 = new Scanner(str);
			for(int j=0;j<=i;j++) {
				triangle[i][j] = in2.nextInt();
			}
			i++;
		}
		path_cost[0][0]=triangle[0][0];
		
		for(i=1;i<100;i++) {
			for(int j=0;j<=i;j++) {
				if(j==0) {
					path_cost[i][j] = triangle[i][j]+path_cost[i-1][j];
				} else if(j==i) {
					path_cost[i][j] = triangle[i][j]+path_cost[i-1][j-1];
				} else {
					int a = triangle[i][j]+path_cost[i-1][j-1];
					int b = triangle[i][j]+path_cost[i-1][j];
					path_cost[i][j] = (a>b)?a:b;
				}
			}
		}
		in.close();
		i--;
		int max=0;
		for(int k=0;k<=i;k++) {
			if(path_cost[i][k]>max) max=path_cost[i][k];
		}
		System.out.println(max);
	}

}
