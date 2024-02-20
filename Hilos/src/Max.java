/*
    Realizado por Miguel Angel Cruz Roman - 09/02/2024
    Clase que representa a un hilo usado en la clase principal

 */
public class Max extends Thread{

    //Lo que queremos que haga el hilo se coloca dentro del método "run()"
    public void run(){
        for(int i = 0; i<10;i++){

            //Con el método "sleep()" se utiliza para bajar la velocidad del hilo
            /*try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/

            System.out.println(this.getName()+" está corriendo");

        }
    }

}
