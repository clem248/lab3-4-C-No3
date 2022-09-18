import java.sql.SQLOutput;
import java.util.Scanner;

public class main {

    public static void main (String[] args) throws Exception {


        System.out.println("Choose the type of cipher(number)");

        System.out.println("1.JulyCaesar\n2.OneWayHash\n3.SymmetricCipher\n4.EncryptionPhoto\n5.DecryptionPhoto");

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        if(num == 1){
            JulyCaesar july = new JulyCaesar();
            july.caesarMaker();
        } else if (num == 2) {
            oneWayHash oneWayHash = new oneWayHash();
            oneWayHash.hash();
        } else if (num == 3) {
            SymmetricSipher symmetricSipher = new SymmetricSipher();
            symmetricSipher.symmetricSiph();
        } else if (num == 4) {
            EncryptionPhoto encryptionPhoto = new EncryptionPhoto();
            encryptionPhoto.encryption();
        } else if (num == 5) {
            DecryptionPhoto decryptionPhoto = new DecryptionPhoto();
            decryptionPhoto.descryption();
        }else {
            System.out.println("Launch again and write the number correctly");
        }


    }
}
