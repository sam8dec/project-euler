package prob17;

public class NumberLetterSum {
	public static String[] numberToWord = new String[1001];
	public static void fillNumberToWord() {
		numberToWord[1] = "one";
		numberToWord[2] = "two";
		numberToWord[3] = "three";
		numberToWord[4] = "four";
		numberToWord[5] = "five";
		numberToWord[6] = "six";
		numberToWord[7] = "seven";
		numberToWord[8] = "eight";
		numberToWord[9] = "nine";
		numberToWord[10] = "ten";
		numberToWord[11] = "eleven";
		numberToWord[12] = "twelve";
		numberToWord[13] = "thirteen";
		numberToWord[14] = "fourteen";
		numberToWord[15] = "fifteen";
		numberToWord[16] = "sixteen";
		numberToWord[17] = "seventeen";
		numberToWord[18] = "eighteen";
		numberToWord[19] = "nineteen";
		numberToWord[20] = "twenty";
		numberToWord[30] = "thirty";
		numberToWord[40] = "forty";
		numberToWord[50] = "fifty";
		numberToWord[60] = "sixty";
		numberToWord[70] = "seventy";
		numberToWord[80] = "eighty";
		numberToWord[90] = "ninety";
		numberToWord[1000] = "onethousand";
		for(int i=21;i<=1000;i++) {
			if(numberToWord[i]==null) {
				String str = "";
				int hund = i/100;
				if(hund!=0) {
					if(i%100!=0) {
						str=str+numberToWord[hund]+"hundredand"+numberToWord[i%100];
					} else {
						str=str+numberToWord[hund]+"hundred";
					}
				}
				else {
					if(i%10!=0) {
						str = str+numberToWord[(i/10)*10]+numberToWord[i%10];
					}
				}
				numberToWord[i]=str;
			}
		}
	}
	public static void main(String[] args) {
		fillNumberToWord();
		long sum=0;
		for(int i=1;i<=1000;i++) {
			sum+=numberToWord[i].length();
		}
		System.out.println(sum);
	}

}
