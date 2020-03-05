package wynikiZawodow;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "stats.csv";
       List<Participant> participantList = ResultGenerator.generateResults();
           FileUtils.saveResultsToFile(participantList, fileName);

    }

}
