#Autor: Francisca Benavides
#Fecha: 25-05-2023

Feature: Crear nueva cuenta en paraisokawaii

  Como tia de una ninia que gusta de productos con tematica asiatica
  Quiero tener acceso a una cuenta en su web favorita
  Para poder comprarle regalos sin tener que escribir mis datos nuevamente

  Scenario: Registro en paraisokawaii con exito
    Given He accedido a la pagina de paraisokawaii
    And Selecciono la opcion acceder
    When Completo el formulario de registro
    And Hago clic en boton Registrarse
    Then El registro es realizado de forma exitosa