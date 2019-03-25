package lianxi0325;

public class test0325 {
	public static void main(String[] args) {
		Solution S = new Solution();
		String str = "Hello";
		String s = S.toLowerCase(str);
		System.out.println(s);
	}
}
class Solution {
    public String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        for(int i = 0; i < chars.length; i++){
            if(chars[i] >= 65 && chars[i] <= 91){
                chars[i] += 32;
            }
        }
        return String.valueOf(chars);
    }
}