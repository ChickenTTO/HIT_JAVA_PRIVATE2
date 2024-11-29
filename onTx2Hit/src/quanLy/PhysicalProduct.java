package quanLy;

/**
 *
 * @author datch
 */
 class PhysicalProduct extends Product {

    public PhysicalProduct(String id, String name, int quantity, double price) {
        super(id, name, quantity, price);
    }

    @Override
    public double totalPrice() {
        return getPrice()*getQuantity();
    }
    
}
