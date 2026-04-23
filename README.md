# TRANSMILENIO

**ESCUELA COLOMBIANA DE INGENIERIA**  
**DESARROLLO ORIENTADO POR OBJETOS [DOPO-POOB]**  
**COLECCIONES Y PERSISTENCIA**  
**S13 - S15: 2026-1**

---

## Integrantes

- Daniel Alfredo Barrera Araque  
- Nicolas David Prieto Ramos  

---

## Descripcion

Este es un desarolo inical de los puntos 1,2 y 4 del taller de trasmilenio

La informacion del sistema se basa en el [Mapa Digital de Transmilenio](https://mapadigital.transmilenio.gov.co/).

**Nota 1:** La informacion de troncales y estaciones fue extraida de forma manual desde el mapa digital de Transmilenio, ya que no se dispone de una API publica oficial

**Nota 2:** Excluimos dos troncales la L y la M porque son rutas de Sitp y no propias e los buses articulados y biarticulados de trasmilenio

**Nota 3**: Los datos estan en el archivo txt llamado DatosDeTrasmilenio


---

## Informacion del sistema

- **Sistema:** troncales y estaciones.
- **Troncales:** Nombre
- **Rutas:** nombre y estaciones en las que para.
- **Estaciones:** nombre, nivel de ocupacion (alto, medio, bajo) y tiempo de espera segun ocupacion (en minutos).


## Servicios implementados

### Punto 1 — Tiempo de espera de una estacion
**Entrada:** nombre de la estacion  
**Salida:** tiempo de espera en minutos, Se colocaron tiempos aleatorios que son numero enteros entre 5 y 35 porque no se conoce realmente estos datos ya quie transmilenio lo los hace publicos.

### Punto 2 — Rutas del sistema ordenadas alfabeticamente
**Entrada:** El numero 2 para que ejecute el segundo punto 
**Salida:** lista de nombres de todas las rutas ordenadas alfabeticamente

### Punto 4 — Rutas sin transbordo entre dos estaciones (A medio implementar)
**Entrada:** El numero 3 (Por practicidad el 3 en vez de el 4) y luego se espera dos parametros la estacion de origen y la estacion de destino
**Salida:** "rutas que conectan ambas estaciones sin transbordo" porque como es bastante infromacion no alcanzamos a migrar todas las rutas de trasmilenio que esxisten porque son mas de 100 y cada una contiene la informacion de que estacion para, entonces por el momento la logica solo verifica si estan dentro de la misma troncal las dos estaciones y si hay o no hay rutas directas
