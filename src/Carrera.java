public class Carrera {

    static final int casillaFinal=70;

    public int generarRandom() {
        int probRandom;
        probRandom = (int) (Math.random() * 10);
        return probRandom;
    }

    public static void comprobarCasilla(int casillaActual,String competidor){
        if(casillaActual<1){
            casillaActual=1;
        }
        else if(casillaActual==casillaFinal){
            System.out.println(competidor+" ha ganado la carrera!");
            System.exit(0);
        }
        else{
            System.out.println("Casilla actual = "+casillaActual);
        }


    }
}
