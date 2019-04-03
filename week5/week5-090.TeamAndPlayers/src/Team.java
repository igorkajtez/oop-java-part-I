
import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players;
    private int maxSize;
    private final int DEFAULT_MAX_SIZE = 16;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<Player>();
        this.maxSize = DEFAULT_MAX_SIZE;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void addPlayer(Player player){
        if(players.size() >= maxSize){
            return;
        }
        this.players.add(player);        
    }
    
    public void printPlayers(){
        for(Player player : this.players){
            System.out.println(player);
        }
    }
    
    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;                
    }
    
    public int size(){
        return this.players.size();
    }
    
    public int goals(){
        int sum = 0;
        for(Player player : this.players){
            sum+=player.goals();
        }
        return sum;
    }

}
