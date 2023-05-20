package in.java.logical.questions;

public class PascleTriangle {

	public static void main(String[] args) {
		int n = 4, i, j;
		PascleTriangle g = new PascleTriangle();
	    for (i = 0; i <= n; i++) {
	        for (j = 0; j <= n - i; j++) {
	            // for Adding Left Side Spacing
	            System.out.print(" ");
	        }
	        for (j = 0; j <= i; j++) {
	
	            System.out.print(" "+ g.calculate(i)/ (g.calculate(i - j)* g.calculate(j) ));
	        }
	        // for Adding new Line
	        System.out.println();
	    }
	}
	public int calculate(int i)
    {
        if (i == 0)
            return 1;
        
        return i * calculate(i - 1);
    }
}
