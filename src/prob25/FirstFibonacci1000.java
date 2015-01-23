package prob25;

import java.math.BigInteger;

public class FirstFibonacci1000 {

	public static void main(String[] args) {
		BigInteger a,b,c;
		a = new BigInteger("1");
		b = new BigInteger("1");
		c = a.add(b);
		int n=3;
		while(c.toString().length()<1000) {
			a=b;
			b=c;
			c=a.add(b);
			n++;
		}
		System.out.println(n);
	}

}
