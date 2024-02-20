/*
    Realizado por Miguel Angel Cruz Roman - 09/02/2024
    Clase que representa a un hilo usado en la clase principal

 */
public class Checo extends Thread{

    Thread max;

    //Se crea un constructor por defecto para realizar un comportamiento especial
    public Checo(Thread max){
        this.max = max;
    }

    //Lo que queremos que haga el hilo se coloca dentro del método "run()"
    public void run(){
        for(int i = 0; i<10;i++){

            //Con el método "sleep()" se utiliza para bajar la velocidad del hilo
            /*try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/

            System.out.println(this.getName()+" está corriendo");

            //Con el método "join()" hace que el hilo espere a que termine otro
            try {
                this.max.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
