package co.com.prueba.jose.stepdefinitions;

import co.com.choucair.prueba.model.UtestDatos;
import co.com.choucair.prueba.tasks.Abrir;
import co.com.choucair.prueba.tasks.Llenar;
import co.com.choucair.prueba.tasks.LlenarDireccion;
import co.com.choucair.prueba.tasks.LlenarDispositivos;
import org.junit.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actors.OnStage;
import sun.security.util.PendingException;

import java.util.List;


public class StepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Jose esperar aprender mucho de pruebas de software$")
    public void joseEsperarAprenderMuchoDePruebasDeSoftware() throws Exception{
        OnStage.theActorCalled("Jose").wasAbleTo(Abrir.laPagina());
    }


    @When("^Completara el formulario completo con sus datos$")
    public void completaraElFormularioCompletoConSusDatos(List<UtestDatos> datos) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Llenar.laPagina(datos), LlenarDireccion.laPagina(datos),
                LlenarDispositivos.laPagina(datos));
    }

    @Then("^Finaliza el registro al completar los formularios$")
    public void finalizaElRegistroAlCompletarLosFormularios() throws Exception {

    }
}
