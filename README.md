## 🧩 Diagrama de clases e Historias de usuario

```mermaid
classDiagram
    class Shape {
        <<interface>>
        +getName(): String
        +area(): double
        +perimeter(): double
        +draw(): void
    }

    class AbstractShape {
        <<abstract>>
        -name: String
        +getName(): String
        #validatePositive(values: double...)
    }

    class Circle {
        -radius: double
        +area(): double
        +perimeter(): double
        +draw(): void
    }

    class Rectangle {
        -width: double
        -height: double
        +area(): double
        +perimeter(): double
        +draw(): void
    }

    class Triangle {
        -a: double
        -b: double
        -c: double
        +area(): double
        +perimeter(): double
        +draw(): void
    }

    Shape <|.. AbstractShape
    AbstractShape <|-- Circle
    AbstractShape <|-- Rectangle
    AbstractShape <|-- Triangle





📘 Historias de usuario

👨‍🎓 Como estudiante, quiero crear figuras geométricas (círculo, rectángulo, triángulo) para calcular área y perímetro y reforzar POO.

💻 Como usuario, quiero visualizar en consola el resultado de cada figura.

👷 Como desarrollador, quiero validar los datos para evitar errores.

👨‍🏫 Como profesor, quiero revisar el diagrama de clases para verificar herencia y polimorfismo.

🧠 Como alumno, quiero poder agregar nuevas figuras sin modificar las existentes.
