package app.product.subproduct;

import app.product.Product;

public class Side extends Product {
    private int Ketchup;

    public Side(int id, String name, int price, int kcal, int ketchup) {
        super(id, name, price, kcal);
        this.Ketchup = ketchup;
    }
    public Side (Side side) {
        super(side.getName(), side.getPrice(), side.getKcal());
        this.Ketchup = side.getKetchup();
    }


    public int getKetchup() {
        return Ketchup;
    }

    public void setKetchup(int ketchup) {
        Ketchup = ketchup;
    }
}
