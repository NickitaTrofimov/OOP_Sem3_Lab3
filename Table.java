package ru.mirea;

public class Table extends Furniture {
    private int surface;
    private int number_of_boxes;

    public Table(String name, int price, String material) {
        super(name, price, material);
    }

    public Table(String name, int price, String material, int surface, int number_of_boxes){
        super(name, price, material);
        this.surface = surface;
        this.number_of_boxes = number_of_boxes;
    }

    public Table(String name, int price, int number_of_boxes, String material) {
        super(name, price, material);
        this.number_of_boxes = number_of_boxes;
    }

    public int getSurface(){
        return surface;
    }

    public int getNumber_of_boxes(){
        return number_of_boxes;
    }

    public void display_Info(){
        System.out.println("Название: " + super.getName() + " Цена: " + super.getPrice() + " Материал: " + super.getMaterial() + " Покрытие" + surface + " Кол-во ящиков" + number_of_boxes);
    }
}
