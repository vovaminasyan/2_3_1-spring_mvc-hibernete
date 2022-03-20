package web.model;


public class Car {
    private String manufacturer;
    private String model;
    private int id;

    public Car() {}

    public Car(int id, String man, String mod) {
        this.id = id;
        manufacturer = man;
        model = mod;
    }

    public void setManufacturer(String man) { manufacturer = man; }
    public void setModel(String mod) { model = mod; }
    public void setId(int i) { id = i; }

    public String getManufacturer() { return manufacturer; }
    public String getModel() { return model; }
    public int getId() { return id; }

    public String toString() { return getManufacturer() + " " + getModel(); }
}
