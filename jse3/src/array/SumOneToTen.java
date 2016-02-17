package array;

public class SumOneToTen {
 public static void main(String[] args) {
	/*int[] arr;// 배열의 선언
	arr= new int[3];*/ 
	 
	 /*ctrl shift / 주석처리*/
	
	 /*int[] a=new int[10];
	for (int i = 0; i < 10; i++) {
		a[i]=i+1;
		System.out.println(a[i]);
	}*/
	 int sum=0;
	 int[] a={1,2,3,4,5,6,7,8,9,10};
	 /*for (int i=0; i<10;i++){
		 sum+=a[i];
	 }*/

	 
	for (int i : a) {//확장된 포문
		sum+=i;
		
	}System.out.println(sum);
}
}
