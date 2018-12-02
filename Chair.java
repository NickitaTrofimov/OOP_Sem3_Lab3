package ru.mirea;

public class Chair extends Furniture {
    private int backrest_height;

    public Chair(String name, int price, String material) {
        super(name, price, material);
    }

    public Chair(String name, int price, String material, int backrest_height){
        super(name, price, material);
        this.backrest_height = backrest_height;
    }

    public Chair(int price, String material, int backrest_height){
        super(material, price, material);
        this.backrest_height = backrest_height;
    }

    public int getBackrest_height(){
        return backrest_height;
    }

    public void display_Info(){
        System.out.println("Название: " + super.getName() + " Цена: " + super.getPrice() + " Материал: " + super.getMaterial() + " Размер спинки стула: " + backrest_height);
    }
}
