package wynikiZawodow;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileUtils {
    public static void saveResultsToFile(List<Participant> participants, String fileName) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        for(Participant participant : participants){
            String output = participant.getFirstName() + ";" + participant.getLastName() + ";" + participant.getResult() + ";";
            bufferedWriter.write(output);
            bufferedWriter.newLine();
        }

        System.out.println("Dane posortowano i wpisano do pliku: " + fileName);
        bufferedWriter.close();
    }
}
