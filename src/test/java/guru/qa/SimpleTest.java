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
        Selenide.open("https://ya.ru");
        //... поиск в новостях
        WebDriverRunner.closeWindow();
    }

    @Test
    void assertTest2() {
        System.out.println("###     @Test2");
        Selenide.open("https://ya.ru");
        //... поиск в картинках
        WebDriverRunner.closeWindow();
    }

    @Test
    void assertTest3() {
        System.out.println("###     @Test3");
        Selenide.open("https://ya.ru");
        //... поиск в тексте
        WebDriverRunner.closeWindow();
    }

    @AfterEach
    void closeYa() {
        System.out.println("###     @AfterEach");
        WebDriverRunner.closeWindow();
    }

    @AfterAll
    static void close() {
        System.out.println("###     @AfterAll");
        WebDriverRunner.closeWindow();
    }
}
