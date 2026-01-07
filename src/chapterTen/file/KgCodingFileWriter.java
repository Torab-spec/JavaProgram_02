package chapterTen.file;

import java.io.FileWriter;
import java.io.IOException;

public class KgCodingFileWriter {
    public static void main(String[] args) {
        String fileName = "Java-course.txt";

       // Example of try-with-resource
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("This is best JAVA course");
            writer.flush();
            System.out.println("File written successfully");
        } catch (IOException exception) {
            System.out.printf("Exception occured %s\n", exception.getMessage());
        }

        // Its throw endless exception
        /*
        FileWriter writer;
        try {
            writer = new FileWriter(fileName);
            writer.write("This is best JAVA course");
            writer.flush();
            System.out.println("File written successfully");
        }catch( IOException exception ){
            System.out.printf("Exception occurred %s\n", exception.getMessage());
        }finally {
            writer.close();
        }
*/
    }
}
