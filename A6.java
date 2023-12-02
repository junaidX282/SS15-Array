
public class A6 {

	public static void main(String[] args) {
		
		int i,j,k;
		int []a= {2, 5, 8, 10};
		int b[]= {5, 12, 8}; 
		int t =a.length+b.length;
										//  output --->   [2, 5, 8, 10, 12]
		int l=0;   int []c=new int[t];
		
				for( i=0;i<t;i++) {
					if(i<a.length) {
						c[i]=a[i];
					}else {
						c[i]=b[l];
						l++;
					}
				}	
		for(i=0;i<t;i++) {
			for(j=i+1;j<t;j++) {
				if(c[i]==c[j]) {
					for(k=j;k<t-1;k++) {
						c[k]=c[k+1];
					}
					j--;
					t--;
				}
			}
		}		
				for( i=0;i<t;i++) {
					System.out.print(c[i]+ " ");
				}
	}
}
