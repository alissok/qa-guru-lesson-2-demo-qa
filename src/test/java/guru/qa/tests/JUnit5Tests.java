package guru.qa.tests;

import org.junit.jupiter.api.*;

public class JUnit5Tests {

    @BeforeAll
    static void initDB() {
        System.out.println("###     @BeforeAll");
    }

    @BeforeEach
    void openYaPage() {
        System.out.println("###     @BeforeEach");
//        Selenide.open("https://ya.ru");
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
//        WebDriverRunner.closeWindow();
    }

    @AfterAll
    static void close() {
        System.out.println("###     @AfterAll");
    }
}
