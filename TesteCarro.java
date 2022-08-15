
package Aula4;

public class TesteCarro {
    
    public static void main(String[] args) {
        // Criando o objeto van
        Carro van = new Carro();
        // Definindo os atributos do objeto van
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;
        
        System.out.println(van.marca);
        System.out.println(van.modelo);
        
        van.exibirAutonomia();
        
        double autonomia = van.obterAutonomia();
        System.out.println("Autonomia is: " + autonomia);
        System.out.println("autonomia is: " + van.obterAutonomia());
        
        double qtdCombustivel10 = van.caulcularCombustivel(10);
        double qtdCombustivel15 = van.caulcularCombustivel(15);
        
        System.out.println("qtdCombustivel para 10 = " + qtdCombustivel10);
        System.out.println("qtdCombustivel para 15 = " + qtdCombustivel15);


    }
    

}