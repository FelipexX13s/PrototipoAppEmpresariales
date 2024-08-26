# PrototipoAppEmpresariales
<div align= "center">
  <img src="https://github.com/user-attachments/assets/bda8ecaf-2e7c-4980-9b3e-cbf510d77332" alt="Logo del proyecto: Hombre sosteniendo un libro en tonos azules">
</div>

---

## Qué es
Consiste en un sistema de gestión de publicaciones que incluye libros y revistas, y permite crear, buscar, listar, eliminar y calcular los precios de cada uno.

---

## Model

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

### ServicioPublicaciones
Permite administrar los distintos tipos de publicaciones, `Libro` y `Revista`, realizando las acciones de agregar, buscar, listar, eliminar y calcular el precio total de cada tipo.

#### Atributos
+ **publicaciones:** Lista que contiene las respectivas publicaciones, separando la administración de cada subclase en distintos métodos.

#### Métodos
+ **calcularPrecioTotal**: Calcula el precio total de todas las publicaciones pertenecientes a una subclase en especifico.
##### Libro
+ **agregarLibro:** Crea un libro al recibir sus atributos como parámetros, verificando que el libro no exista previamente y manejando el ingreso de valores incorrectos.
+ **buscarLibro:** Busca un libro al recibir su nombre como parámetro, verificando que el libro exista.
+ **eliminarLibro:** Elimina un libro al recibir su nombre como parámetro, verificando que el libro exista.
+ **listarLibros:** Da una lista con los libros presentes en `publicaciones`.
##### Revista
+ **agregarRevista:** Crea una revista al recibir sus atributos como parámetros, verificando que la revista no exista previamente y manejando el ingreso de valores incorrectos.
+ **buscarRevista:** Busca una revista al recibir su nombre como parámetro, verificando que la revista exista.
+ **eliminarRevista:** Elimina una revista al recibir su nombre como parámetro, verificando que la revista exista.
+ **listarRevistas:** Da una lista con las revistas presentes en `publicaciones`.

---

### ServicioEditoriales
Permite administrar los dis, `Libro` y `Revista`, realizando las acciones de agregar, buscar, listar, eliminar y calcular el precio total de cada tipo.

#### Atributos
+ **editoriales:** Lista que contiene las respectivas editoriales.

#### Métodos
+ **agregarEditorial:** Crea una editorial al recibir sus atributos como parámetros, verificando que la editorial no exista previamente y manejando el ingreso de valores incorrectos.
+ **listarEditoriales:** Da la lista de `editoriales`.

---

## View

#### Gestor Publicaciones - Ventana principal

<div align= "center">
  <img src="https://github.com/user-attachments/assets/a562329b-06a9-4341-b6ce-88bafb36103a" alt="Ventana principal de gestor de publicaciones">
</div>

---

### Libro

---

#### Agregar Libro

<div align= "center">
  <img src="https://github.com/user-attachments/assets/e4e4da72-d28f-4214-86c8-2a62d7b1b702" alt="Ventana para agregar un libro">
</div>

#### Buscar Libro

<div align= "center">
  <img src="https://github.com/user-attachments/assets/d812aeae-174d-4f1d-bad8-8d8b3c754a95" alt="Ventana para buscar un libro">
</div>

#### Listar Libros

<div align= "center">
  <img src="https://github.com/user-attachments/assets/76d99cb7-e8fc-447b-9150-2a28bf27bda1" alt="Ventana para listar libros">
</div>

#### Eliminar Libro

<div align= "center">
  <img src="https://github.com/user-attachments/assets/12ccc4d7-c3d1-4958-9846-117ec9032241" alt="Ventana para eliminar un libro">
</div>

#### Calcular Precio Libros

<div align= "center">
  <img src="https://github.com/user-attachments/assets/7fce7538-6135-4ac5-ab3c-7d049e257644" alt="Ventana para calcular el precio total de los libros">
</div>

---

### Revista

---

#### Agregar Revista

<div align= "center">
  <img src="https://github.com/user-attachments/assets/17ea49f5-cd99-4104-b146-768cd68cf878" alt="Ventana para agregar una revista">
</div>

#### Buscar Revista

<div align= "center">
  <img src="https://github.com/user-attachments/assets/c56dff8f-ec44-40c1-b509-dd0abe0e4ab9" alt="Ventana para buscar una revista">
</div>

#### Listar Revistas

<div align= "center">
  <img src="https://github.com/user-attachments/assets/d2f5feed-c21a-421a-a23e-cbbbe9f78d66" alt="Ventana para listar revistas">
</div>

#### Eliminar Revista

<div align= "center">
  <img src="https://github.com/user-attachments/assets/b2275028-89a1-4ba9-8789-35a5b69482e8" alt="Ventana para eliminar una revista">
</div>

#### Calcular Precio Revistas

<div align= "center">
  <img src="https://github.com/user-attachments/assets/11c38893-8b8d-4a12-b52e-5ac041798103" alt="Ventana para calcular el precio total de las revistas">
</div>

---

### Editorial

---

#### Agregar Editorial

<div align= "center">
  <img src="https://github.com/user-attachments/assets/378281c4-033f-42c1-8266-477cd5983be2" alt="Ventana para agregar una editorial">
</div>

#### Listar Editoriales

<div align= "center">
  <img src="https://github.com/user-attachments/assets/356730b4-4ac8-4128-891f-c6c3648f1248" alt="Ventana para listar editoriales">
</div>

---

#### Acerca de

<div align= "center">
  <img src="https://github.com/user-attachments/assets/673c21a1-b29c-4e7f-82c6-9c1f0dd411d4" alt="Ventana con información acerca los desarrolladores, próposito y versión del proyecto">
</div>

---
