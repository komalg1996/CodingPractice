//printing 2D array
public class Array2d {

	public static void main(String[] args) {
		int num[][]={{1,2},{3,4},{5,6}};
//		System.out.println(num.length);		-->row
//		System.out.println(num[0].length);	-->column
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(num[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
