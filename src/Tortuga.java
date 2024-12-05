import java.util.concurrent.ThreadLocalRandom;

public class Tortuga extends Thread{

    int casillaActual=1;
    String competidor="Tortuga";

    Carrera carrera = new Carrera();

    public synchronized void run(){
        while(casillaActual!= Carrera.casillaFinal){
            int numRandom = carrera.generarRandom();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Carrera.comprobarCasilla(casillaActual,competidor);
            switch (numRandom){
                case 0,1,2,3,4:
                    casillaActual=casillaActual+3;
                    Carrera.comprobarCasilla(casillaActual,competidor);
                    break;
                case 5,6:
                    casillaActual=casillaActual-6;
                    Carrera.comprobarCasilla(casillaActual,competidor);
                    break;
                case 7,8,9:
                    casillaActual=casillaActual+1;
                    Carrera.comprobarCasilla(casillaActual,competidor);
                    break;
            }


        }
    }

}
