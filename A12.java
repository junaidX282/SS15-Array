
public class A12 {

	public static void main(String[] args) {
		int a[]= {3, 8, 5,5, 8, 3}; //3, 8, 5, 5, 8, 3
		int flag=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=a[a.length-1-i]) {
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("number is palindrome");
		}else {
			System.out.println("number is not palindrome");
		}
	}
}
