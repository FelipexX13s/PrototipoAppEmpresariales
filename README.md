# PrototipoAppEmpresariales
<div align= "center">
  <img src="https://github.com/user-attachments/assets/bda8ecaf-2e7c-4980-9b3e-cbf510d77332" alt="Logo del proyecto: Hombre sosteniendo un libro en tonos azules">
</div>

---

## Qué es
Consiste en un sistema de gestión de publicaciones que incluye libros y revistas, y permite crear, buscar, listar, eliminar y calcular los precios de cada uno.

---

## Model

---

### Publicacion - clase abstracta
Representa una publicación genérica dentro del sistema, lo que implica que no puede ser instanciada directamente.

#### Atributos
+ **titulo:** Representa el título de la publicación, que actúa como un identificador único e irrepetible dentro de cada subclase de esta.
+ **autor:** Representa el autor de la publicación.
+ **precio:** Representa el precio de la publicación, el cálculo de este varia en cada subclase.

#### Restricciones de atributos
+ **titulo y autor:** La cadena debe contener algún texto, es decir, no puede estar vacía ni estar conformada únicamente por espacios en blanco.
+ **precio:** Se estableció un precio mínimo de 50 COP, por lo que no se acepta ningún precio menor a este.

#### Métodos
+ **Publicacion - Constructor:** Permite ingresar los valores de los atributos por parámetro y verifica que sus valores estén dentro de lo establecido.
+ **calcularPrecio:** Método abstracto cuya función es calcular el precio correspondiente en las clases heredadas según sus condiciones.

---

### Libro - clase concreta
Representa un libro dentro del sistema, la cual hereda de `Publicacion`.

#### Atributos
+ **publicacion:** Hereda los atributos respectivos de la superclase con sus respectivas restricciones. 
+ **tapaDura:** Contiene un valor que indica si el libro tiene tapa dura o no.
+ **editorial:** Representa la editorial respectiva relacionada al libro.
+ **COSTO_TAPA_DURA:** Constante que representa el valor adicional al precio original si el libro tiene tapa dura.

#### Restricciones de atributos
+ **editorial:** Todo libro debe tener una editorial asociada, por lo que su valor no puede ser nulo.

#### Métodos
+ **Libro - Constructor:** Permite crear un libro ingresando los valores de los atributos, incluyendo los heredados, por parámetro y verifica que sus valores estén dentro de lo establecido.
+ **calcularPrecio:** Sobreescribe el método de la superclase `Libro` añadiendo el valor de `COSTO_TAPA_DURA` al precio original en base al estado del atributo `tapaDura`.

---

### Revista - clase concreta
Representa una revista dentro del sistema, la cual hereda de `Publicacion` en implementa la interfaz `Suscribible`.

#### Atributos
+ **publicacion:** Hereda los atributos respectivos de la superclase con sus respectivas restricciones.
+ **volumen:** Representa el volumen de la revista.
+ **suscrito:** Contiene un valor que indica si se está suscrito a la revista o no.
+ **PORCENTAJE_DESCUENTO_SUSCRIPCION:** Constante que representa el valor porcentual descontado al precio original si se está suscrito a la revista.

#### Restricciones de atributos
+ **volumen:** El volumen no puede ser menor a 1 y debe solo contener valores enteros.

#### Métodos
+ **Revista - Constructor:** Permite crear una revista ingresando los valores de los atributos, incluyendo los heredados, por parámetro y verifica que sus valores estén dentro de lo establecido.
+ **calcularPrecio:** Sobreescribe el método de la superclase Libro descontando el valor resultante en base a `PORCENTAJE_DESCUENTO_SUSCRIPCION` al precio original en base al estado del atributo `suscrito`.
+ **suscribirse, cancelarSuscripcion y estaSuscrito:** Métodos provenientes de la interfaz Suscribible que permiten modificar y visualzar el estado de la suscripción (`suscrito`) de la revista.

---

### Editorial - clase concreta
Representa una editorial dentro del sistema, ligada a la clase Libro.

#### Atributos
+ **nombre:** Representa el nombre de la editorial.
+ **dirección:** Representa la dirección física de la editorial.

#### Restricciones de atributos
+ **nombre y direccion:** La cadena debe contener algún texto, es decir, no puede estar vacía ni estar conformada únicamente por espacios en blanco.

#### Métodos
+ **Editorial - Constructor:** Permite crear una editorial ingresando los valores de los atributos por parámetro y verifica que sus valores estén dentro de lo establecido.

---

### Suscribible - interfaz
Representa la capacidad de mirar el estado de suscripción, suscribirse y desuscribirse a un objeto de la clase `Revista`.

#### Métodos abstractos
+ suscribirse
+ cancelarSuscripcion
+ estaSuscrito

---

## Services

---

### ServicioPublicaciones
Permite administrar los distintos tipos de publicaciones, `Libro` y `Revista`, realizando acciones como agregar, buscar, listar, eliminar y calcular el precio total de cada tipo.

#### Atributos
+ **publicaciones:** Lista que contiene las respectivas publicaciones con el fin de administrarlas.

#### Métodos
