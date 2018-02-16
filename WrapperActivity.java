import java.util.Scanner;

public class WrapperActivity {
	public static void main(String[] args) {
		System.out.println("How many values to be sorted?");
		Scanner s = new Scanner(System.in);
		String lenstring = s.next();
		Integer len = Integer.parseInt(lenstring);
		Integer[] arr = new Integer[len];
		System.out.println("Enter values to be sorted");
		for (Integer i = new Integer(0); i.compareTo(len)!=0; i++) {
			Integer num = Integer.parseInt(s.next());
			arr[i] = num;
		}
		for (Integer i = new Integer(0); i.compareTo(len-1)!=0; i++) {
			for (Integer j = new Integer(0); j.compareTo(len-1)!=0; j++) {
				if (arr[j] > arr[j+1]) {
					Integer tem = arr[j];
	                arr[j] = arr[j+1];
	                arr[j+1] = tem;
				}
			}
		}
		for (Integer i = new Integer(0); i.compareTo(len)!=0; i++) {
			System.out.print(arr[i].toString());
		}
	}
}
