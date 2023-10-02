public class Zoo {
    Animal[] animals;
    String name;
    String city;
    final static int nbrCages = 25;
    int nbrAnimaux;
    public Zoo(String name, String city, int nbrAnimaux ){
        this.animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages[25];
        this.nbrAnimaux = nbrAnimaux = 0;
    }
    public void displayZoo(){
        System.out.println("Zoo: " + name + " situé à " + city + " nbre de cages: "+nbrCages);
    }
    public boolean addAnimal(Animal animal){
        if(nbrCages < nbrAnimaux) {
            animals[nbrAnimaux] = animal;
            nbrAnimaux++;
            return true;
        }
        else{
            return  false;
        }


    }

    boolean isZooFull(){
        return (nbrAnimaux == nbrCages);
    }
    Zoo comparerZoo(Zoo z1, Zoo z2){
        if (z1.nbrAnimaux > z2.nbrAnimaux) {
            return z1;
        } else if (z2.nbrAnimaux > z1.nbrAnimaux) {
            return z2;
        } else {
            return null;
        }
    }

}
