#include <iostream>

#include "Circle.h"
#include "Shape.h"
#include "Square.h"

int main()
{
	Shape *shp1;
	shp1 = new Circle();

	shp1->draw(); // ¿qué dibuja?

	delete shp1;

	shp1 = new Square();
	shp1->draw(); // ¿qué dibuja?

	delete shp1;

	//////////
	std::cout << "------------------\n";

	Shape *shp2;

	Circle c;
	shp2 = &c;
	shp2->draw();

	Square s;
	shp2 = &s;
	shp2->draw();
}