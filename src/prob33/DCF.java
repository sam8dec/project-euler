package prob33;
/**
 * Refer http://www.mathblog.dk/project-euler-33-fractions-unorthodox-cancelling-method/
 * @author sabanerjee
 *
 */
public class DCF {

	public static void main(String[] args) {
		int n,d,i;
		for(n=1;n<=7;n++) {
			for(d=n+1;d<=8;d++) {
				for(i=d+1;i<=9;i++) {
					int num = 10*n+i;
					int den = 10*i+d;
					if((float)den/num==(float)d/n) {
						System.out.println(num+" "+den);
					}
				}
			}
		}
	}

}
