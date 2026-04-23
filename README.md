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

### Troncal: Calle 26
| # | Estación |
|---|---|
| 1 | Portal El Dorado - C.C. Nuestro Bogotá |
| 2 | Modelia |
| 3 | Normandia |
| 4 | Avenida Rojas - UNISALESIANA |
| 5 | El Tiempo - Cámara de Comercio de Bogotá |
| 6 | Salitre - El Greco |
| 7 | CAN |
| 8 | Gobernación |
| 9 | Quinta Paredes |
| 10 | Corferias |
| 11 | Ciudad Universitaria - Lotería de Bogotá |
| 12 | Consejo de Bogotá |
| 13 | Centro Memoria |
| 14 | Universidades - CityU |

### Troncal: Eje Ambiental
| # | Estación |
|---|---|
| 1 | AV. Jiménez - CL 13 |
| 2 | Museo del Oro |
| 3 | Las Aguas - Centro Colombo Americano |

### Troncal: Caracas Sur
| # | Estación |
|---|---|
| 1 | Portal Tunal |
| 2 | Parque |
| 3 | Biblioteca |
| 4 | Portal Usme |
| 5 | Molinos |
| 6 | Consuelo |
| 7 | Socorro |
| 8 | Santa Lucia |
| 9 | Danubio |
| 10 | Calle 40 Sur |
| 11 | Quiroga |
| 12 | Olaya |
| 13 | Restrepo |
| 14 | Fucha |
| 15 | Nariño |
| 16 | Hortúa |
| 17 | Hospital |

### Troncal: Caracas
| # | Estación |
|---|---|
| 1 | Tercer Milenio |
| 2 | AV. Jiménez - Caracas |
| 3 | Temporal AV. Jiménez - Caracas |
| 4 | Calle 19 |
| 5 | Temporal Calle 22 |
| 6 | Calle 26 - Atrio |
| 7 | Temporal Calle 34 |
| 8 | AV. 39 |
| 9 | Temporal AV. 39 |
| 10 | Calle 45 - American School Way |
| 11 | Marly |
| 12 | Temporal Marly |
| 13 | Temporal Calle 57 |
| 14 | Calle 63 |
| 15 | Flores – Areandina |
| 16 | Calle 72 |
| 17 | Calle 76 - San Felipe |

### Troncal: NQS Sur
| # | Estación |
|---|---|
| 1 | Portal Sur - JFK Coop. Financiera |
| 2 | Perdomo |
| 3 | CC Paseo Villa del Rio - Madelena |
| 4 | Servillana |
| 5 | Venecia |
| 6 | Alquería |
| 7 | General Santander |
| 8 | NQS - Calle 38A S |
| 9 | NQS - Calle 30 S |
| 10 | SENA |
| 11 | Bosa |
| 12 | Comuneros |
| 13 | Santa Isabel |
| 14 | San Mateo - CC Unisanar |
| 15 | Terreros - Hospital Cardio Vascular |
| 16 | León XIII |
| 17 | La Despensa |

### Troncal: Autopista Norte
| # | Estación |
|---|---|
| 1 | Portal Norte – Unicervantes |
| 2 | Calle 187 |
| 3 | Toberin - Foundever |
| 4 | Calle 161 |
| 5 | Mazurén |
| 6 | Calle 146 |
| 7 | Calle 142 |
| 8 | Alcalá – Colegio S. Tomás Dominicos |
| 9 | Prado |
| 10 | Calle 127 |
| 11 | Pepe Sierra UTEL Universidad |
| 12 | Calle 106 - Maletas Explora |
| 13 | Calle 100 - Marketmedios |
| 14 | Virrey |
| 15 | Calle 85 |
| 16 | Héroes - Colmena Seguros |
| 17 | Terminal |

### Troncal: Américas
| # | Estación |
|---|---|
| 1 | Portal Américas |
| 2 | Patio Bonito |
| 3 | Biblioteca Tintal |
| 4 | Transversal 86 |
| 5 | Banderas |
| 6 | Mandalay |
| 7 | AV. Américas - AV. Boyacá |
| 8 | Marsella |
| 9 | Pradera - Plaza Central |
| 10 | Distrito Grafiti |
| 11 | Puente Aranda |
| 12 | Carrera 43 - Comapan |
| 13 | CDS - Carrera 32 |
| 14 | Ricaurte - CL 13 |
| 15 | San Facon Carrera 22 |
| 16 | Zona Industrial |
| 17 | De La Sabana |

### Troncal: NQS Central
| # | Estación |
|---|---|
| 1 | La Castellana |
| 2 | Calle 75 - Zona M |
| 3 | AV. Chile |
| 4 | 7 de Agosto |
| 5 | Movistar Arena |
| 6 | Campín - UAN |
| 7 | Universidad Nacional |
| 8 | AV. ElDorado |
| 9 | CAD |
| 10 | Paloquemao |
| 11 | Ricaurte - NQS |
| 12 | Tygua - San José |
| 13 | Guatoque - Veraguas |

### Troncal: Calle 80
| # | Estación |
|---|---|
| 1 | Portal 80 |
| 2 | Quirigua |
| 3 | Carrera 90 |
| 4 | AV. Cali |
| 5 | Granja - Kr 77 |
| 6 | Minuto de Dios |
| 7 | AV. Boyacá |
| 8 | Ferias |
| 9 | AV. 68 |
| 10 | Carrera 53 |
| 11 | Carrera 47 |
| 12 | Escuela Militar |
| 13 | Polo - FINCOMERCIO |

### Troncal: Suba
| # | Estación |
|---|---|
| 1 | Portal Suba |
| 2 | La Campiña |
| 3 | Suba - TV. 91 |
| 4 | 21 Ángeles |
| 5 | Gratamira |
| 6 | Suba - AV. Boyacá |
| 7 | Niza - Calle 127 |
| 8 | Humedal Córdoba |
| 9 | Suba - Calle 116 |
| 10 | Puentelargo |
| 11 | Suba - Calle 100 |
| 12 | Suba - Calle 95 |
| 13 | Rionegro |
| 14 | San Martín |

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
