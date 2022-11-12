package ExerciciosJavaObjetos.Ex02;


public class Aula02 {
    
    public static void main(String[] args) {
        // Objeto1 
        Caneta c1 = new Caneta();
        // Atributos do Objeto.
        c1.cor = "Azul";
        c1.ponta = 1.5f;
        c1.modelo = "Bic";
        c1.carga = 50;
        c1.tampada = false;

        // Chamada dos metodos

        c1.status();
        c1.rabiscar();

        //Objeto2 

        Caneta c2 = new Caneta();
        //Atributos
        c2.cor = "Preta";
        c2.ponta = 0.5f;
        c2.modelo = "Pen";
        c2.carga = 90;
        c2.tampada = true;

        // Chamada dos metodos
        c2.status();
        c2.rabiscar();

        // Final da aula, crie um novo objeto semelhante, com dois objetos fisicos, e dois objetos abstratos que você tenha proximo de você.
        // conclua a aula a termina os 4 Objetos criados.
    }
}