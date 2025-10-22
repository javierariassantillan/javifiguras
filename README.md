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






