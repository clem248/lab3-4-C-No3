import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;


public class EncryptionPhoto {


    static void encryption() throws IOException {
        Scanner sc = new Scanner(System.in);


        // Here key is act as password to Encrypt and
        // Decrypt the Image
        System.out.print("Enter key for Encryption : ");
        int key = sc.nextInt();


        System.out.println("Your path" );
        //



        // Selecting a Image for operation
        FileInputStream fis = new FileInputStream("C:\\Users\\tema_\\OneDrive\\Рабочий стол\\123.jpg");

        // Converting Image into byte array, create a
        // array of same size as Image size

        byte data[] = new byte[fis.available()];

        // Read the array
        fis.read(data);
        int i = 0;

        // Performing an XOR operation on each value of
        // byte array due to which every value of Image
        // will change.
        for (byte b : data) {
            data[i] = (byte) (b ^ key);
            i++;
        }

        // Opening a file for writing purpose
        FileOutputStream fos = new FileOutputStream("C:\\Users\\tema_\\OneDrive\\Рабочий стол\\123.jpg");

        // Writing new byte array value to image which
        // will Encrypt it.

        fos.write(data);

        // Closing file
        fos.close();
        fis.close();
        System.out.println("Encryption Done...");
        System.out.println("check your photo");
        System.out.println("You can decrypt it back using 5th option" );

    }
}
