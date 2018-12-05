package top.pcstar.designpattern.decorator.iodemo;

import java.io.*;

public class InputStreamTest {
    public static void main(String[] args) {
        int c;
        try (InputStream inputStream =
                     new LowerCaseInputStream(
                             new BufferedInputStream(
                                     new FileInputStream("./src/main/java/top/pcstar/designpattern/decorator/iodemo/test.txt")
                             )
                     )
        ) {
            while ((c = inputStream.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
