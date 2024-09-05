package gluon.projects.filemanipulation;

import gluon.projects.utilities.PropertiesGetter;
import lombok.Getter;
import lombok.Setter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@Getter
@Setter
public class FileManipulation {

    private String filePath;

    public FileManipulation() {
        Properties properties = PropertiesGetter.getProperties("application.properties");
        this.filePath = properties.getProperty("tinystorypath");
    }

    public List<String> getFileLines() {
        List<String> lines = new ArrayList<>();
        String line;
        try(BufferedReader br = new BufferedReader(new FileReader(this.filePath))) {
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }

            Runtime runtime = Runtime.getRuntime();
            long totalMemory = runtime.totalMemory();
            long freeMemory = runtime.freeMemory();
            long usedMemory = totalMemory - freeMemory;

            double totalMems = totalMemory/Math.pow(1024, 3);
            double freeMems = freeMemory/Math.pow(1024, 3);
            double usedMems = usedMemory/Math.pow(1024, 3);

            System.out.println("-------------------------------------------------------------------------");
            System.out.println(totalMems);
            System.out.println(freeMems);
            System.out.println(usedMems);
            System.out.println("-------------------------------------------------------------------------");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }

    public int stackOverflowMethod(int x) {
        x = x+1;
        return stackOverflowMethod(x);
    }

}
