package ru.mirea;

public class Wardrobe extends Furniture {
    private int height;
    private int widht;

    public Wardrobe(String name, int price, String material) {
        super(name, price, material);
    }

    public Wardrobe(String name, int price, String material, int height, int widht){
        super(name, price, material);
        this.height = height;
        this.widht = widht;
    }

    public int getHeight(){
        return height;
    }

    public int getWidht(){
        return widht;
    }

    public void display_Info(){
        System.out.println("Название: " + super.getName() + " Цена: " + super.getPrice() + " Материал: " + super.getMaterial() + " Высота" + height + " Ширина" + widht);
    }
}
