import java.util.Scanner;

public class dioRank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero de vitorias: ");
        int vitorias = scanner.nextInt();

        System.out.print("Digite o numero de derrotas: ");
        int derrotas = scanner.nextInt();

        int saldo = calcularSaldoRankeadas(vitorias, derrotas);
        String nivel;

        if (vitorias < 10) {
            nivel = "Ferro";
        } else if (vitorias < 21) {
            nivel = "Bronze";
        } else if (vitorias < 51) {
            nivel = "Prata";
        } else if (vitorias < 81) {
            nivel = "Ouro";
        } else if (vitorias < 91) {
            nivel = "Diamante";
        } else if (vitorias < 101) {
            nivel = "Lendário";
        } else {
            nivel = "Imortal";
        }

        System.out.println("O Herói tem um saldo de " + saldo + " e esta no nivel " + nivel);
        scanner.close();
    }

    public static int calcularSaldoRankeadas(int vitorias, int derrotas) {
        return vitorias - derrotas;
    }
}
