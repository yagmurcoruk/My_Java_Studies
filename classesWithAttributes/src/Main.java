public class Main {
    public static void main(String[] args) {
        Product product = new Product(1, "Laptop", "Asus Laptop", 5000, 5, "Kırmızı");
        ProductManager productManager = new ProductManager();
    /*    Product product = new Product();

        product.setName("Laptop");
        product.setDescription("Asus laptop");
        product.setPrice(5000);
        product.setStock(10);
        product.setRenk("Kırmızı");
        product.setId(5);*/


        productManager.add(product);
        System.out.println(product.getId());
        System.out.println(product.getKod());

    }

}