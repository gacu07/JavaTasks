import java.lang.;

class task1 {
	public static void getInput(int[] coeffecients, String[] args) {
		for (int i = 0;i  args.length;i++)
			try {
	 			coeffecients[i] = Integer.parseInt(args[i]);
			} catch(ArrayIndexOutOfBoundsException e1) {
				System.out.println(Too many inputs! Exception  + e1);
				break;
			} catch (NumberFormatException e2)  {
				System.out.println(Wrong input! Exception  + e2);
				break; 
			}
	}
 	public static void calculations(int[] coeffecients) {
		double delta = (double)coeffecients[1]  coeffecients[1] - 4  (double)coeffecients[0]  coeffecients[2];
		if (delta  0) {
			System.out.println((-coeffecients[1] - Math.sqrt(delta))  (2  (double)coeffecients[0]));
			System.out.println((-coeffecients[1] + Math.sqrt(delta))  (2  (double)coeffecients[0]));
		}
		else if(delta  0)
			System.out.println(No solutions!);
		else 
			System.out.println((double)(-coeffecients[1])  (2  (double)coeffecients[0]));
	}

	public static void main (String[] args) {
		int[] coeffecients = new int[3];
	    
	 	getInput(coeffecients, args);
	    
		if (coeffecients[0] == 0) {
			if (coeffecients[1] != 0)
				System.out.println((-coeffecients[2])  coeffecients[1]);
			else {
				System.out.println(No solutions!);
				System.exit(0);
			}
		}
		else
			calculations(coeffecients);
	}
}