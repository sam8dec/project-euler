package prob12;

public class TriangleNumber {
	public static int numberOfDivisors[] = new int[1000000];
	public static void fillNumberOfDivisors(int N) {
		int i;
		if(N==1) {
			numberOfDivisors[N]=1;
			return;
		}
		for(i=2;i*i<=N;i++) {
			if(N%i==0) {
				if(i*i==N) numberOfDivisors[N]++; else numberOfDivisors[N] += 2;
			}
		}
		numberOfDivisors[N]+=2; // (adding 1 and the number itself)
	}
	public static void main(String[] args) {
		int i,nodt=0;
		long t=0;
		fillNumberOfDivisors(1);
		for(i=2;i<1000000;i++) {
			fillNumberOfDivisors(i);
			// Find number of divisors of i-1 th triangle number
			if(i%2==0) {
				nodt = numberOfDivisors[i/2]*numberOfDivisors[i-1];
				t = (i/2)*(i-1);
			} else {
				nodt = numberOfDivisors[i]*numberOfDivisors[(i-1)/2];
				t = (i)*((i-1)/2);
			}
			if(nodt>500) break;
		}
		System.out.println(t+" "+i+" "+nodt);
	}

}
