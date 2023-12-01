# PROYECTO FINAL MICROSERVICIOS AGENCIA DE VIAJES
Proyecto final del Master Java de la empresa Viewnext utilizando el Framework Spring Boot.

Este proyecto es una Rest API desarrollada en Spring Boot y ha sido creado como parte de la "formación Java". Esta API permite consta
de 3 microservicios conectados a una misma base de datos.

## TECNOLOGIAS USADAS.
1. Spring Boot
2. Java
3. JpaRepository
4. SQL
5. Maven

## CONFIGURACION DEL PROYECTO.
Para este proyecto asegurate de tener instalado Java y Maven en el sistema antes de ejecutar el proyecto.
1. Clona el repositorio:
  git cone https://github.com/daniehgordi/Proyecto-Final-Microservicios.git
2. Ejecuta el proyecto y conecta los microservicios a los servidores.
3. Usalo a través de Postman.

## USO DE LA API.
### HOTEL:
#### listaHoteles(): 
  Crea una lista de los hoteles.
    GET http://localhost:8080/hoteles
#### devuelveHotel(String nombreHotel):  
  Devuelve el hotel que le pases como parámetro en la url.
    GET http://localhost:8080/hoteles/lebreros
#### crearHotel(Hotel hotel): 
  Crea un hotel nuevo.
    POST http://localhost:8080/hoteles

### VUELOS:
#### vuelosDisponibles(int plazasAReservar): 
  Te devuelve una lista con los vuelos disponibles para las plazas a reservar.
    GET http://localhost:9090/vuelos/20
#### actualizarVuelo(int idVuelo,int actualizacionPlazas): 
  Actualiza para un vuelo las plazas a reservar.
    PUT http://localhost:9090/vuelos/2?50
#### listaVuelos(): 
  Saca una lista de vuelos.
    GET http://localhost:9090/vuelos
#### crearVuelo(Vuelo vuelo): 
  Creas un vuelo nuevo.
    POST http://localhost:9090

### RESERVAS:
#### crearReserva(Reserva reserva): 
  Crea una reserva.
    GET http://localhost:9090/reservas
#### dameLista(): 
  Te devuelve un listado de todas las reservas.
    GET http://localhost:9090/reservas
#### reservasExistentes(String nombreHotel): 
  Dandole el nombre del hotel devuelve una lista con las reservas de este.
    GET http://localhost:9090/reservas/lebreros
    
Este proyecto esta realizado por Daniel Gordillo Guillén.
