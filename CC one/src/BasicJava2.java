
public class BasicJava2 {
	public static boolean match(char lowerCaseChar,char upperCaseChar) {
		String lowercase = lowerCaseChar + "";
		String uppercase = upperCaseChar + "";
		if (lowercase.compareTo(uppercase)>0) {
			return true;
		}
		return false;
		}
	
	public static long ceiling(double num) {
		long l1 =(long) (num);
		long l2 = 1;
		if (l1==num) {
			return l1;
		}
		return (l1 + l2);
		
	}
	public static int count(String str, String chars) {
		int count = 0;
		for (int i = 0; i < str.length()-1 ; i++) {
			String ati = str.charAt(i) + "";
			for (int j = 0; j < chars.length()-1; j++) {
				String atj = chars.charAt(j) + "";
				if (ati.equalsIgnoreCase(atj)) {
					count += 1;
				}
			}
		}
		return count;
	}
	public static int addHexDigits(int num) {
	
		return 0;
		
	}
}
