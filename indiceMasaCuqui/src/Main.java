import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double peso;
        double altura;
        double imc;
        System.out.println("Calculadora de Índice de Masa Cuqui");
        System.err.println("Introduce tu peso en kg:");
        Scanner sc;
        sc = new Scanner(System.in);
        peso = sc.nextDouble();
        if (peso <= 0){
            System.err.println("Los datos no son válidos");
        }

        System.err.println("Introduce tu altura en metros (Ej:1,68):");
        altura = sc.nextDouble();
        if (altura <= 0){
            System.err.println("Los datos no son válidos");
        }
        imc = peso / (altura * altura);
        System.out.print("Tu Índice de Masa Cuqui es ");
        if (imc < 18.5){
            System.out.print("Bellísima");
        } else if (imc > 18.5 && imc < 25){
            System.out.print("Divina");
        } else if (imc > 25 && imc < 30) {
            System.out.print("Preciosa");
        } else if (imc > 30 && imc < 35){
            System.out.print("Diosa del olimpo");
        } else if (imc > 35 && imc < 40){
            System.out.print("Imparable");
        } else {
            System.out.print("Perrísima");
        }
    }
}
