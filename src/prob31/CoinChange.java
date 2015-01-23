package prob31;

public class CoinChange {
	public static void main(String[] args) {
		int[] numberOfWays = new int[201];
		int i;
		for(i=0;i<=200;i++) numberOfWays[i]=1;
		for(i=2;i<=200;i++) numberOfWays[i]+=numberOfWays[i-2];
		for(i=5;i<=200;i++) numberOfWays[i]+=numberOfWays[i-5];
		for(i=10;i<=200;i++) numberOfWays[i]+=numberOfWays[i-10];
		for(i=20;i<=200;i++) numberOfWays[i]+=numberOfWays[i-20];
		for(i=50;i<=200;i++) numberOfWays[i]+=numberOfWays[i-50];
		for(i=100;i<=200;i++) numberOfWays[i]+=numberOfWays[i-100];
		for(i=200;i<=200;i++) numberOfWays[i]+=numberOfWays[i-200];
		System.out.println(numberOfWays[200]);
	}

}
