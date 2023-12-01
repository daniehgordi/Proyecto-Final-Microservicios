# PROYECTO FINAL MICROSERVICIOS AGENCIA DE VIAJES
Proyecto final del Master Java de la empresa Viewnext utilizando el Framework Spring Boot.

Este proyecto es una Rest API desarrollada en Spring Boot y ha sido creado como parte de la "formación Java". Esta API permite consta
de 3 microservicios conectados a una misma base de datos.

## TECNOLOGIAS USADAS.
-Spring Boot
-Java
-JpaRepository
-SQL
-Maven

## CONFIGURACION DEL PROYECTO.
Para este proyecto asegurate de tener instalado Java y Maven en el sistema antes de ejecutar el proyecto.
1. Clona el repositorio:
  git cone https://github.com/daniehgordi/Proyecto-Final-Microservicios.git
2. Ejecuta el proyecto y conecta los microservicios a los servidores.
3. Usalo a través de Postman.

## USO DE LA API.
### HOTEL:
listaHoteles(): crea una lista de los hoteles.
  GET http://localhost:8080/hoteles
devuelveHotel(String nombreHotel): devuelve el hotel que le pases como parámetro en la url.
  GET http://localhost:8080/hoteles/lebreros
crearHotel(Hotel hotel): crea un hotel nuevo.
  POST http://localhost:8080/hoteles

### VUELOS:
vuelosDisponibles(int plazasAReservar): te devuelve una lista con los vuelos disponibles para las plazas a reservar.
  GET http://localhost:9090/vuelos/20
actualizarVuelo(int idVuelo,int actualizacionPlazas): actualiza para un vuelo las plazas a reservar.
  PUT http://localhost:9090/vuelos/2?50
listaVuelos(): saca una lista de vuelos.
  GET http://localhost:9090/vuelos
crearVuelo(Vuelo vuelo): creas un vuelo nuevo.
  POST http://localhost:9090

### RESERVAS:
crearReserva(Reserva reserva): crea una reserva.
  GET http://localhost:9090/reservas
dameLista(): te devuelve un listado de todas las reservas.
  GET http://localhost:9090/reservas
reservasExistentes(String nombreHotel): dandole el nombre del hotel devuelve una lista con las reservas de este.
  
Este proyecto esta realizado por Daniel Gordillo Guillén.
