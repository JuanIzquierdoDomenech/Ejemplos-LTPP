#ifndef CIRCLE_H
#define CIRCLE_H

#include "Shape.h"

class Circle : public Shape {
public:
	float radius = 10;
	Circle();
	~Circle();
};

#endif