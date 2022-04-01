package guru.qa;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.*;

public class SimpleTest {

    @BeforeAll
    static void initDB() {
        System.out.println("###     @BeforeAll");
    }

    @BeforeEach
    void openYaPage() {
        System.out.println("###     @BeforeEach");
        Selenide.open("https://ya.ru");
    }

    @Test
    void assertTest(){
        System.out.println("###     @Test1");
        //... поиск в новостях
    }

    @Test
    void assertTest2() {
        System.out.println("###     @Test2");
        //... поиск в картинках
    }

    @Test
    void assertTest3() {
        System.out.println("###     @Test3");
        //... поиск в тексте
    }

    @AfterEach
    void closeYa() {
        System.out.println("###     @AfterEach");
        WebDriverRunner.closeWindow();
    }

    @AfterAll
    static void close() {
        System.out.println("###     @AfterAll");
    }
}
