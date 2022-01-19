public class TestOne {

    public static void main(String[] args) {

	firstTask(6);
	System.out.println();
	secondTask(6);
	System.out.println();
	thirdTask(6);
    }


    /**
     * First task
     * @param n Number of lines expected
     */
    public static void firstTask(int n) {
	String out = "";
	String c = "";

	//Loop for lines
	for(int i = 1; i < n; i++) {
	    //Loop for *
	    for(int j = 1; j < n-i; j++)
		out += "*";
	    //Assing of C
	    c = (i % 2 == 0) ? "E" : "O";
	    //Loop for char (O or E)
	    for(int k = 1 ; k <= i; k++)
		out += c;
	    System.out.println(out);
	    out = "";
	}
    }

    /**
     * Second task
     * @param n Number of lines expected
     */
    public static void secondTask(int n) {
	String out = "";
	//Loop for lines
	for(int i = 1; i < n; i++) {

	    for(int j = 1; j < n+1; j++) {
		//A line with white spaces as extremes
		if(i % 2 == 0) {
		    if(j == 1 || j == n)
			out += " ";
		    else
			out += "*";
		} else { //A line with only *
		    out += "*";
		}
	    }
	    System.out.println(out);
	    out = "";
	}
    }


    /**
     * Third task
     * @param n Number of lines expected
     */
    public static  void thirdTask(int n) {
	String out = "";
	String c = "";
	//if(n % 0 == 1)
	//    n++;
	//Loop for lines
	for (int i = 1; i < n; i++) {
	    //Identifying if line has O or E
	    if ( i % 2 == 0) {
		c = "EE"; //Letter of the line
		for (int j = 1; j <= (n/2); j++) {
		    if (j % 2 == 0)
			out += c;
		    else
			out += "**";
		}
	    } else {
		c = "OO";
		for (int j = 1; j <= (n/2); j++) {
		    if (j % 2 == 0)
			out += "**";
		    else
			out += c;
		}
	    }
	    System.out.println(out);
	    out = "";
	}
    }
}
