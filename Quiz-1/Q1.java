package exam;

public class Q12_6511171 {
	public static String withTwiceChar(String str, char more) {
	    StringBuilder newStr = new StringBuilder();
	    for (int i = 0; i < str.length(); i++) {
	        if (str.charAt(i) != more) {
	            newStr.append(str.charAt(i));
	        } else if (str.charAt(i) == more) {
	            newStr.append(str.charAt(i)).append(more);
	        }
	    }
	    return newStr.toString();
	}
	public static void main(String[] args) {
		 String test1 = "hello there!";
		 String test2 = "**Another** **Example!**";
		 System.out.println(withTwiceChar(test1,'e')); //hello theeree!
		 System.out.println(withTwiceChar(test1,'l')); //hellllo there!
		 System.out.println(withTwiceChar(test2,'e')); //**Anotheer** **Examplee!**
		 System.out.println(withTwiceChar(test2,' ')); //**Anotheer** **Examplee!**
	}
}

	    


