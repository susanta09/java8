package String;


public class Find_Sum_Of_Digits_From_String {
	public static void main(String[] args) {
		 String input = "dr23cf12u";
		 Integer sum=input
				 .chars()
				 .filter(Character::isDigit)
				 .map(Character::getNumericValue)
				 .sum();
		 System.out.println(sum);
	}
}
