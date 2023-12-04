
# TP Spring Boot SQLite 📘

Proyecto Spring Boot de ejemplo para el curso DESARROLLADOR JAVA INTERMEDIO en el marco de Argentina Programa 4.0 donde se utiliza SQLite como base de datos

## Ejecutar de forma local 	📁

Clonar el projecto

```bash
  git clone https://github.com/ScenturionZ/SpringBootSQLite.git
```

Instalar las dependencias del pom.xml

```maven
  mvn clean install
```

Ejecutar el servidor con maven

```bash
  mvn spring-boot:run
```


## API Reference 📮

#### Listar clientes 📖

```http
  GET localhost:8080/clientes
```

#### Crear un cliente 💾

```http
  POST localhost:8080/clientes
```
JSON a enviar
```json
{
  "razonSocial": "Test",
  "mail": "Tests@gmail.com",
  "cuit": "20987654325"
}
```

#### Actualizar un cliente 📝

```http
  PUT localhost:8080/clientes/id
```

| Parameter | Type      | Description                    |
| :-------- | :-------  | :----------------------------- |
| `id`      | `Integer` | **Required**. ID de la persona |

#### Eliminar un cliente ⛔

```http
  DELETE localhost:8080/clientes/id
```

| Parameter | Type      | Description                    |
| :-------- | :-------  | :----------------------------- |
| `id`      | `Integer` | **Required**. ID de la persona |

## Paginas utilizadas 🔗

- [Spring Initializr](https://start.spring.io/)
- [Thymeleaf](https://www.thymeleaf.org/)

