
public class A22 {

	public static void main(String[] args) {
		
		int a[]= { 5, 8, 3, 12, 7, 10, 15};   //   5, 8, 10, 12, 7, 3, 15

		int index=2,index2=5,temp=0,n=0;
		for(int i=index;i<=index2/2;i++) {
			
			temp=a[i];
			a[i]=a[index2-n];
			a[index2-n]=temp;
			n++;

//			if(n==1) {
//				break;
//			}
					
			
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
