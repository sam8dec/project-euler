package prob13;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class Addition {
	public static void main(String[] args) throws FileNotFoundException {
		File F = new File("/home/sabanerjee/Eclipse/workspace/projecteuler/src/prob13/input.txt");
		Scanner in = new Scanner(F);
		BigInteger bisum = new BigInteger("0");
		while(in.hasNextLine()) {
			String num = in.nextLine();
			BigInteger binum = new BigInteger(num);
			bisum = bisum.add(binum);
		}
		System.out.println(bisum);
		in.close();
	}

}
