import java.util.Scanner;


public class Shuffle {
	
                      //creating main method
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String word;
			System.out.println("Enter the word");
			word = scan.next();
			Shuffle test = new Shuffle();

			System.out.println(test.stringShuffler(word));
			scan.close();

		}

		public String shuffletest(String word) {
			String temp = "";
			for (int i = 0; i < word.length(); i++) {
				if (i % 2 == 0) {
					if ((int) word.charAt(i) <= 90) {
						int t = (int) word.charAt(i) + 32;
						temp += (char) t;
					} else
						temp += word.charAt(i);
				} else {
					if ((int) word.charAt(i) >= 97) {
						int t = (int) word.charAt(i) - 32;
						temp += (char) t;
					}
					else temp+=word.charAt(i);
				}
			}
			return temp;
		}

		public String stringShuffler(String word) {
			String temp = "";

			int i = 0, l = word.length() - 1;

			while (i < word.length() / 2) {
				temp += word.charAt(i);
				temp += word.charAt(l);
				i++;
				l--;

			}
			if (word.length() % 2 != 0)
				temp += word.charAt(word.length() / 2);
			System.out.println(temp);
			return shuffletest(temp);
		}
	}

