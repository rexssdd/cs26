package me.group.cceproject.controllers;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class OrderItem {
    private final SimpleStringProperty pizzaName;
    private final SimpleStringProperty pizzaPrice;
    private final SimpleStringProperty foodCode;
    private final SimpleIntegerProperty quantity;

    public OrderItem(String pizzaName, String pizzaPrice, String foodCode, int quantity) {
        this.pizzaName = new SimpleStringProperty(pizzaName);
        this.pizzaPrice = new SimpleStringProperty(pizzaPrice);
        this.foodCode = new SimpleStringProperty(foodCode);
        this.quantity = new SimpleIntegerProperty(quantity);
    }

    // Getters
    public String getpizzaName() { return pizzaName.get(); }
    public String getpizzaPrice() { return pizzaPrice.get(); }
    public String getFoodCode() { return foodCode.get(); }
    public int getQuantity() { return quantity.get(); }

    // Setters
    public void setpizzaName(String pizzaName) {
        this.pizzaName.set(pizzaName);
    }

    public void setPizzaPrice(String pizzaPrice) {
        this.pizzaPrice.set(pizzaPrice);
    }

    public void setFoodCode(String foodCode) {
        this.foodCode.set(foodCode);
    }

    public void setQuantity(int quantity) {
        this.quantity.set(quantity);
    }

    // Property getters
    public SimpleStringProperty pizzaNameProperty() { return pizzaName; }
    public SimpleStringProperty pizzaPriceProperty() { return pizzaPrice; }
    public SimpleStringProperty foodCodeProperty() { return foodCode; }
    public SimpleIntegerProperty quantityProperty() { return quantity; }
}