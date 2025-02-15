package co.com.choucair.prueba.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class PaginaDireccion {
    public static final Target CIUDAD = Target.the("Ciudad")
            .located(By.id("city"));
    public static final Target ZIP = Target.the("Codigo Postal")
            .located(By.id("zip"));
    public static final Target  CONTENEDOR_PAIS = Target.the("Contenedor")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div"));
    public static final Target PAIS = Target.the("Pais")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target BOTON_DISPOSITIVOS = Target.the("Boton que lleva a la seccion de dispositivos")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));

}
