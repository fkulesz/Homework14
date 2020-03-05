package wynikiZawodow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ResultGenerator {
    public static List<Participant> generateResults(){
        List<Participant> participants= new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input = "";
        do {
            String firstName;
            String lastName;
            int result;
            System.out.println("Podaj wynik kolejnego gracza: ");
            System.out.println("podaj imie (lub stop) ");
            firstName = scanner.nextLine();
            if(firstName.equals("stop")){
                input = firstName;
                break;
            }
            System.out.println("podaj nazwisko: ");
            lastName = scanner.nextLine();
            System.out.println("Podaj wynik: ");
            result = scanner.nextInt();
            Participant newParticipant = new Participant(firstName, lastName, result);
            participants.add(newParticipant);
            scanner.nextLine();
        }
        while(!input.equals("stop"));

        scanner.close();

        System.out.println("Lista uczestnikow przed sortem: " + participants.toString());
        Collections.sort(participants);
        System.out.println("List uczestnikow po sorcie" + participants.toString());
        return participants;
    }
}
