package calculadora;

public class Calculadora {
    int somar(int num1, int num2){
        return num1 + num2;
    }

    int subtrair(int num1, int num2){
        return num1 - num2;
    }

    int multiplicar(int num1, int num2){
        return num1 * num2;
    }

    int dividir(int num1, int num2){
        return num1 / num2;
    }

    int fatorial(int num){
        if (num < 2){
            return num;
        }

        return num * fatorial(num - 1);
    }
}
