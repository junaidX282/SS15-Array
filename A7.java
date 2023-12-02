
public class A7 {

	public static void main(String[] args) {
		
		int a[]= { 7, 12, 3, 8, 5};
		int temp=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==1) {
				temp=a[i];
				for(int j=i+1;j<a.length;j++) {
					if(a[j]%2==0) {
						a[i]=a[j];
						a[j]=temp;
						break;
					}	
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}
}
