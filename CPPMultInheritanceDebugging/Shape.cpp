#include "headers/Shape.h"
#include <iostream>

void Shape::draw()
{
	std::cout << "Shape\twith id: " << this << " drawing\n";
}

float Shape::area()
{
	return 888.4f;
}