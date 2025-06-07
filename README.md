# 🧠 Ejercicios de Lógica de Programación – Nivel Intermedio en Java

Este documento contiene 10 ejercicios diseñados para desarrollar habilidades en el manejo de **ciclos y condicionales en Java**, sin utilizar arreglos, métodos, objetos ni estructuras avanzadas.

---

## ✅ Instrucciones de trabajo

Sigue estos pasos para resolver y entregar los ejercicios:

1. **Forkea este repositorio** a tu cuenta personal de GitHub.
2. **Clona tu repositorio forkeado**: en tu computador
3. **Crea una nueva rama con tu nombre completo**: Por ejemplo: git checkout -b JaimeAlbertoZapataValencia
4. **Desarrolla el ejercicio en un archivo .java**: Crear un nuevo archivo que se llame como el ejercicio que seleccione
5. **Haz commit y push de tus cambios**: git add ., git commit -m "Resuelto ejercicio 01: Simulador de recarga de celular", git push origin tu rama

## 📋 Lista de Ejercicios

### 1. 📱 Simulador de Recarga de Celular
Diseña un programa que permita al usuario recargar saldo a su celular. El sistema debe iniciar con saldo `$0` y mostrar un menú:

- Recargar saldo (ingresa valor positivo)
- Consultar saldo actual
- Salir

Si intenta recargar un valor negativo o cero, se debe mostrar un mensaje de error. El menú debe repetirse hasta que el usuario salga.

---

### 2. 🅿️ Simulador de Parqueadero
Crea un sistema que simule la entrada y salida de vehículos en un parqueadero con **10 cupos**. El sistema debe mostrar un menú:

- Ingresar vehículo (si hay cupo)
- Retirar vehículo (libera un cupo)
- Consultar cupos disponibles
- Salir

Solo se debe usar un contador para controlar los cupos ocupados. El menú se repite hasta que el usuario seleccione salir.

---

### 3. ☕ Cafetería Virtual
Simula una cafetería donde el usuario puede pedir productos del menú:

- Café ($3000)
- Jugo ($4000)
- Galleta ($2000)
- Terminar pedido

Cada vez que elige un producto, se suma su valor al total. Al finalizar el pedido, se muestra el total a pagar. No se deben usar listas ni arreglos, solo acumuladores.

---

### 4. 🗳️ Simulador de Votación Estudiantil
Tres candidatos compiten por la presidencia del grupo. El programa permite votar ingresando el número del candidato (1, 2 o 3). El proceso termina cuando se ingresa `0`.

Al finalizar, se debe mostrar:

- Total de votos por cada candidato
- El ganador
- Si hubo empate, debe indicarse

---

### 5. 🎯 Sistema de Puntos por Compras
El usuario comienza con 0 puntos. Por cada compra superior a `$10000`, acumula **1 punto por cada $10000** gastados.

El sistema muestra un menú:

- Realizar compra
- Consultar puntos acumulados
- Salir

Se deben validar que los valores de compra sean positivos. El sistema se repite hasta que el usuario decida salir.

---

### 6. 🚿 Simulador de Tanque de Agua
El tanque tiene una capacidad máxima de **1000 litros**. El usuario puede simular llenarlo agregando litros.

El sistema muestra un menú:

- Agregar litros
- Ver cantidad actual
- Vaciar tanque
- Salir

No se deben permitir cargas negativas ni sobrepasar el límite. Se debe validar cada ingreso.

---

### 7. 📚 Simulador de Préstamo de Libros
El usuario puede tener **hasta 5 libros prestados** al mismo tiempo.

El menú debe incluir:

- Prestar libro
- Devolver libro
- Consultar libros prestados
- Salir

Si ya prestó 5 libros, no debe poder prestar más. Si no hay libros prestados, no se puede devolver.

---

### 8. 🛒 Carrito de Supermercado – Resumen de Compras
El usuario ingresa productos uno por uno. Por cada producto debe ingresar su precio. El proceso se repite hasta que se ingrese un precio de `0`.

Al finalizar, el sistema debe mostrar:

- Cantidad total de productos ingresados
- Total a pagar

No se deben usar arreglos ni estructuras de almacenamiento complejas. Solo acumuladores.

---

### 9. 🎉 Control de Acceso a Fiesta
Solo pueden ingresar personas mayores de 18 años. El sistema debe pedir la edad de cada persona, y el proceso finaliza cuando se ingrese `-1`.

Al final, el sistema debe mostrar:

- Total de personas que ingresaron
- Total de personas rechazadas
- La edad más alta registrada

---

### 10. 🐷 Simulador de Ahorro por Metas
El usuario define una **meta de ahorro**, por ejemplo `$50000`. Luego, cada día puede ingresar cuánto desea ahorrar.

El proceso se repite hasta que se alcance o supere la meta.

Al final, mostrar:

- Total ahorrado
- Número de días (intentos) necesarios

---

> Todos estos ejercicios deben resolverse únicamente con **ciclos y condicionales**. Se prohíbe el uso de objetos, métodos, arreglos, clases externas o librerías no nativas de Java.
