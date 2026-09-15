#include "headers/Circle.h"
#include <iostream>

Circle::Circle()
{
	Shape::id = 99; // Accessing 'super' member
	std::cout << "Circle constructed\n";
}
Circle::~Circle()
{
	std::cout << "Circle destroyed\n";
}