import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LogAnalyzer {
    public static void main(String[] args) {

        int errorCount = 0;
        int infoCount = 0;
        int warningCount = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("log.txt"));
            String line;

            while ((line = reader.readLine()) != null) {

                if (line.contains("ERROR")) {
                    errorCount++;
                } else if (line.contains("INFO")) {
                    infoCount++;
                } else if (line.contains("WARNING")) {
                    warningCount++;
                }
            }

            reader.close();

            System.out.println("===== LOG ANALYSIS =====");
            System.out.println("ERROR саны: " + errorCount);
            System.out.println("INFO саны: " + infoCount);
            System.out.println("WARNING саны: " + warningCount);

        } catch (IOException e) {
            System.out.println("Қате: файл оқылмады!");
        }
    }
}
