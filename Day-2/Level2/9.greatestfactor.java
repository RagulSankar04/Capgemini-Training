import java.util.Scanner;
class program9{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int greatestFactor = 1;
		for(int i = number-1; i >= 1; i--){
			if(number % i == 0){
				greatestFactor = i;
			}
		}
		System.out.println(greatestFactor);
	}
}