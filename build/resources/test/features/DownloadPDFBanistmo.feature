#Maikel Jose Franco Brito

  Feature: Download document from Banistmo
    As a user, I want to download pdf file from the website

  Scenario: Search the PDF file
    Given The user wants to download PDF file from the page Banistmo
    When  the user seach the document
    Then the document validation is successful
    | strurl |
    | https://www.bancolombia.com/wps/wcm/connect/f7a3486a-41af-46b9-8157-2fde21fa4d0a/poli%CC%81ticas-tratamiento-y-proteccio%CC%81n-de-datos-personales-de-proveedores-grupo-bancolombia.pdf.pdf?MOD=AJPERES&CVID=l33Qn2Y|


