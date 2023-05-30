#Autor: Francisca Benavides
#Fecha: 29-05-2023

  Feature: Busqueda en MercadoLibre

    Como organizador de las vacaciones familiares
    Quiero encontrar <producto> acorde a la ocasion en MercadoLibre
    Para confirmar que el producto que necesito exista en la pagina web

  Scenario Outline: Busqueda de producto en MercadoLibre
    Given Estoy en la pagina principal de Mercadolibre
    When Escribo el producto a buscar "<producto>"
    And Hago clic en el boton buscar
    Then Aparece un producto con ese nombre "<producto>"

    Examples:
      | producto  |
      | Bloqueador solar leblon 1 lt |
      | Repelex nf aerosol 165 |
      | Carpa wetland 4 personas |
