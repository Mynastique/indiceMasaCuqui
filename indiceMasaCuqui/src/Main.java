import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Declaración de las variables
        double peso;
        double altura;
        double imc;
        System.out.println("Calculadora de Índice de Masa Cuqui");
        Scanner sc = new Scanner(System.in);
        // Validar el peso (no menor que 0)
        do {
            System.err.println("Introduce tu peso en kg:");
            peso = sc.nextDouble();
            if (peso <= 0){
                System.err.println("Peso no válido");
            }
        } while (peso <= 0); // ¿Por qué siendo "falso" pasa a la siguiente condicion?
        // Validar la altura (no menor a 0) (sin ayuda)
        do {
            System.err.println("Introduce tu altura en metros (Ej:1,68):");
            altura = sc.nextDouble();
            if (peso <= 0) {
                System.err.println("Altura no válida");
            }
        } while (altura <= 0);
        // Calcular IMC
        imc = peso / (altura * altura);
        // Mostrar resultado
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
