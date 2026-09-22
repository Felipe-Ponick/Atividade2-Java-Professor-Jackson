package Demonstração;

public class Revenda {
    public static void main(String[] args) {
        System.out.println("Revenda");

        Carro bmw = new Carro(
            "Azul Petróleo", 
            2007, 
            "BMW", 
            "ZYX-9F3S"
        );
        Carro porsche = new Carro(
            "Cinza", 
            2018, 
            "Porsche", 
            "QRO-S3X0"
        );

        System.out.println(bmw.cor);
        System.out.println(bmw.ano);
        System.out.println(bmw.marca);
        System.out.println(bmw.placa);
        
        System.out.println(porsche.cor);
        System.out.println(porsche.ano);
        System.out.println(porsche.marca);
        System.out.println(porsche.placa);

    }
}
