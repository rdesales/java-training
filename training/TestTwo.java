public class TestTwo {

    public static void main(String[] args) {
	firstTask("aaaaaaaaaaaaaaaa", 3);
    }


    public static void firstTask(String str, int n) {

	for(int i = 0; i < str.length(); i++) {
	    if((i % n == 0) &&
	       ! (Character.toString(str.charAt(i)).equalsIgnoreCase("a")
		  || (Character.toString(str.charAt(i))).equalsIgnoreCase("e")
		  || (Character.toString(str.charAt(i))).equalsIgnoreCase("i")
		  || (Character.toString(str.charAt(i))).equalsIgnoreCase("o")
		  || (Character.toString(str.charAt(i))).equalsIgnoreCase("u"))) {
		System.out.println("false");
		return;
	    }
	}
	System.out.println("true");
    }
}
