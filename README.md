# TRANSMILENIO

**ESCUELA COLOMBIANA DE INGENIERÍA**  
**DESARROLLO ORIENTADO POR OBJETOS [DOPO-POOB]**  
**COLECCIONES Y PERSISTENCIA**  
**S13 - S15: 2026-1**

---

## Integrantes

- Daniel Alfredo Barrera Araque  
- Nicolás David Prieto Ramos  

---

## Descripción

Simulación del sistema de transporte masivo Transmilenio de Bogotá, modelando troncales, estaciones y rutas.

La información del sistema se basa en el [Mapa Digital de Transmilenio](https://mapadigital.transmilenio.gov.co/).

> **Nota:** La información de troncales y estaciones fue extraída de forma manual desde el mapa digital de Transmilenio, ya que no se dispone de una API pública oficial.

---

## Información del sistema

- **Sistema:** troncales y estaciones.
- **Troncales:** nombre, velocidad promedio (metros/minuto), estaciones y tramos con su distancia. Las troncales son lineales.
- **Rutas:** nombre y estaciones en las que para.
- **Estaciones:** nombre, nivel de ocupación (alto, medio, bajo) y tiempo de espera según ocupación (en minutos).

---

## Troncales y estaciones

### Calle 26
- Portal El Dorado - C.C. Nuestro Bogotá
- Modelia
- Normandia
- Avenida Rojas - UNISALESIANA
- El Tiempo - Cámara de Comercio de Bogotá
- Salitre - El Greco
- CAN
- Gobernación
- Quinta Paredes
- Corferias
- Ciudad Universitaria - Lotería de Bogotá
- Consejo de Bogotá
- Centro Memoria
- Universidades - CityU

### Eje Ambiental
- AV. Jiménez - CL 13
- Museo del Oro
- Las Aguas - Centro Colombo Americano

### Caracas Sur
- Portal Tunal
- Parque
- Biblioteca
- Portal Usme
- Molinos
- Consuelo
- Socorro
- Santa Lucia
- Danubio
- Calle 40 Sur
- Quiroga
- Olaya
- Restrepo
- Fucha
- Nariño
- Hortúa
- Hospital

### Caracas
- Tercer Milenio
- AV. Jiménez - Caracas
- Temporal AV. Jiménez - Caracas
- Calle 19
- Temporal Calle 22
- Calle 26 - Atrio
- Temporal Calle 34
- AV. 39
- Temporal AV. 39
- Calle 45 - American School Way
- Marly
- Temporal Marly
- Temporal Calle 57
- Calle 63
- Flores – Areandina
- Calle 72
- Calle 76 - San Felipe

### NQS Sur
- Portal Sur - JFK Coop. Financiera
- Perdomo
- CC Paseo Villa del Rio - Madelena
- Servillana
- Venecia
- Alquería
- General Santander
- NQS - Calle 38A S
- NQS - Calle 30 S
- SENA
- Bosa
- Comuneros
- Santa Isabel
- San Mateo - CC Unisanar
- Terreros - Hospital Cardio Vascular
- León XIII
- La Despensa

### Autopista Norte
- Portal Norte – Unicervantes
- Calle 187
- Toberin - Foundever
- Calle 161
- Mazurén
- Calle 146
- Calle 142
- Alcalá – Colegio S. Tomás Dominicos
- Prado
- Calle 127
- Pepe Sierra UTEL Universidad
- Calle 106 - Maletas Explora
- Calle 100 - Marketmedios
- Virrey
- Calle 85
- Héroes - Colmena Seguros
- Terminal

### Américas
- Portal Américas
- Patio Bonito
- Biblioteca Tintal
- Transversal 86
- Banderas
- Mandalay
- AV. Américas - AV. Boyacá
- Marsella
- Pradera - Plaza Central
- Distrito Grafiti
- Puente Aranda
- Carrera 43 - Comapan
- CDS - Carrera 32
- Ricaurte - CL 13
- San Facon Carrera 22
- Zona Industrial
- De La Sabana

### NQS Central
- La Castellana
- Calle 75 - Zona M
- AV. Chile
- 7 de Agosto
- Movistar Arena
- Campín - UAN
- Universidad Nacional
- AV. ElDorado
- CAD
- Paloquemao
- Ricaurte - NQS
- Tygua - San José
- Guatoque - Veraguas

### Calle 80
- Portal 80
- Quirigua
- Carrera 90
- AV. Cali
- Granja - Kr 77
- Minuto de Dios
- AV. Boyacá
- Ferias
- AV. 68
- Carrera 53
- Carrera 47
- Escuela Militar
- Polo - FINCOMERCIO

### Suba
- Portal Suba
- La Campiña
- Suba - TV. 91
- 21 Ángeles
- Gratamira
- Suba - AV. Boyacá
- Niza - Calle 127
- Humedal Córdoba
- Suba - Calle 116
- Puentelargo
- Suba - Calle 100
- Suba - Calle 95
- Rionegro
- San Martín

---

## Servicios implementados

### Punto 1 — Tiempo de espera de una estación
**Entrada:** nombre de la estación  
**Salida:** tiempo de espera en minutos según el nivel de ocupación (alto, medio, bajo)

### Punto 2 — Rutas del sistema ordenadas alfabéticamente
**Entrada:** ninguna  
**Salida:** lista de nombres de todas las rutas ordenadas alfabéticamente

### Punto 4 — Rutas sin transbordo entre dos estaciones
**Entrada:** nombre de estación origen y destino  
**Salida:** rutas que conectan ambas estaciones sin transbordo, ordenadas de menor a mayor por número de paradas y alfabéticamente por nombre en caso de empate

---

## Estructura del proyecto
