import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		int temp;
		Scanner sc= new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("enter array values");
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}int l=arr.length-1;
	for(int i=0;i<=arr.length/2;i++) {
			temp=arr[i];
			arr[i]=arr[l-i];
			arr[l-i]=temp;
		}
	//System.out.println(arr.length);
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
	}
}
