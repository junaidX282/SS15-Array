
public class A5 {

	public static void main(String[] args) {
		
//		int arr[]=new int[1];
//		System.out.println(arr[0]);
		int i,j;
		int a[]= {2,5,8,8,5,0,7,0,2,10},b[]= {5,5,0,7, 12, 8},n=0,count=0;
		int c[]=new int[10];
			for(i=0;i<a.length;i++) {
				for(j=0;j<b.length;j++) {
					if(a[i]==0 && b[j]==0) {
						count++;
					}
					if(a[i]==b[j]) {
						int flag=0;
						for(int k=0;k<c.length;k++) {
							if(c[k]==a[i]) {
								flag=1;
								break;
							}
						}
						if(flag==0) {
							c[n]=a[i];
							n++;
						}
					}
				}
			}
			for( i=0;i<n;i++) {
				System.out.print(c[i]+" ");
			}if(count >=1) {
				System.out.print("0");
			}
	}
}
