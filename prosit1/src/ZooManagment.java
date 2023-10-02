import java.util.Scanner;
public class ZooManagment {
    int nbrCages ;
    String zooName ;
    public ZooManagment(int nbrCages, String zooName){
        this.nbrCages = nbrCages;
        this.zooName = zooName;
    }

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("donner le nombres de cages:");
            int nbrCages = scanner.nextInt();

            System.out.println("donner le nom du zoo:");
            scanner.nextLine();
            String zooName = scanner.nextLine();

            ZooManagment zm = new ZooManagment(nbrCages, zooName);
            System.out.println(zm.zooName+" comporte "+zm.nbrCages+" cages");

            Animal lion = new Animal("felin","Simba",5,true);
            Zoo myZoo = new Zoo(zooName, "zooLand", nbrCages);
            myZoo.animals[0] = lion;
            myZoo.displayZoo();
            lion.displayAnimal();

            scanner.close();


            
        }
    }

