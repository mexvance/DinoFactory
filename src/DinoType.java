public class DinoType {
    DinoFactory factory;

    public DinoType(DinoFactory factory){
        this.factory = factory;
    }

    public Dino chooseDino(String type){
        Dino dino;
        dino = factory.createDino(type);

        dino.GetEatType();
        dino.GetLegType();
        dino.GetDentistType();
        dino.GetAgressionType();
        return dino;
    }
}
