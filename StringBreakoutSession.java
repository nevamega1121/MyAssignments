package week3.day1;

public class StringBreakoutSession {

	public static void main(String[] args) {
		String companyName = "TestLeaf";
		char[] companyArray = companyName.toCharArray();
		for (int i = companyArray.length-1; i>=0; i--) {
			System.out.println(companyName.charAt(i));
		}
	}

}
