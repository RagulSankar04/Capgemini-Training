import java.util.Scanner;
class program11{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int power = input.nextInt();
		int result = 1;
		
		if((number >0) && (power >0)){
			for(int i = 1; i <= power; i++){
				result *= number;
			}
		}
		System.out.println(result);
	}
}