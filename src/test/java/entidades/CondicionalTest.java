package entidades;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class CondicionalTest {

    @Test
    @Disabled
    public void anularPrueba(){
        System.out.println("No se ejecuta");
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    public void pruebaCondicionalSistOp(){
        System.out.println("Se ejecuta si el SO es windows");
    }

    @Test
    @EnabledOnJre(JRE.JAVA_8)
    public void pruebaCondicionalJRE8(){
        System.out.println("Se ejecuta si el la version de java es la 8");
    }

    @Test
    public void pruebaCondicionalSiTrue(){
        Assumptions.assumeTrue((1+1==2)); //saltara si la condicion no es verdadera
        System.out.println("Ejecuta pruebaCondicionalSiTrue");
    }

    @Test
    public void pruebaCondicionalSiCondicion(){
        Assumptions.assumingThat((1+1==2), ()->{
            System.out.println("Ejecuto pruebaCondicionalSiCondicion ");
        });;
    }


}
