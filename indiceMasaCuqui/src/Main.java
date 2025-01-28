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
        System.err.println("Introduce tu altura en metros (Ej:1.68):");
        altura = sc.nextDouble();
        imc = peso / (altura * altura);
        if (imc < 18.5){
            System.out.println("Estás riquísima");
        } else if (imc > 18.5 && imc < 25){
            System.out.println("Estás divina");
        } else if (imc > 25 && imc < 30) {
            System.out.println("Estás preciosa");
        } else if (imc > 30 && imc < 35){
            System.out.println("Diosa del olimpo");
        } else if (imc > 35 && imc < 40){
            System.out.println("Eres Imparable");
        } else {
            System.out.println("Estás Perrísima");
        }



    }
}
