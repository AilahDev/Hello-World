import java.util.Scanner;

public class dioXP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Digite seu nickname de heroi ou 'sair' para finalizar: ");    
            String nickname = scanner.nextLine();

            if (nickname.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Informe o XP do seu heroi: ");
            int xp = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha após o número
            String nivel;

            if (xp < 1000) {
                nivel = "Ferro";
            } else if (xp < 2001) {
                nivel = "Bronze";
            } else if (xp < 5001) {
                nivel = "Prata";
            } else if (xp < 7001) {
                nivel = "Ouro";
            } else if (xp < 8001) {
                nivel = "Platina";
            } else if (xp < 9001) {
                nivel = "Ascendente";
            } else if (xp < 10001) {
                nivel = "Imortal";
            } else {
                nivel = "Radiante";
            }

            System.out.println(nickname + " esta no nivel " + nivel);
        } 
        scanner.close();
    }
}