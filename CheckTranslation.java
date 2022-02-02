





import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckTranslation{
	private static final String COMMA_DELIMITER = null;
	List<List<String>> records = new ArrayList<>();
	try (BufferedReader br = new BufferedReader(new FileReader("book.csv"))) {
	    String line;
	    while ((line = br.readLine()) != null) {
	        String[] values = line.split(COMMA_DELIMITER);
	        records.add(Arrays.asList(values));
	    }
	    for(int i = 0; i < records.size(); i++) {
	    	
	    	String eng = records.get(i).get(0);
	    	String correct;
	    	switch (eng) {
	         case "hello":
	             correct = "hola";
	             break;
	         case"goodbye":
	             correct = "adios";
	             break;
	         case "yes":
	             correct = "si";
	             break;
	         case "no":
	            correct = "no";
	             break;
	         default:
	             throw new IllegalArgumentException("invalid input: " + eng);
	     }
	    	if(correct.equals(records.get(i).get(1)) == true) {
	    		System.out.println(correct + " is the correct translation of " + eng);
	    	}
	    	else {
	    		System.out.println(records.get(i).get(1) + " is not the correct translation of " + eng);
	    	}
	    	
	    }
	}
}