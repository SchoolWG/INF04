import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class szyfrCezaraTest {
    szyfrCezara test;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        test = new szyfrCezara();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    void testSzyfrujDanePodst() {
        String s1 = test.szyfruj("abc",3);
        assertEquals("def", s1);
    }
    @Test
    void testSzyfrujZawijanie() {
        String s1 = test.szyfruj("xyz",3);
        assertEquals("abc", s1);
    }
    @Test
    void testSzyfrujOdszyfr() {
        String s1 = test.szyfruj("def",-3);
        assertEquals("abc", s1);
    }
    @Test
    void testSzyfrujMax() {
        String s1 = test.szyfruj("abc",29);
        assertEquals("def", s1);
    }
    @Test
    void testSzyfrujSpacja() {
        String s1 = test.szyfruj("ab cd",2);
        assertEquals("cd ef", s1);
    }

}