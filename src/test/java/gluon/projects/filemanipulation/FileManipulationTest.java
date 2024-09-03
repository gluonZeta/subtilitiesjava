package gluon.projects.filemanipulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FileManipulationTest {

    @Test
    public void testInstanciation() {
        FileManipulation fileManipulation = new FileManipulation();
        Assertions.assertNotNull(fileManipulation);
        Assertions.assertEquals("C:\\Users\\andra\\Documents\\my_project\\data\\train.csv",
                fileManipulation.getFilePath());
    }

}