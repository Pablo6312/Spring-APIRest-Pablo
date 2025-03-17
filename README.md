# API Rest con SpringBoot con las funcionalidades básicas CRUD para la gestión de las entidades: Clientes, Artículos y Compras

Este proyecto es una API Rest desarrollada en Spring Boot que permite gestionar las entidades Cliente, Articulo y Compra. La API proporciona operaciones CRUD (Crear, Leer, Actualizar, Eliminar) para cada una de estas entidades, así como la capacidad de realizar compras asociando clientes y artículos.

## Requisitos
- Java 17 (o superior).
- Maven (para la gestión de dependencias).
- MySQL.
- Postman (para probar los endpoints).

## Configuración
1. Clona el repositorio (en este caso a Eclipse IDE)
2. Crea la base de datos en local: api_rest_db_pablo (o cambiala a la que tu quieras desde  
`/sping-api-rest-pablo/src/main/resources/application.propertiies`  
en la linea `spring.datasource.url=jdbc:mysql://localhost:3306/api_rest_db_pablo`)  
2.1. Las tablas se crearan solas mediante hibernate  
2.2. Además hay un fichero `import.sql` que rellenara un poco la base de datos para poder manejarla directamente.  
3. Inicia el proyecto como `Spring Boot App` y ya estará la API funcionando.  
4. Ahora podras usarla tanto en tu navegador favorito en `http://localhost:8080/api` o en Postman si lo prefieres.  
5. Mediante los endpoints que se encuentran en la API podrás hacer las diferentes funcionalidades básicas CRUD que mencione al principio.
