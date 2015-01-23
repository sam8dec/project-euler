package prob46;

public class Goldbach {
	public static boolean isComposite[] = new boolean[1000000];
	
	public static boolean isPerfectSquare(int N) {
		for(int i=1;i*i<=N;i++) {
			if(i*i==N) return true;
		}
		return false;
	}
	public static boolean followsConjecture(int N) {
		int j;
		for(j=3;j<N;j++) {
			if(!isComposite[j] && isPerfectSquare((N-j)/2)) return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int i,j;
		isComposite[0]=isComposite[1]=true;
		for(i=2;i<1000000;i++) for(j=i*2;j<1000000;j+=i) isComposite[j]=true;
		for(i=5;i<1000000;i+=2) if(isComposite[i] && !followsConjecture(i)) break;
		System.out.println(i);
	}

}
