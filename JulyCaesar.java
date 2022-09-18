import java.util.Scanner;

public class JulyCaesar {

    void caesarMaker(){
        // CAESAR CIPHER



        Scanner scan = new Scanner(System.in);
        System.out.println("Write your text and it will be ciphered\n\n");

        String code = scan.nextLine();

        System.out.println("encrypt it");
        for (char symbol : code.toCharArray()) {
            if (symbol != ' ') {
                symbol = (char) (symbol + 3);
            }

            System.out.print(symbol);
        }
        //Vyvod

        System.out.println("\ndecrypt it");

            System.out.print(code);


        //Vyvod
        String code12 = "ВОЗВРАЩАЙТЕСЬ В РИМ";



    }

}
