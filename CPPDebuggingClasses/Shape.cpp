#include "headers/Shape.h"
#include <iostream>

Shape::Shape() {
	std::cout << "Shape constructed\n";
}
Shape::~Shape() {
	std::cout << "Shape destroyed\n";
}
void Shape::draw() {
	std::cout << "Drawing shape " << id << "\n";
}

float Shape::area() {
	return 888.4f;
}