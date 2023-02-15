public abstract class GameCalculator {
    // kim inherit ediyorsa hesaplamayı kullanması ve aynı zamanda kullanıcı türüne göre override edilmek zorundadır.
    // override edilmek zorunda. İnheritance olan her class da.!!
    public abstract void hesapla();
    public final void gameOver(){
        System.out.println("Oyun bitti.");
    }

}
