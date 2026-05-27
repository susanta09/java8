package sreamApiDemo;

public class CheckPanagram {

	public static void main(String[] args) {
        String str = "the 3quick brown fox jumps over the lazy dog";
//        String str = "jumps over the lazy dog";
        
		Boolean b=str.toLowerCase()
        .chars()
        .filter(c -> c >= 'a' && c <= 'z')
        .distinct()
        .count() == 26;
		if(b)
		{
			System.out.println("Panagram");
		}else {
			System.out.println(" not a Panagram");
		}
	}

}
