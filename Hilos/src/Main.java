/*
    Realizado por Miguel Angel Cruz Roman - 09/02/2024
    Programa para implementar hilos para representar una carrera

 */
public class Main {
    public static void main(String[] args) {

        //Crear un objeto del hilo 1
        Max h1 = new Max();
        //Se le coloca un nombre al hilo
        h1.setName("Max");
        //Con el método "start()" se invoca al método "run()" del hilo
        h1.start();


        //Crear un objeto del hilo 2
        Checo h2 = new Checo(h1);
        //Se le coloca un nombre al hilo
        h2.setName("Checo");
        //Con el método "start()" se invoca al método "run()" del hilo
        h2.start();


    }
}