package Arrays;

public class CommonEle {

	public static void main(String[] args) {
		int a[]= {11,22,33,44,55};
		int b[]= {10,22,33,45,50};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					System.out.println(a[i]);
					break;
				}
			}
		}
	}

}
