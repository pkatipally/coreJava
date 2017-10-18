package basic;

public class FindPalindrome {

	public boolean isPalindrome(String name) {
		boolean flag = false;
		String reverseName = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			reverseName += name.toLowerCase().charAt(i);
		}
		if (name.toLowerCase().equals(reverseName.toLowerCase())) {
			return true;
		} else {
			return flag;
		}
	}
//madam
	public boolean isPalindrome2(String name) {
		// priya ['p','r','a',
		char[] nameArr = name.toCharArray();
		int lastIndex = nameArr.length - 1;
		for (int i = 0; i <= nameArr.length / 2; i++) {
			if (nameArr[i] == nameArr[lastIndex - i]) {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}
}
