
public class A10 {

	public static void main(String[] args) {
		
		int a[]= {16, 17, 4, 3, 5, 2};// 17, 5, 2
			
			int leader=0,pos=0;
			for(int i=0;i<a.length;i++) {
				for(int j=i+1;j<a.length;j++) {
					if(a[i]<a[j]) {
						leader=a[j];
						i+=j;
						System.out.print(leader+" ");
						 
						break;
						
					}
				}
			}System.out.print(a[a.length-1]);
	}
}
