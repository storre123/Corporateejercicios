@all
Feature: Cargue de Archivos en Corporate

 Background:
   Given "User" ingresa a corporate con sus credenciales "CB00000015", "epinzo109", "BOGOTA$UAT20251*;"

  Scenario: Cargue de Archivo  de Nomina  por la opcion Produccion
    When  el usuario genera el cargue del archivo de Nomina por la opcion produccion de forma exitosa "D:\Automatizacion\serenity-cucumber-starter-master 4\serenity-cucumber-starter-master\src\test\resources\data\2025_01_Nomina.txt"
    Then El sistema muestra mensaje de cargue exitoso


  Scenario: Cargue de Archivo  de Nomina  por la opcion Pruebas
    When  el usuario genera el cargue del archivo de Nomina por la opcion pruebas de forma exitosa "D:\Automatizacion\serenity-cucumber-starter-master 4\serenity-cucumber-starter-master\src\test\resources\data\2025_01_Nomina.txt"
    Then El sistema muestra mensaje de cargue exitoso


  Scenario: Cargue de Archivo  de Nomina  por la opcion Produccion sin check Administrar Cargas EFD
    When  el usuario genera el cargue del archivo de Nomina por la opcion Produccion sin check de forma exitosa "D:\Automatizacion\serenity-cucumber-starter-master 4\serenity-cucumber-starter-master\src\test\resources\data\2025_01_Nomina.txt"
    Then El sistema muestra mensaje de cargue exitoso


  Scenario: Cargue de Archivo  de Nomina  por la opcion Pruebas sin check Administrar Cargas EFD
    When  el usuario genera el cargue del archivo de Nomina por la opcion Pruebas sin check de forma exitosa "D:\Automatizacion\serenity-cucumber-starter-master 4\serenity-cucumber-starter-master\src\test\resources\data\2025_01_Nomina.txt"
    Then El sistema muestra mensaje de cargue exitoso

#Cargue de Proveedores

  Scenario: Cargue de Archivo  de Proveedores  por la opcion Produccion
    When  el Usuario genera el cargue del archivo de Proveedores por la opcion produccion de forma exitosa "D:\Automatizacion\serenity-cucumber-starter-master 4\serenity-cucumber-starter-master\src\test\resources\data\2025_02_proveedores.txt"
    Then El sistema muestra mensaje de cargue exitoso

  Scenario: Cargue de Archivo  de Proveedores  por la opcion Pruebas
    When  el Usuario genera el cargue del archivo de Proveedores por la opcion pruebas de forma exitosa "D:\Automatizacion\serenity-cucumber-starter-master 4\serenity-cucumber-starter-master\src\test\resources\data\2025_02_proveedores.txt"
    Then El sistema muestra mensaje de cargue exitoso

  Scenario: Cargue de Archivo  de Proveedores  por la opcion Produccion sin check Administrar Cargas EFD
    When  el Usuario genera el cargue del archivo de Proveedores por la opcion Produccion sin check de forma exitosa "D:\Automatizacion\serenity-cucumber-starter-master 4\serenity-cucumber-starter-master\src\test\resources\data\2025_02_proveedores.txt"
    Then El sistema muestra mensaje de cargue exitoso

  Scenario: Cargue de Archivo  de Proveedores  por la opcion Pruebas sin check Administrar Cargas EFD
    When  el Usuario genera el cargue del archivo de Proveedores por la opcion Pruebas sin check de forma exitosa "D:\Automatizacion\serenity-cucumber-starter-master 4\serenity-cucumber-starter-master\src\test\resources\data\2025_02_proveedores.txt"
    Then El sistema muestra mensaje de cargue exitoso


#📄 Documentación Archivo: LoginPage.feature
#
#📌 Descripción General:
#
#Este archivo define escenarios de prueba de comportamiento (BDD) para la funcionalidad de login del sistema HRM (Human Resource Management).
# Usa el lenguaje Gherkin, lo cual permite una lectura clara y estructurada tanto para testers como para stakeholders no técnicos.
#
#🎯 Propósito:
#Validar distintos comportamientos del sistema cuando un usuario intenta iniciar sesión con diferentes combinaciones de credenciales.
#⚙️ ¿Por qué se implementa?
#Se implementa para automatizar pruebas funcionales sobre el módulo de autenticación de la aplicación, asegurando que los mensajes y flujos de
# login se comporten correctamente con distintos tipos de entradas:
#Credenciales válidas.
#Usuario inválido.
#Usuario vacío.
#Contraseña vacía.
#
#🧩 Estructura y Dependencias:
#
#Cada paso (Given, When, Then) está vinculado con métodos en clases Java conocidas como Step Definitions, las cuales implementan la
# lógica que ejecuta lo descrito en los escenarios. Estas definiciones están escritas normalmente en clases como:
#
#LoginPageDefinitions.java
#
#LoginActions.java
#
#LoginValidation.java
#
#
#Además, interactúa con clases de Screenplay como:
#
#Tasks → para acciones como abrir la página o iniciar sesión.
#
#Questions → para validar resultados esperados.
#
#UI Elements → para ubicar campos de usuario, contraseña y mensajes de error.
#
#
#
#---
#
#📚 Escenarios definidos:
#
#✅ @ValidCredentials
#
#Objetivo: Verificar que el usuario pueda iniciar sesión exitosamente con las credenciales correctas.
#
#❌ @InValidCredentials
#
#Objetivo: Validar que el sistema muestre el mensaje de error "Invalid credentials" si se ingresa un usuario o contraseña incorrecta.
#
#⚠️ @BlankUsername
#
#Objetivo: Validar que el sistema exija el nombre de usuario cuando se deja en blanco y muestre "Required" debajo del campo de usuario.
#
#⚠️ @BlankPassword
#
#Objetivo: Validar que el sistema exija la contraseña cuando se deja en blanco y muestre "Required" debajo del campo de contraseña.
#
#
#---
#
#🔗 Clases relacionadas:
#
#Este archivo .feature depende de:
#
#LoginPageDefinitions.java → Implementa los pasos Given, When, Then.
#
#OpenWebPage, DoLogin, ValidateErrorMessages → Clases Task y Question que modelan la lógica del login.
#
#LoginPage.java → Clase PageObject que contiene los localizadores de elementos web.