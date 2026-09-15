#ifndef SQUARE_H
#define SQUARE_H

#include "Shape.h"

class Square : public Shape
{
public:
	float size = 123;
	Square();
	~Square();
};

#endif