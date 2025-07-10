abstract class Product {
    String name;

    Product(String name) {
        this.name = name;
    }

    // Abstract methods
    public abstract double getPrice();
    public abstract String getDescription();

    // Concrete method
    public String getProductDetails() {
        return "Product: " + name + "\nDescription: " + getDescription() + "\nPrice: $" + getPrice();
    }
}

class ElectronicsProduct extends Product {
    double price;
    String brand;

    ElectronicsProduct(String name, double price, String brand) {
        super(name);
        this.price = price;
        this.brand = brand;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Brand: " + brand + " - Electronics Product";
    }
}

class ClothingProduct extends Product {
    double price;
    String size;

    ClothingProduct(String name, double price, String size) {
        super(name);
        this.price = price;
        this.size = size;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Size: " + size + " - Clothing Product";
    }
}

class BookProduct extends Product {
    double price;
    String author;

    BookProduct(String name, double price, String author) {
        super(name);
        this.price = price;
        this.author = author;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Author: " + author + " - Book Product";
    }
}

