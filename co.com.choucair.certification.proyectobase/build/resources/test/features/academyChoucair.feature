# Autor: José Luis García
  @stories
  Feature: Academy Choucair
    As an user, I want to learn how to automate in screamplay at the Choucair Academy with the automation course
    @scenario1
    Scenario: Search for a automation course
      Given than Messi wants to learn automation at the academy Choucair
      | strUser   | strPassword |
      | TuUsuario | TuClave     |
      When  he search for the course on the choucair academy plataform
      | strCourse               |
      | Metodologia Bancolombia |
      Then he finds the course called
      | strCourse               |
      | Metodologia Bancolombia |