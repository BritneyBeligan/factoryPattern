package factoryPattern;

import java.util.Scanner;

public class Clinic {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("[1] Dog");
        System.out.println("[2] Cat");
        System.out.print("\nChoose your pet number: ");
        Integer choice = input.nextInt();

        PetRecord petFile = new PetRecord();
        Pet pet;

        switch(choice){
            case 1: pet = new Dog();
                petFile.setPetId("D01");
                petFile.setPetName("Bantay");
                petFile.setPet(pet);
                ((Dog) pet).setBreed("German Shepperd");
                // to print the breed of the dog
                System.out.println(petFile.setBreed("Dog Breed: German Shepperd"));
                break;
            case 2: pet = new Cat();
                petFile.setPetId("C01");
                petFile.setPetName("Muning");
                petFile.setPet(pet);
                ((Cat) pet).setNoOfLives(9);
                //to print the lives of the Cat
                System.out.println("Cat Lives: " + petFile.setNoOfLives(9));
                break;
                
                 //exit
            case 3: pet = new Pet();
            System.out.println("Exit");
        }

        System.out.println("Pet id is " + petFile.getPetId());
        System.out.println("Pet name is " + petFile.getPetName());
        System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
        System.out.println("Communication sound: "+ petFile.getPet().makeSound());
        System.out.println("Play mode: " + petFile.getPet().play());

    }
}
