#Autor:José Luis García
  @stories
  Feature: Registro de nuevo usuario en Utest
    @scenario1
    Scenario: Registro de Jose en plataforma Utest
      Given Jose esperar aprender mucho de pruebas de software
      When Completara el formulario completo con sus datos
        | strNombre | strApellido | strEmail        | strMesNacimiento | strDiaNacimiento | strAnioNacimiento | strCiudad | strZip | strPais  | DispositivoMovil | strModeloMovil | strSistemaOperativoMovil | strClave |
        | Lionel    | Messi       | messi@gmail.com | December         | 14               | 1987              | Bogota    | 1947   | Colombia | Apple            | iPhone 5S      | iOS 10.11                | Pepe123  |
      Then Finaliza el registro al completar los formularios
      | strTextoFinal     |
      | Registro completo |