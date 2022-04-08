package semana1;

public class Carrito {
    Carrito(){
    }
    public int llantas, ventanas, puertas;
    public String color,marca;
    public Carrito(String color, String marca, int llantas, int ventanas, int puertas){
        this.color=color;
        this.marca=marca;
        this.llantas=llantas;
        this.ventanas=ventanas;
        this.puertas=puertas;

    }


    public String getcolor() {
        return color;
    }

    public String getmarca() {
        return marca;
    }

    public int getllantas() {
        return llantas;
    }

    public int getventanas() {
        return ventanas;
    }

    public int getpuertas() {
        return puertas;
    }
}


