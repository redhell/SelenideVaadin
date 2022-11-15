import lombok.extern.slf4j.Slf4j;
import org.junit.BeforeClass;
import org.junit.Test;
import org.robotframework.swing.SwingLibrary;

import java.util.List;

@Slf4j
public class RobotTest {
    private static SwingLibrary swingLibrary;

    @BeforeClass
    public static void setup() {
        swingLibrary = new SwingLibrary();
        swingLibrary.runKeyword("Launch Application", List.of("de.bublitz.TestApp.MainTest"));
        swingLibrary.runKeyword("Select Main Window", List.of());
    }

    @Test
    public void simpleTest() {

        runKeyword("Label Should Exist", "Beispiel JLabel");
        runKeyword("Label Should Not Exist", "Existiert nicht");
    }

    @Test(expected = RuntimeException.class)
    public void negativTest() {
        runKeyword("Label Should Exist", "Beispiel JLabel");
        runKeyword("Label Should Exist", "Existiert nicht");
    }

    private void runKeyword(String keyword, String... args) {
        swingLibrary.runKeyword(keyword, List.of(args));
    }

}
