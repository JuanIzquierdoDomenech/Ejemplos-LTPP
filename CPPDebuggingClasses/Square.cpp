#include "headers/Square.h"
#include <iostream>

Square::Square()
{
	Shape::id = 44;
	std::cout << "Square constructed\n";
}
Square::~Square()
{
	std::cout << "Square destroyed\n";
}
