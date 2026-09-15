#ifndef SHAPE_H
#define SHAPE_H

class Shape {
protected:
	int id = 0;

public:
	Shape();
	~Shape();
	void draw();
	float area();
};

#endif