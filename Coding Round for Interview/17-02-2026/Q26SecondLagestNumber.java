public class Q26SecondLagestNumber {

    public static void main(String[] args) {
 	int a[] = {1,2,3,4,5,6,7};
		int max = a[0];
		int secondMax = a[a.length-1];
		
		for(int i = 0 ; i<a.length;i++){
			
		    if(a[i] > max){
				secondMax = max;
				max = a[i];
		    }else if(a[i] != max && a[i] > secondMax){
				secondMax = max;
			}
		}
		System.out.println("Max = "+max);
		System.out.println("secondMax = "+secondMax);
    }

}
