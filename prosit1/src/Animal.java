import java.util.Scanner;
public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    public Animal(String family, String name, int age, Boolean isMammal){
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    public void displayAnimal(){
        System.out.println("Animal: " + name + " est un " + family + ", âgé de " + age + " ans.");
    }
    public Animal saisirAnimal(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez les informations de l'animal :");
        System.out.print("Nom de la famille : ");
        String family = scanner.nextLine();
        System.out.print("Nom de l'animal : ");
        String name = scanner.nextLine();
        System.out.print("age de l'animal : ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("L'animal est-il un mammifère ? (true/false) : ");
        boolean isMammal = scanner.nextBoolean();
        scanner.nextLine();

        return new Animal(family, name, age, isMammal);


    }

}

