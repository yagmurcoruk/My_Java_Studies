public class CustomerManager {
    private BaseLogger Logger;
    public CustomerManager(BaseLogger logger){
        this.Logger = logger;
    }
    public void Add(String logMesajı) {
        System.out.println("Müşteri eklendi.");
        DatabaseLogger logger = new DatabaseLogger();
        this.Logger.Log("log mesajı");

    }
}
