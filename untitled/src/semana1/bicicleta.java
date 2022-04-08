package semana1;

public class bicicleta {
    bicicleta(){

    }
    public bicicleta(String color, int pins, int rodada, double velocidad){
        this.color=color;
        this.pins=pins;
        this.rodada=rodada;
        this.velocidad=velocidad;

    }
    public int pins, rodada;
    public double velocidad;
    public String color;
    public int getrodada() {
        return rodada;
    }

    public double getvelocidad() {
        return velocidad;
    }

    public String getcolor() {
        return color;
    }

    public int getpins() { return pins;  }
}
