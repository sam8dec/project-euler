package prob28;

public class NumberSpiralDiagonals {

	public static void main(String[] args) {
		int i,sum=1,j=2,k=2;
		for(i=2;i<=1001;i++) {
			if(i%2==0) {
				sum+=i*i+1;
				sum+=i*i+1-j; // For the obtuse diagonal
				j+=2;
			}
			else {
				sum+=i*i;
				sum+=i*i-k; // For the obtuse diagonal
				k+=2;
			}
		}
		System.out.println(sum);
	}

}
