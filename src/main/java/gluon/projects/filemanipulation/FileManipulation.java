package gluon.projects.filemanipulation;

import gluon.projects.utilities.PropertiesGetter;
import lombok.Getter;
import lombok.Setter;

import java.util.Properties;

@Getter
@Setter
public class FileManipulation {

    private String filePath;

    public FileManipulation() {
        Properties properties = PropertiesGetter.getProperties("application.properties");
        this.filePath = properties.getProperty("tinystorypath");
    }

}
