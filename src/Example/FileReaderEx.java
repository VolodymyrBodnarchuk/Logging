package Example;

import jenkov.Filters;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;
public class FileReaderEx <T> {
    private static final Logger loger = Logger.getLogger(FileReaderEx.class.getName());

    public void readAndPrintFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                T data = (T) line;
                loger.info(data.toString());
            }
        } catch (IOException e) {
            loger.warning("Error reading file: " + e.getMessage());
        }
    }


    public static void main(String[] args) {
        FileReaderEx<String> fileReaderEx = new FileReaderEx<>();
        String filePath = "src\\Example\\example.txt";
        fileReaderEx.readAndPrintFile(filePath);
    }
}