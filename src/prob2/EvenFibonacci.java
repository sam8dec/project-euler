package prob2;

public class EvenFibonacci {

	public static void main(String[] args) {
		int a=1,b=2,sum=2,c;
		for(c=3;c<=4000000;c=a+b) {
			if(c%2==0) sum+=c;
			a=b;b=c;
		}
		System.out.println(sum);
	}

}
