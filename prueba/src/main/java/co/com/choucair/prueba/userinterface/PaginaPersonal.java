package co.com.choucair.prueba.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaPersonal {
    public static final Target NOMBRE = Target.the("Nombre")
            .located(By.id("firstName"));
    public static final Target APELLIDO = Target.the("Apellido")
            .located(By.id("lastName"));
    public static final Target EMAIL = Target.the("Email")
            .located(By.id("email"));
    public static final Target MES_NACIMIENTO = Target.the("Mes")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[1]/select"));
    public static final Target DIA_NACIMIENTO = Target.the("Dia")
            .located(By.id("birthYear"));
    public static final Target ANIO_NACIMIENTO = Target.the("Anio")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[3]/select"));
    public static final Target BOTON = Target.the("Boton de siguiente")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/a/span"));
}
