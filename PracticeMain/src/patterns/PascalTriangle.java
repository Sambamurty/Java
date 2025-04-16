package patterns;


		
public class PascalTriangle {
	public static void main(String[] args) {
        int rows = 10; // Number of rows for Pascal's Triangle
        printPascalTriangle(rows);
        String s = "axxxxyyyyb";
        String part = "xy";
        System.out.println(removeOccurrences(s,part));
        
        
    }

    public static void printPascalTriangle(int rows) {
        for (int i = 0; i < rows; i++) {
            int number = 1;
            System.out.format("%" + (rows - i) * 2 + "s", ""); // Formatting for alignment
            for (int j = 0; j <= i; j++) {
                System.out.format("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
    public static String removeOccurrences(String s, String part) {
    	StringBuilder sb = new StringBuilder(s);
    	while(sb.indexOf(part) != -1)
    	{
    		int i = sb.indexOf(part);
    		sb.delete(i, i+part.length());
    	}
        return sb.toString();
    	
    }
			


	
}
