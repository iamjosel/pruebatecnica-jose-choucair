package co.com.choucair.prueba.userinterface;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


@DefaultUrl("https://www.utest.com/")
public class PaginaUtest extends PageObject{
    public static final Target JOIN = Target.the("Botón para iniciar el registro")
        .located(By.xpath("//a[@class='unauthenticated-nav-bar__dropdown-menu-sign-up']"));
}
