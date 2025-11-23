# 📚 JavaLearning1

Repositorio de aprendizaje y práctica de **Java** enfocado en estructuras de datos, programación básica y manejo de archivos.

## 🎯 Objetivo

Este repositorio documenta mi progreso aprendiendo Java, desde conceptos básicos hasta la implementación de estructuras de datos avanzadas como listas enlazadas, pilas y manejo de archivos.

## 📂 Estructura del Proyecto

### 🚀 **Fundamentos de Java**
Ejercicios básicos para dominar la sintaxis y conceptos fundamentales:

| Archivo | Descripción | Conceptos |
|---------|-------------|-----------|
| `HolaMundo.java` | Primer programa en Java | Sintaxis básica, System.out.println |
| `HolaMundoPersonalizado.java` | Métodos y parámetros | Métodos estáticos, parámetros String |
| `InputData.java` | Entrada de datos del usuario | Scanner, tipos de datos |
| `SumaNumeros.java` | Operaciones matemáticas | Aritmética básica, variables |
| `Condiciones.java` | Estructuras condicionales | if-else, operadores lógicos |
| `Menu.java` | Menús interactivos | Switch-case, bucles |
| `MenuBucle.java` | Menús con repetición | While, do-while |
| `Repite.java` | Estructuras de repetición | For, while, bucles anidados |
| `ParametrosArgumentos.java` | Argumentos de línea de comandos | args[], String[] |

### 📊 **Arrays y Colecciones**

| Archivo | Descripción | Conceptos |
|---------|-------------|-----------|
| `EjercicioArreglos.java` | Práctica con arrays | Arrays, índices, recorridos |

### 🔗 **Estructuras de Datos Lineales**

#### **Listas Enlazadas Simples** (`ListasLigadas/`)
Implementación completa de listas enlazadas:
- **`Nodo.java`**: Clase nodo con datos enteros
- **`ListaSimple.java`**: Lista enlazada con operaciones básicas
  - ✅ Insertar nodos
  - ✅ Mostrar lista completa
  - ✅ Eliminar por dato específico
- **`SistemaListas.java`**: Sistema de pruebas y demostración

#### **Listas Doblemente Enlazadas** (`ListaDoble/`)
Navegación bidireccional:
- **`NodoD.java`**: Nodo con enlaces anterior y siguiente
- **`ListaDoble.java`**: Lista con navegación en ambas direcciones
  - ✅ Insertar nodos al inicio
  - ✅ Iterar hacia la derecha (inicio → fin)
  - ✅ Iterar hacia la izquierda (fin → inicio)
  - ✅ Eliminar por dato específico

#### **Pilas Dinámicas** (`PilaDinamica/`)
Implementación de Stack (LIFO):
- **`Nodo.java`**: Nodo específico para pila
- **`Pila.java`**: Estructura LIFO completa
  - ✅ `push()` - Apilar elementos
  - ✅ `pop()` - Desapilar elementos  
  - ✅ `peek()` - Ver tope sin desapilar
  - ✅ `mostrarPila()` - Listar todos los elementos
  - ✅ `estaVacia()` - Verificar estado

### 🎓 **Sistema de Gestión de Alumnos** (`ProyectoListas/`)
Proyecto integrador que combina estructuras de datos con persistencia:

| Archivo | Descripción | Funcionalidad |
|---------|-------------|---------------|
| `Alumno.java` | Modelo de datos | Clase con ID, nombre, apellidos, correo |
| `Nodo.java` | Nodo para objetos Alumno | Enlace específico para alumnos |
| `ListaSimple.java` | Lista de alumnos | Gestión de colección de estudiantes |
| `ManejarArchivos.java` | Persistencia de datos | Guardar/cargar desde archivos de texto |
| `SistemaAlumnos.java` | Sistema principal | Interfaz y lógica de negocio |
| `ListaAlumnos.txt` | Archivo de datos | Almacenamiento persistente |

### 📁 **Manejo de Archivos** (`Archivos/`)
- **`ManejarArchivos.java`**: Operaciones de E/S con archivos

### 🏃‍♂️ **Actividades y Ejercicios**
- **`Actividad1.java`**: Ejercicios de práctica nivel básico
- **`Actividad2.java`**: Ejercicios de práctica nivel intermedio  
- **`Actividad3.java`**: Ejercicios de práctica nivel avanzado

## 🚀 Cómo Ejecutar

### Requisitos Previos
- **Java JDK 21** o superior
- Editor de código (VS Code recomendado)
- Terminal/Línea de comandos

### Ejecutar Programas Básicos
```bash
# Compilar
javac HolaMundo.java

# Ejecutar
java HolaMundo
```

### Ejecutar Proyectos con Paquetes
```bash
# Desde la raíz del proyecto
javac ProyectoListas/*.java
java ProyectoListas.SistemaAlumnos
```

## 📖 Conceptos Aprendidos

### **Programación Orientada a Objetos**
- ✅ Clases y objetos
- ✅ Encapsulación
- ✅ Constructores
- ✅ Métodos estáticos

### **Estructuras de Datos**
- ✅ Arrays estáticos
- ✅ Listas enlazadas simples
- ✅ Listas doblemente enlazadas
- ✅ Pilas (Stacks) - LIFO
- ✅ Nodos y punteros

### **Algoritmos y Complejidad**
- ✅ Inserción O(1)
- ✅ Búsqueda O(n) 
- ✅ Recorridos lineales
- ✅ Eliminación por criterio

### **Manejo de Archivos**
- ✅ Lectura de archivos (`BufferedReader`)
- ✅ Escritura de archivos (`BufferedWriter`)
- ✅ Manejo de excepciones (`IOException`)
- ✅ Parsing de datos

### **Buenas Prácticas**
- ✅ Manejo de excepciones
- ✅ Validación de datos
- ✅ Código limpio y comentado
- ✅ Separación de responsabilidades

## 🎯 Próximos Objetivos

### **Estructuras de Datos**
- [ ] Colas (Queues) - FIFO
- [ ] Árboles binarios
- [ ] Hash Tables
- [ ] Grafos básicos

### **Algoritmos**
- [ ] Ordenamiento (Bubble, Selection, Insertion)
- [ ] Búsqueda binaria
- [ ] Algoritmos recursivos

### **Conceptos Avanzados**
- [ ] Genéricos (Generics)
- [ ] Interfaces y herencia
- [ ] Colecciones de Java (ArrayList, LinkedList)
- [ ] Streams y lambda expressions

## 📊 Progreso del Aprendizaje

```
Fundamentos de Java     ████████████████████ 100%
Arrays y Estructuras    ████████████████████ 100%
Listas Enlazadas       ████████████████████ 100%
Pilas y Colas          ████████████████░░░░ 80%
Árboles y Grafos       ████░░░░░░░░░░░░░░░░ 20%
Manejo de Archivos     ████████████████████ 100%
```

## 🛠️ Herramientas Utilizadas

- **IDE**: Visual Studio Code
- **JDK**: Java Development Kit 21
- **Control de versiones**: Git
- **Sistema operativo**: Windows

## 📝 Notas

Este repositorio representa mi viaje de aprendizaje en Java, desde "Hola Mundo" hasta la implementación de estructuras de datos complejas. Cada proyecto está diseñado para reforzar conceptos específicos y construir sobre el conocimiento previo.

---

⭐ **¡Si este repositorio te ayuda en tu aprendizaje de Java, dale una estrella!** ⭐

📧 **Contacto**: Para preguntas o sugerencias sobre los ejercicios.

---
*Última actualización: Noviembre 2025*