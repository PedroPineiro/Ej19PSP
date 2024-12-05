public class Liebre extends Tortuga{

    int casillaActual=1;

    Carrera carrera = new Carrera();

    public synchronized void run() {
        while(casillaActual!= Carrera.casillaFinal){
            int numRandom = carrera.generarRandom();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            switch (numRandom){
                case 0,1:
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Liebra se duerme y no se mueve");
                    Carrera.comprobarCasilla(casillaActual,competidor);
                case 2,3:
                    casillaActual=casillaActual+9;
                    System.out.println(competidor+" avanza 9 casillas");
                    Carrera.comprobarCasilla(casillaActual,competidor);
                    break;
                case 4:
                    casillaActual=casillaActual-12;
                    System.out.println(competidor+" retrocede 12 casillas");
                    Carrera.comprobarCasilla(casillaActual,competidor);
                    break;
                case 5,6,7:
                    casillaActual=casillaActual+1;
                    System.out.println(competidor+" avanza 1 casilla");
                    Carrera.comprobarCasilla(casillaActual,competidor);
                    break;
                case 8,9:
                    casillaActual=casillaActual-2;
                    System.out.println(competidor+" retrocede 2 casillas");
                    Carrera.comprobarCasilla(casillaActual,competidor);
            }


        }
    }
}
