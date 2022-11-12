package programa;



import programa.entities.Painel;

import java.text.*;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Painel> paineis = new ArrayList<>();
        String senha = "0";
        Integer guiche = 0;
        while (senha.equals("exit") == false){
            System.out.print("senha: ");
            senha = sc.next();
            System.out.print("guiche: ");
            guiche = sc.nextInt();
            Painel painel = new Painel(guiche, senha);
            paineis.add(painel);
        }
        System.out.println("Senha");
        System.out.println();
    }
}
