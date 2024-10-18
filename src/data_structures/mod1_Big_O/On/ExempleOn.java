package data_structures.mod1_Big_O.On;

public class ExempleOn {
    public static void main(String[] args) {
        imprimir(10);
    }

    public static void imprimir(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

    /* O(n), toda forma de medir requer um parâmetro de entrada, onde o mesmo recebe um valor
    seja ele pequeno ou grande!, o "n" de imprimir foi esse parâmetro de medida para relacionarmos
     */
}
