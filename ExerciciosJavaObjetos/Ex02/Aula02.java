package ExerciciosJavaObjetos.Ex02;


public class Aula02 {
    
    public static void main(String[] args) {
        Caneta c1 = new Caneta();

        c1.cor = "Azul";
        c1.ponta = 1.5f;
        c1.modelo = "Bic";
        c1.carga = 50;
        c1.tampada = false;

        // Chamada dos metodos

        c1.status();
        c1.rabiscar();
    }
}