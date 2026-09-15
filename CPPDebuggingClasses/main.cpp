#include "headers/Circle.h"
#include "headers/Shape.h"
#include "headers/Square.h"
#include <iostream>

int main()
{
	Shape s = Shape();
	s.draw();

	Circle c = Circle();
	c.draw(); // Reaprovechamos sin redefinir

	Square sq = Square();
	sq.draw();

	std::cout << "Circle radius: " << c.radius << "\n";
	std::cout << "Square size: " << sq.size << "\n";

	return 0;
}