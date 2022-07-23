package co.com.choucair.prueba.tasks;

import co.com.choucair.prueba.model.UtestDatos;
import co.com.choucair.prueba.userinterface.PaginaDispositivos;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import java.util.List;

public class LlenarDispositivos implements Task {
    private List<UtestDatos> datos;

    public LlenarDispositivos(List<UtestDatos> datos) {
        this.datos = datos;
    }

    public static LlenarDispositivos laPagina(List<UtestDatos> datos) {
        return Tasks.instrumented(LlenarDispositivos.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(PaginaDispositivos.CONTENEDOR_DISPOSITIVO_MOVIL),
            Enter.theValue(datos.get(0).getStrDispositivoMovil()).into(PaginaDispositivos.DISPOSITIVO_MOVIL).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
            Click.on(PaginaDispositivos.CONTENEDOR_MODELO_MOVIL),
            Enter.theValue(datos.get(0).getStrModeloMovil()).into(PaginaDispositivos.MODELO_MOVIL).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
            Click.on(PaginaDispositivos.CONTENEDOR_SISTEMA_OPERATIVO),
            Enter.theValue(datos.get(0).getStrSistemaOperativoMovil()).into(PaginaDispositivos.SISTEMA).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
            Click.on(PaginaDispositivos.BOTON_FINAL));
    }
}
