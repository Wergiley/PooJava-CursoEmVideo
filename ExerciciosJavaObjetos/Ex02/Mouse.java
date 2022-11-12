package ExerciciosJavaObjetos.Ex02;
// Objeto Fisico
public class Mouse {
    // Atributos, Metodos e Estado. 
    String marca;
    String modelo;
    int carga;
    boolean ligado;
    boolean click;

    void status() {
        System.out.println("\nStatus do Mouse: ");
        System.out.println("Marca:"+this.marca);
        System.out.println("Modelo:"+this.modelo);
        System.out.println("Ligado:"+this.ligado);
        System.out.println("Funcionando:"+this.click);
        System.out.println("Bateria:"+this.carga);
    }

    void bateria() {
        System.out.println("A bateria está em:"+this.carga+"%");
    }

    void funcionando() {
        if(ligado==true && click==true) {
            System.out.println("Está ligado e funcionando!");
        } else {
            System.out.println("Está ligado, mas não está funcionando!");
        }
    }

    void defeito() {
        if(click==false) {
            System.out.println("Mouse não está clicando, está com defeito!");
        }
    }
}
