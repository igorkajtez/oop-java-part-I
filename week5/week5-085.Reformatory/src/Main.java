
public class Main {

    public static void main(String[] args) {
        Reformatory reformatory = new Reformatory();
        Person brian = new Person("Brian", 1, 110, 7);
        Person pekka = new Person("Pekka", 33, 176, 85);
        System.out.println("Total weight measured: " + reformatory.totalWeightsMeasured());
        
        System.out.println(brian.getName() + " weight: " + reformatory.weight(brian) + " kilos");
        System.out.println(pekka.getName() + " weight: " + reformatory.weight(pekka) + " kilos");
        
        System.out.println("Total weight measured: " + reformatory.totalWeightsMeasured());
        
        reformatory.feed(brian);
        reformatory.feed(brian);
        reformatory.feed(brian);
        
        System.out.println(brian.getName() + " weight: " + reformatory.weight(brian) + " kilos");
        System.out.println(pekka.getName() + " weight: " + reformatory.weight(pekka) + " kilos");
        
        System.out.println("Total weight measured: " + reformatory.totalWeightsMeasured());
    }
}
