package ExerciciosJavaObjetos.Ex02;

public class Aula02 {
    
    public static void main(String[] args) {
        // Objeto1 
        Caneta c1 = new Caneta();
        // Atributos do Objeto.
        c1.cor = "Azul";
        c1.ponta = 0.8f;
        c1.modelo = "Bic Cristal";
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
        c2.modelo = "Metal Grafite";
        c2.carga = 90;
        c2.tampada = true;

        // Chamada dos metodos
        c2.status();
        c2.rabiscar();

        // Final da aula, crie um novo objeto semelhante, com dois objetos fisicos, e dois objetos abstratos que você tenha proximo de você.
        // conclua a aula a termina os 4 Objetos criados.
        
        // criando Objetos concretos Mouse:

        Mouse m1 = new Mouse();
        // ATributos
        m1.marca = "Dell";
        m1.modelo = "G4";
        m1.carga = 79;
        m1.ligado = true;
        m1.click = false;

        // Chamado
        m1.status();
        m1.bateria();
        m1.funcionando();
        m1.defeito();

        // criando Objetos concretos Teclado:
       
    }
}