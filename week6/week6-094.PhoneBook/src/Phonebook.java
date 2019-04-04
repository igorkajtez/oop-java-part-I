
import java.util.ArrayList;
import java.util.Iterator;

public class Phonebook {
    private ArrayList<Person> list;

    public Phonebook() {
        this.list = new ArrayList();
    }
    
    public void add(String name, String number){
        this.list.add(new Person(name, number));        
    }
    
    public void printAll(){      
        for(Person p : list){
            System.out.println(p);
        }
    }
    
    public String searchNumber(String name){
        for(Person p : list){
            if(p.getName().equals(name)){
                return p.getNumber();
            }
        }
        return "number not known";  
    }
        
        
    
    
    

}
