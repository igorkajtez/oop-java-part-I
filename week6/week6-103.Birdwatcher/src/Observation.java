
import java.util.ArrayList;

public class Observation {
    
    private ArrayList<Bird> birds;

    public Observation() {
        this.birds = new ArrayList<Bird>();
    }
    
    public void addBird(String name, String latinName){
        Bird bird = new Bird(name, latinName);
        this.birds.add(bird);
    }
    
    public void addObservation(String name){
        for(Bird bird : this.birds){
            if(bird.getName().equals(name)){
                bird.observe();
                return;
            }
        }
        System.out.println("Is not a bird!");
    }
    
    public void printStatistics(){
        for(Bird bird : birds){
            System.out.println(bird);
        }
    }
    
    public void printBird(String name){
        for(Bird bird : birds){
            if(bird.getName().equals(name)){
                System.out.println(bird);
                return;
            }
        }
        System.out.println("Is not a bird!");
    }
    
    

}
