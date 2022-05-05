package lesson13;

import java.util.Objects;

public class Product implements Comparable<Product>{

    private Integer id;
    private String name;
    private double price;

    public Product() {
    }

    public Product(Integer id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && /*Objects.equals(id, product.id) &&*/ Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(/*id,*/ name, price);
        //return 31 * id.hashCode() + name.hashCode() + Double.valueOf(price).hashCode(); // пример того, как реализован хэш код

    }

    @Override // 2-й способ определения порядка следования объектов в TreeSet
    public int compareTo(Product o) { // для этого мы имплементим в классе интерфейс Comparable<тут указываем этот же класс>
        return this.getId().compareTo(o.getId()); // здесь указана логика сравнения объектов
    }
}