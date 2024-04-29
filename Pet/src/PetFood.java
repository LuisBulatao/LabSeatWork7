public class PetFood {
    public String petFood (Pet pet, String food){
        String eatingFood = pet.getPetName() + "eating" + food;
        return eatingFood;
    }
}
