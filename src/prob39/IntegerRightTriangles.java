package prob39;

public class IntegerRightTriangles {
	
	public static void main(String[] args) {
		int numberOfSolutions[] = new int[1001];
		int a,b,c,p=0,i,max=0;
		for(a=1;a<500;a++) {
			for(b=a+1;b<500;b++) {
				c=(int) Math.sqrt(a*a+b*b);
				if(c*c==(a*a+b*b)) {
					p=a+b+c;
					if(p<=1000) numberOfSolutions[p]++;
				}
			}
		}
		for(i=1;i<=1000;i++) {
			if(numberOfSolutions[i]>max) {max=numberOfSolutions[i];p=i;}
		}
		System.out.println(p+" "+max);
	}

}
