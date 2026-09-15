#ifndef SQUARE_H
#define SQUARE_H

#include "Printable.h"
#include "Shape.h"

class Square : public Shape, public Printable
{
public:
	int squareVar;

	void print() override; // Estamos obligados a sobreescribirla, Printable::print
	void draw();		   // Sobreesccribimos Shape::draw
						   // float area();          // No sobreescribimos Shape::area
};

#endif