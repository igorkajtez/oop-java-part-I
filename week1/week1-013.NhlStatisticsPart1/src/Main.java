
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("Format is: name, abbreviation of the club, matches played, goals + assists, points, penalties" );        
        
        System.out.println("Top 10 sorted by goals:");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        System.out.println();

        System.out.println("Top 25 sorted by penalty amounts:");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        System.out.println();

        System.out.println("Statistics for Sidney Crosby:");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        System.out.println();
        
        System.out.println("Statistics for Philadelphia Flyers:");
        //Players are printed based on penalty amounts because of the last sort(Top 25 players sorted by penalty amounts)
        NHLStatistics.teamStatistics("PHI");
        System.out.println();
        
        System.out.println("Players in Anaheim Ducks by points: ");        
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
    }
}
