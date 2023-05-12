
public class AddNumsInStr2 {

	public static void main(String[] args) {
		String s = "60fdf10ffrf20frfr5fr5";

			String number = "";
			int temp = 0;
			int flag = 0;
			for (int i = 0; i < s.length(); i++) {
				if (Character.isDigit(s.charAt(i))) {

					number = number + s.charAt(i);

					flag = 1;

					if (i != (s.length() - 1))
						continue;

				}

				if (flag == 1) {

					int value = Integer.parseInt(number);
					number = "";
					temp = value + temp;

					flag = 0;

				}

			}

			System.out.println("the addition of number are :" + temp);
		} 


	}


