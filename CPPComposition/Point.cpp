#include "Point.h"
#include <iostream>
#include <string>

Point::~Point() {
	std::cout << "Se va a liberar la memoria de " << to_str() << "<" << this << ">\n";
}

void Point::move(int x, int y) {
	this->x += x;
	this->y += y;
}

std::string Point::to_str() {
	return "x: " + std::to_string(x) + " y: " + std::to_string(y);
}