package ClassesAndObjects.Animals;

import ClassesAndObjects.Animals.Pet;

/**
 * Created by mikesavenkov on 4/5/16.
 */
public class PetMaster {

    public static void main(String[] args) {

        String petReaction;

        Pet myPet = new Pet();

        myPet.eat();

        petReaction = myPet.say("Чик!! Чирик!!");

        System.out.println(petReaction);

        myPet.sleep();

    }
}

