public class Calculadora {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Uso correto: java Calculadora <operacao> <num1> <num2>");
            return;
        }

        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        if (args[0].equals("somar")) {
            sum(x, y);
        } else if (args[0].equals("subtrair")) {
            minus(x, y);
        } else if (args[0].equals("multiplicar")) {
            mult(x, y);
        } else if (args[0].equals("dividir")) {
            if (y == 0) {
                System.out.println("Erro: Divisão por zero não é permitida.");
            } else {
                div(x, y);
            }
        } else {
            System.out.println("Nenhuma instrução definida. Use: somar, subtrair, multiplicar ou dividir.");
        }
    }

    static void sum(int x, int y) {
        System.out.println("Resultado: " + (x + y));
    }

    static void minus(int x, int y) {
        System.out.println("Resultado: " + (x - y));
    }

    static void mult(int x, int y) {
        System.out.println("Resultado: " + (x * y));
    }

    static void div(int x, int y) {
        System.out.println("Resultado: " + (x / y));
    }
}

