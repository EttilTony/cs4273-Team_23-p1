import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;

public class CSVParsingTest{
    public static void main(String[] args) throws IOException {
        String csvFile = "test.csv";
        try (Reader reader = new FileReader(csvFile);
            CSVPrinter csvPrinter = new CSVPrinter(reader, CSVFormat.DEFAULT);) {
            Iterable<CSVRecord> csvRecords = csvParser.getRecords();
            for (CSVRecord csvRecord : csvRecords) {
                System.out.println("English: " +csvRecord.get(0) + " to Spanish: "+ csvRecord.get(1));
            }
            
        }
    }
}
