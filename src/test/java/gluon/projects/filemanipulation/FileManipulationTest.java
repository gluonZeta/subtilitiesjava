package gluon.projects.filemanipulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class FileManipulationTest {

    FileManipulation fileManipulation;

    @BeforeEach
    void setUp() {
        this.fileManipulation = new FileManipulation();
    }

    @Test
    void testInstanciation() {
        Assertions.assertNotNull(this.fileManipulation);
        Assertions.assertEquals("C:\\Users\\andra\\Documents\\my_project\\data\\train.csv",
                this.fileManipulation.getFilePath());
    }

    @Test
    void testReadFile() {
        List<String> lines = this.fileManipulation.getFileLines();
        Assertions.assertNotNull(lines);
    }

    void testStackOverflow() {
        this.fileManipulation.stackOverflowMethod(23);
    }

}