package lesson23.homework;

public class ToWarehouse extends BaseDocument {
    public ToWarehouse(int id) {
        super(id);
    }

    public void toWarehouse(WareHouse warehouse) {
        warehouse.addAll(products);
    }
}
