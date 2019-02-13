public class DinoFactory {
    public Dino createDino(String type){
        Dino dino = null;

        if (type.equals("TRex")){
            dino = new TRex();
        }else if (type.equals("Stegosaurus")){
            dino = new Stegosaurus();
        }else if (type.equals("UtahRaptor")){
            dino = new UtahRaptor();
        }else if (type.equals("Brachiosaurus")){
            dino = new Brachiosaurus();
        }
        return dino;
    }
}
