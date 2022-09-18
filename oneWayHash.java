import javax.xml.bind.DatatypeConverter;
import javax.xml.bind.SchemaOutputResolver;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class oneWayHash {

    void hash(){


        Scanner scan = new Scanner(System.in);
        System.out.println("Write your text to be hashed");
        String text = scan.nextLine();
        //ХЭШИРОВАНИЕ
        try {
            MessageDigest digester = MessageDigest.getInstance("SHA-512");
            byte[] input = text.getBytes();
            byte[] digest = digester.digest(input);
            System.out.println(DatatypeConverter.printHexBinary(digest));
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }

    }

}
