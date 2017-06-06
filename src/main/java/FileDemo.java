import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by steven on 2017/6/1.
 */
public class FileDemo {

    public static void main(String[] args) throws IOException {
        File file;
        File linkFile = null;
        try {
            file = new File("document");
            linkFile = new File(file, "taobao/links.txt");
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
//        try (BufferedReader br = new BufferedReader(new FileReader(linkFile))) {
//            String currentLine;
//            while ((currentLine = br.readLine()) != null) {
//                System.out.println(currentLine);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try(BufferedWriter bw = new BufferedWriter(new FileWriter(linkFile, true))) {
//            bw.write("\ntaobao.com");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try {
            FileUtils.writeStringToFile(linkFile, "yahoo.com", true);
            String content = FileUtils.readFileToString(linkFile);
            System.out.print(content);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}