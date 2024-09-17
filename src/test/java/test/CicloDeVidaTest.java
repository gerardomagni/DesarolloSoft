package test;

import org.junit.jupiter.api.*;

public class CicloDeVidaTest {

    @BeforeAll
    public static void inicializar(){
        System.out.println("Ejecuto al inicio una unica vez");
    }

    @BeforeEach
    public void inicializarTest(){
        System.out.println("Ejecuto al inicio antes de cada uno de los test");
    }

    @Test
    public void testUno(){
        System.out.println("Ejecuto test uno");
    }

    @Test
    public void testDos(){
        System.out.println("Ejecuto test dos");
    }

    @AfterEach
    public void finalizarTest(){
        System.out.println("Ejecuto al final despues de cada uno de los test");
    }

    @AfterAll
    public static void finalizar(){
        System.out.println("Ejecuto al final de los test una unica vez");
    }

    //Nota el orden de los test es independiente
    //pero si quiero por algun motivo dar un order puedo usar @TestMethodOrder() en la clase
    //ejemplo @TestMethodOrder(MethodOrderer.Alphanumeric.class)
    //o MethodOrderer.OrderAnnotation.class + @Order(int nroOrden) en cada Test

}
