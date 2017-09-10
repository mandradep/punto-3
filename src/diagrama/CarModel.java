
package diagrama;

public class CarModel {
    private Category category;
    private String modelNumber;
    private int price;

    public CarModel(Category category, String modelNumber, int price) {
        this.category = category;
        this.modelNumber = modelNumber;
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public int getPrice() {
        return price;
    }
    
    
}
