# Parcial Programación II 

---

##  Parte I – Teoría

### 1. Método que cambia el valor de un atributo
- **Respuesta:** `set`  
- Los métodos *setters* permiten modificar los atributos de un objeto, cambiando su estado.

---

### 2. Conclusión sobre modificadores de acceso
- **Respuesta correcta:** Cuando ejecuto la clase HijaMod1 **NO me mostrará el número 17 porque el modificador `protected` no permite visualizar en una clase heredada en otro paquete**.  

---

### 3. Qué es un constructor
- **Respuesta:** Un **método especial que inicializa los atributos de un objeto al crearlo**.  
- No retorna valor y tiene el mismo nombre de la clase.

---

### 4. Herencia con `private`  
*Si usted utiliza el modificador de acceso private en un método, este se puede heredar en otra clase.*  
- **Respuesta:** Falso   

---

### 5. Métodos con retorno y `void`  
*Si queremos crear un método con un valor de retorno debemos utilizar la palabra reservada “void”.*  
- **Respuesta:** Falso   

---

### 6. Modificadores de acceso y su importancia
- **Respuesta:**  
Los **modificadores de acceso** (`public`, `private`, `protected`) son palabras clave en Java que controlan el nivel de visibilidad de clases, atributos y métodos.  
Son importantes porque permiten:  
1. **Encapsulación:** proteger los datos internos de la clase.  
2. **Seguridad:** evitar accesos indebidos.  
3. **Organización:** definir qué partes del código se pueden usar desde fuera de la clase.  

---

##  Parte II – Implementación en Java

Se define la clase **Librito** con los siguientes elementos:

- **Atributos:** título, autor, número de ejemplares y número de ejemplares prestados.  
- **Constructores:** por defecto y con parámetros.  
- **Métodos getters/setters** para cada atributo.  
- **Método préstamo:** incrementa ejemplares prestados si hay disponibles.  
- **Método devolución:** reduce ejemplares prestados si existen en préstamo.  
- **Método `toString`:** imprime información del libro.  

