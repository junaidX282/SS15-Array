
public class A11 {

	public static void main(String[] args) {
		
		int a[]= { -5, 8, -3, 12, -7};
		int temp=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>0) {
				temp=a[i];
				for(int j=i+1;j<a.length;j++) {
					if(a[j]<0) {
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
