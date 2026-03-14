# SISTEMA DE GESTIÓN DE SOLICITUDES TI

## Información del Equipo:
* **Número de Grupo:** 7.
* **Nombre del Equipo:** Mounstruos de la computación.
* **Intergrantes:**
  * Fernanda Tais Ramos Curay.
  * Fernando Ariel Medina Aguilar.
  * Jose Armando Palacios Diaz.

## Información del Proyecto:
* **Versión de JDK:** 21.
* **Pruebas en Postman:** https://1drv.ms/f/c/06d49ddfd45f579b/IgC4ojGQL2W3R67Dl-XWJfL7AXBkjpMY77dFqgJRa9EPE5o?e=44KWAq

## ¿Cómo Usar el Sistema?
1. Clonar el repositorio.
2. Ejecutar el siguiente comando en la carpeta raíz del proyecto -> mvnw.cmd clean install
3. Luego ejecutar -> mvnw.cmd spring-boot:run

## Flujo del Sistema:

                ┌───────────────┐
                │    CLIENTE    │
                │  (Postman)    │
                └───────┬───────┘
                        │
                        │ HTTP Request (JSON)
                        ▼
               ┌──────────────────┐
               │   Controller     │
               │ SolicitudController
               └────────┬─────────┘
                        │
                        │ convierte JSON → DTO
                        ▼
               ┌──────────────────┐
               │       DTO        │
               │   SolicitudDto   │
               │ (validaciones)   │
               └────────┬─────────┘
                        │
                        │ pasa datos al servicio
                        ▼
               ┌──────────────────┐
               │      Service     │
               │  SolicitudService│
               │ lógica de negocio│
               └────────┬─────────┘
                        │
                        │ crea Entity
                        ▼
               ┌──────────────────┐
               │      Entity      │
               │    Solicitud     │
               │  modelo dominio  │
               └────────┬─────────┘
                        │
                        │ guarda datos
                        ▼
               ┌──────────────────┐
               │    Repository    │
               │ SolicitudRepository
               │ acceso a datos   │
               └────────┬─────────┘
                        │
                        │ almacenamiento
                        ▼
               ┌──────────────────┐
               │   HashMap / DB   │
               │ (simulación DB)  │
               └──────────────────┘