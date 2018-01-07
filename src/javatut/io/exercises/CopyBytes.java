package javatut.io.exercises;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Never build based on a byte stream. It's primitive as fuck, but it's what everything else is based on. Character streams may make a bit more sense for stuff like the files listed.
 */
public class CopyBytes {

    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("output/iolesson/bootswiththefurrr.txt");
            out = new FileOutputStream("output/iolesson/bootswiththefurrroutagain.txt");

            int c;

            while ((c = in.read()) != -1){
                out.write(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in!=null){
                in.close();
            }
            if (out != null){
                out.close();
            }
        }

    }

}
