
public class A32 {

public static void main(String[] args) {
		
		int a[]= {5, 8, 3, 8, 7, 10, 5, 6, 10, 5};  //5, 8, 3, 7, 10, 6
		int c=a.length;
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<c;j++) {
				if(a[i]==a[j]) {
					for(int k=j;k<c-1;k++) {
						a[k]=a[k+1];
					}
					j--;
					c--;
				}
			}
		}
		for(int i=0;i<c;i++) {
			System.out.print(a[i]+" ");
		}
		
	}
}
