import java.util.Scanner;
public class Horario12 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int hora, minuto, hora12;

        while (true) {
            System.out.print("Digite a hora (formato 24 horas): ");
            hora = sc.nextInt();
            System.out.print("Digite os minutos: ");
            minuto = sc.nextInt();
            hora12 = converter(hora);
            Impressao(hora, hora12, minuto);
            System.out.println("Deseja calcular outro horário?");
            System.out.println("S para Sim");
            System.out.println("N para Não");
            String novo = sc.next();
            if (novo.equalsIgnoreCase("N"))
                break;
                System.out.println("Fim");
        }
        sc.close();

    }
    public static int converter(int hora) {
        if (hora > 12) {
            hora -= 12;
        } else {
            return hora;
        }
        return hora;
    }

    public static void Impressao(int horario, int novaHora, int minutos) {
        if (horario > 12) {
            System.out.println("Este horário é igual a "+novaHora+":" +minutos+" P.M");
        } else {
            System.out.println("Este horário é igual a "+novaHora+":" +minutos+" A.M");
        }
    }
}
