public class Driver {
    public static void main(String[] args){
        DinoType type;
        DinoFactory factory;
        Dino myDino;
        factory = new DinoFactory();
        type = new DinoType(factory);

        myDino = type.chooseDino("TRex");
        System.out.println("\nYou got a " + myDino.GetName() + " Dino" +
                "\nConsumption Type: " + myDino.GetEatType() + "\nLegType: " + myDino.GetLegType() +
                "\nDentist Visit: " + myDino.GetDentistType() + "\nAgression Amount: " + myDino.GetAgressionType() );

        myDino = type.chooseDino("Stegosaurus");
        System.out.println("\nYou got a " + myDino.GetName() + " Dino" +
                "\nConsumption Type: " + myDino.GetEatType() + "\nLegType: " + myDino.GetLegType() +
                "\nDentist Visit: " + myDino.GetDentistType() + "\nAgression Amount: " + myDino.GetAgressionType() );

        myDino = type.chooseDino("UtahRaptor");
        System.out.println("\nYou got a " + myDino.GetName() + " Dino" +
                "\nConsumption Type: " + myDino.GetEatType() + "\nLegType: " + myDino.GetLegType() +
                "\nDentist Visit: " + myDino.GetDentistType() + "\nAgression Amount: " + myDino.GetAgressionType() );

        myDino = type.chooseDino("Brachiosaurus");
        System.out.println("\nYou got a " + myDino.GetName() + " Dino" +
                "\nConsumption Type: " + myDino.GetEatType() + "\nLegType: " + myDino.GetLegType() +
                "\nDentist Visit: " + myDino.GetDentistType() + "\nAgression Amount: " + myDino.GetAgressionType() );
    }
}
