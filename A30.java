
public class A30 {

	public static void main(String[] args) {
		
		int a[]= {5, 8, 3, 12, 7, 10};
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			if(i>0 && i<=4) {
				sum=sum+a[i];
			}
		}System.out.println(sum);
	}
}
