#include "Monster.h"
#include "Point.h" // Necessary since calling destructor explicitely (delete)
#include <iostream>

Monster::Monster(std::string name) {
	this->name = name;
	this->position = new Point(0, 0);
}

Monster::~Monster() {
	delete this->position;
	std::cout << "Se va a liberar la memoria de " << name << "<" << this
			  << ">\n";
}

void Monster::move(int dx, int dy) {
	this->position->move(dx, dy);
}

void Monster::print() {
	std::cout << name << " se encuentra en la posición "
			  << this->position->to_str() << "\n";
}