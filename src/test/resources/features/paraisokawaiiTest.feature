#Autor: Francisca Benavides
#Fecha: 25-05-2023

Feature: Cuenta en paraisokawaii

  Como tia de una sobrina que gusta de productos con tematica asiatica
  Quiero tener acceso a una cuenta en su web favorita
  Para poder comprarle regalos sin tener que escribir mis datos nuevamente

  Background:
    Given He accedido a la pagina de paraisokawaii
    And Selecciono la opcion acceder

  Scenario: Registro en paraisokawaii con exito
    When Completo el formulario de registro
    And Hago clic en boton Registrarse
    Then El registro es realizado de forma exitosa

  Scenario: Ingreso a cuenta paraisokawaii con exito
    When Completo el formulario de ingreso
    And Hago clic en boton Acceder
    Then Puedo ver la frase MI CUENTA en pantalla

  Scenario: Ingreso a mi cuenta paraisokawaii con exito
    When Completo el formulario de ingreso
    And Hago clic en boton Acceder
    Then Validar ingreso a la cuenta