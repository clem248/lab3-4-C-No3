import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.util.Scanner;

public class SymmetricSipher {

    void symmetricSiph()throws Exception{
            Scanner scan = new Scanner(System.in);
            System.out.println("Write your text");
            String text = scan.nextLine();
            // Generate new key
            KeyGenerator keygen = KeyGenerator.getInstance("AES");
            keygen.init(256);
            Key key = keygen.generateKey();

            System.out.println("this is your generated key!--" + key + "--Keep it in secret");
            // Encrypt with key
            String transformation = "AES/ECB/PKCS5Padding";
            Cipher cipher = Cipher.getInstance(transformation);
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] encrypted = cipher.doFinal(text.getBytes());

            System.out.println("This is your text encrypted text--" + DatatypeConverter.printHexBinary(encrypted));
            // Decrypt with key
            cipher.init(Cipher.DECRYPT_MODE, key);
            String result = new String(cipher.doFinal(encrypted));
            System.out.println("this is your text decrypted with the same key--" + result);

    }

}
