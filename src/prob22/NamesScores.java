package prob22;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class NamesScores {
	public static int value(String s) {
		int v = 0;
		for(char c : s.toCharArray()) v+=c-'A'+1;
		return v;
	}
	public static void main(String[] args) throws FileNotFoundException {
		Map<String,Integer> names = new TreeMap<String,Integer>();
		String nameslist = null;
		File F = new File("/home/sabanerjee/Eclipse/workspace/projecteuler/src/prob22/p022_names.txt");
		Scanner in = new Scanner(F);
		while(in.hasNextLine()) nameslist=in.nextLine();
		in.close();
		String[] nlarr = nameslist.split(",");
		for(String nl : nlarr) {
			names.put(nl.substring(1,nl.length()-1), value(nl.substring(1,nl.length()-1)));
		}
		long fileTotal = 0;
		int pos = 0;
		for(String name : names.keySet()) {
			pos++;
			fileTotal+=names.get(name)*pos;
		}
		System.out.println(fileTotal);
	}

}
