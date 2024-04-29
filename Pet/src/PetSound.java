public class PetSound {

    public String petSound (Pet pet, String sound){
        String soundPet = pet.getPetName() + "making sound like" + sound;
        return soundPet;
    }
}
