
public class A25 {

	public static void main(String[] args) {
		
		int a[]= {5, 8, 3, 12, 7, 10},temp=0;    // 8, 5, 12, 3, 10, 7

		
		for(int i=0;i<a.length;i+=2) {
			temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
			
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
