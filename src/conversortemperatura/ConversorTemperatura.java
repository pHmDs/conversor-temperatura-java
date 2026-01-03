
package conversortemperatura;

import java.util.Scanner;

public class ConversorTemperatura {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("\nConversor de Temperatura");
            System.out.println("1 - Celsius para Fahrenheit");
            System.out.println("2 - Celsius para Kelvin");
            System.out.println("3 - Fahrenheit para Celsius");
            System.out.println("4 - Fahrenheit para Kelvin");
            System.out.println("5 - Kelvin para Celsius");
            System.out.println("6 - Kelvin para Fahrenheit");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = sc.nextInt();
            
            switch (opcao) {
                case 1: 
                    System.out.print("Celsius: ");
                    double c1 = sc.nextDouble();
                    System.out.println("Resultado: " + Temperatura.celsiusFahrenheit(c1) + " °F");
                    break;
                case 2: 
                    System.out.print("Celsius: ");
                    double c2 = sc.nextDouble();
                    System.out.println("Resultado: " + Temperatura.celsiusKelvin(c2) + " K");
                    break;
                case 3: 
                    System.out.print("Fahrenheit: ");
                    double f1 = sc.nextDouble();
                    System.out.println("Resultado: " + Temperatura.fahrenheitCelsius(f1) + " °C");
                    break;
                case 4:
                    System.out.print("Fahrenheit: ");
                    double f2 = sc.nextDouble();
                    System.out.println("Resultado: " + Temperatura.fahrenheitKelvin(f2) + " K");
                    break;
                case 5: 
                    System.out.print("Kelvin: ");
                    double k1 = sc.nextDouble();
                    System.out.println("Resultado: " + Temperatura.kelvinCelsius(k1) + " °C");
                    break;
                case 6: 
                    System.out.print("Kelvin: ");
                    double k2 = sc.nextDouble();
                    System.out.println("Resultado: " + Temperatura.kelvinFahrenheit(k2) + " °F");
                    break;
                case 0: 
                    System.out.println("Programa encerrado.");
                    break;
                default: 
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
        sc.close();
        
    }
    
}
