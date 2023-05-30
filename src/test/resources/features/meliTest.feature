#Autor: Francisca Benavides
#Fecha: 29-05-2023

  Feature: Busqueda en MercadoLibre

    Como organizador de las vacaciones familiares
    Quiero encontrar <producto> acorde a la ocasion en MercadoLibre
    Para confirmar que el producto que necesito exista en la pagina web

  Background:
    Given Estoy en la pagina principal de Mercadolibre

  Scenario Outline: Busqueda de producto en MercadoLibre
    When Escribo el producto a buscar "<producto>"
    And Hago clic en el boton buscar
    Then Aparece un producto con ese nombre "<producto>"

    Examples:
      | producto  |
      | Bloqueador Solar Leblon 1 Lt |
      | Repelex Nf Aerosol 165 Ml.|
      | Carpa Wetland 4 Personas Camping Envio Gratis|

  Scenario: Agregar al carro "Corn flakes" en seccion supermercado sin registro
    When Me dirijo a la seccion despensa de supermercado
    And Selecciono el filtro de busqueda Cereales y Barras
    And Agrego al carro un cereal Corn Flakes
    Then Debe aparecer la opción de Crear cuenta


