import java.util.Scanner;

public class Clinic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("[1] Dog");
        System.out.println("[2] Cat");
        System.out.print("\nChoose your pet number: ");
        Integer choice = input.nextInt();

        PetRecord petFile = new PetRecord();
        Pet pet = Pet.createPet(choice);

        petFile.setPet(pet);
        petFile.setPetId(pet.getPetId());
        petFile.setPetName(pet.getPetName());

        System.out.println("Pet id is " + petFile.getPetId());
        System.out.println("Pet name is " + petFile.getPetName());
        System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
        System.out.println("Communication sound: " + petFile.getPet().makeSound());
        System.out.println("Play mode: " + petFile.getPet().play());

        input.close();
    }
}
