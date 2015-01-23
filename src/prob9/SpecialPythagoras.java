package prob9;

//Without programming:
//
//a= 2mn; b= m^2 -n^2; c= m^2 + n^2;
//a + b + c = 1000;
//
//2mn + (m^2 -n^2) + (m^2 + n^2) = 1000;
//2mn + 2m^2 = 1000;
//2m(m+n) = 1000;
//m(m+n) = 500;
//
//m>n;
//
//m= 20; n= 5;
//
//a= 200; b= 375; c= 425;


public class SpecialPythagoras {
	public static int specialPythC() {
		int a,b,c;
		for(a=1;a<1000;a++) {
			for(b=a+1;b<1000;b++) {
				if(a+b<500) continue; // comes from some mathemetical preprocessing
				c = 1000-a-b;
				if ((a*a+b*b)==c*c) return c;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		int c = specialPythC();
		System.out.println((500*c*(1000-2*c)));
	}

}
