package ExerciciosJavaObjetos.Ex02;

public class Caneta {
    String modelo;
    String cor;
    Float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Informações da caneta:");
        System.out.println("Cor: "+this.cor);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Carga: "+this.carga);
        System.out.println("Está Tampada: "+this.tampada);
    }

    void rabiscar() {
        if(tampada==true) {
            System.out.println("Estou rabiscando!.");
        } else {
            System.out.println("Não posso rabicar!");
        }
    }

    void tampar() {
        
    }

    void destampar() {
        
    }
}
