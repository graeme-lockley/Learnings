package jade2j;

public class Book {
    private String name;
    private double price;
    private boolean available;
    private String flag;

    public Book(String name, double price, boolean available, String flag) {
        this.name = name;
        this.price = price;
        this.available = available;
        this.flag = flag;
    }

    @SuppressWarnings("unused")
    public String getName() {
        return name;
    }

    @SuppressWarnings("unused")
    public double getPrice() {
        return price;
    }

    @SuppressWarnings("unused")
    public boolean isAvailable() {
        return available;
    }

    @SuppressWarnings("unused")
    public String getFlag() {
        return flag;
    }
}
