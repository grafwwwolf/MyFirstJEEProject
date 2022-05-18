package ru.pigarev.products;

public class Product {

    private long id;
    private String title;
    private double cost;

    public Product(long id, String title, double cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Номер товара = " + id +
                ", Наименование товара: \"" + title + '\"' +
                ", Стоимость товара: " + cost + " руб.";
    }
}
