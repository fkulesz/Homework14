package czteryPoryRoku;

import java.util.Arrays;
import java.util.Scanner;

public class SeasonInterface {
    private static Season selectedSeason = null;

    public static void getSeasonInfoByName(){
       Season season = userInterface();
        System.out.println("Wybrano porę roku: " + season.getName());
        System.out.println("W tej porze roku mamy miesiace: " + Arrays.toString(season.getMonths()) );

    }
    private static Season userInterface(){
      Season[] seasons =  printAvailableSeasons();
        do{
            System.out.println("Wybierz jedną porę roku: ");
            Scanner scanner = new Scanner(System.in);
            String seasonName = scanner.nextLine();
            try{
                for(Season seasonIter : seasons ){
                    if(seasonIter.getName().equals(seasonName)){
                        selectedSeason = seasonIter;
                    }
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Bledny kod");
            }
        } while(selectedSeason == null);

        return selectedSeason;
    }
    private static Season[] printAvailableSeasons(){
        Season[] seasons = Season.values();
        System.out.println("Dostepne pory roku: ");
        for(Season season : seasons){
            System.out.println( season.getName());
        }
        return seasons;
    }

}
