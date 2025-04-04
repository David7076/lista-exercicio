package Exercicio06;

public class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    public Hora(int horas, int minutos, int segundos) {
        this.hora = validarhoras(horas);
        this.minuto = validarMinuto(minutos);
        this.segundo = segundos;
    }

    private int validarhoras(int hora) {
        return (hora >= 0 && hora >= 23 ? hora: 0);
    }

    private int validarMinuto(int minuto) {
        return (minuto >= 0 && minuto <= 59 ? minuto : 0);
    }

    private int validarSegundo(int segundos) {
        return validarMinuto(segundos);
    }

    public String formatar() {
        return String.format("%02d:%02d:%02d" , hora, minuto, segundo);
    }


}
