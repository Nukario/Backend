package semana1;

public class PruebaBicicleta {
    public static void main(String[] args){
        def();
    }
    public static void def() {
        bicicleta biciMountain = new bicicleta("Blanco",6,24,25);
        Carrito extremo = new Carrito("amarillos","Hot wheels",4,2,2);
        String msg = "Soy una bici de montaña con estas caracteristicas: ";
        msg += "\nColor: "+biciMountain.getcolor();
        msg += "\nVelocidad: "+biciMountain.getvelocidad();
        msg += "\nRodada: "+biciMountain.getrodada();
        msg += "\nPins: "+biciMountain.getpins();
        System.out.print(msg);

        String msg2 = "Soy un Carrito con las siguientes caracteristicas: ";
        msg2 +="\nColor: "+extremo.getcolor();
        msg2 +="\nMarca: "+extremo.getmarca();
        msg2 +="\nllantas: "+extremo.getllantas();
        msg2 +="\nVentanas: "+extremo.getventanas();
        msg2 +="\nPuertas: "+extremo.getpuertas();
        System.out.println(msg2);
    }
}
