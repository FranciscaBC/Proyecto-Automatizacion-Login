#Autor: Francisca Benavides
#Fecha: 25-05-2023

Feature: Crear nueva cuenta en spotify

  Como estudiante
  Quiero poder escuchar musica sin necesidad de descargarla
  Para poder relajarme antes de los examenes

  Scenario: Registro en Spotify con exito
    Given He accedido a la pagina de Spotify
    And Selecciono la opcion registrate
    When Completo el formulario de registro
    And Hago clic en boton Registrarse
    Then El registro es realizado de forma exitosa
    And Soy redireccionado a mi homepage en Spotify

















