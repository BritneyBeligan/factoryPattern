package factoryPattern;

public class PetRecord {
    private String petId;
    private String petName;
    private Pet pet;

    public String getPetId() {
        return petId;
    }

    public void setPetId(String petId) {
        this.petId = petId;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

     //to set for the cat
    public int setNoOfLives(int i) {
        return 9;
    }

    //to set for the dog
    public String setBreed(String setBreed) {
        return "Dog Breed: German Shepperd";
    }
}
