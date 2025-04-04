package Exercicio06;

public class Main {
    public static void main(String[] args) {
        Hora hora1 = new Hora(10, 5, 15);
        Hora hora2 = new Hora(3, 30, 29);
        Hora hora3 = new Hora(48, 125, 963);

        System.out.println(hora1.formatar());
        System.out.println(hora2.formatar());
        System.out.println(hora3.formatar());

    }
}
