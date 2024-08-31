package onlinvedio;

public class Demo {

	public static void main(String[] args) {
   /*int a[] = {1,2,3,4,5};
   for(int value:a) {
	   System.out.println(value);
   }*/

	int b[][]= {
			{1,2,3},
			{4,5,6},
			{7,8,9}
	};
	for(int kav[]:b) {
		for(int value:kav) {
			System.out.print(value);
		}
		System.out.println();
	}
	
   
}
}
