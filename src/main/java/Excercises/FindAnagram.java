package excercises;

public class FindAnagram {
	public boolean isAnagram(String name, String anagram) { // iceman cinema
		char[] nameArr = name.toLowerCase().toCharArray();
		char[] anagramArr = anagram.toLowerCase().toCharArray();
		if (nameArr.length != anagramArr.length) {
			return false;
		}
		boolean flag = false;
		for (int i = 0; i < nameArr.length; i++) {
			for (int j = 0; j < anagramArr.length; j++) {
				if (nameArr[i] == anagramArr[j]) {
					flag = true;
					break;
				} else {
					continue;
				}
			}
			if (!flag) {
				return false;
			} else {
				flag = false;
			}
		}
		return true;
	}
}
