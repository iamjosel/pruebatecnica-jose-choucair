package co.com.choucair.prueba.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDispositivos {
    public static final Target CONTENEDOR_DISPOSITIVO_MOVIL = Target.the("Contenedor Dispositivos")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div"));
    public static final Target DISPOSITIVO_MOVIL = Target.the("Dispositivo movil")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/input[1]"));

    public static final Target CONTENEDOR_MODELO_MOVIL = Target.the("Contenedor Modelo Dispositivo Movil")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div"));
    public static final Target MODELO_MOVIL = Target.the("Modelo Dispositivo Movil")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/input[1]"));

    public static final Target CONTENEDOR_SISTEMA_OPERATIVO = Target.the("Contenedor Sistema Operativo")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div"));
    public static final Target SISTEMA = Target.the("Sistema operativo")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/input[1]"));
    public static final Target BOTON_FINAL = Target.the("Boton que lleva a la seccion final")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
