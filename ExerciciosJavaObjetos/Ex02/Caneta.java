package ExerciciosJavaObjetos.Ex02;
// Atributos da Classe Caneta.
public class Caneta {
    String modelo;
    String cor;
    Float ponta;
    int carga;
    boolean tampada;

      //metodos da caneta...
    void status(){
        System.out.println("\nInformações da caneta:");
        System.out.println("Cor: "+this.cor);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Carga: "+this.carga);
        System.out.println("Está Tampada: "+this.tampada);
    }

    void rabiscar() {
        if(tampada==false) {
            System.out.println("Estou rabiscando!.");
        } else {
            System.out.println("Não posso rabiscar!");
        }
    }

    void tampar() {
       System.out.println("Está tampada");
    }

    void destampar() {
        System.out.println("Não está tampada");
    }
}
