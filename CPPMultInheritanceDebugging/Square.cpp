#include <iostream>

#include "headers/Shape.h"
#include "headers/Square.h"

// Sobreescribimos el método de la clase Printable (Obligatorio)
void Square::print()
{
	std::cout << "Square\twith id: " << this << " printing\n";
}

// Sobreescribimos el método de la clase Shape (Opcional),
void Square::draw()
{
	Shape::draw(); // Podemos llamar al método definido en super
	std::cout << "Square\twith id: " << this << " drawing\n";
}

// pero no sobreescribimos Shape::area()
// float Square::area() {
//   return Shape::area() + 1;
// }