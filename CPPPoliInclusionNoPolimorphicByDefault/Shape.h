#ifndef SHAPE_H
#define SHAPE_H

class Shape
{
public:
	void draw(); // Se supone la NO sobrescritura en clases derivadas
				 // virtual void draw(); // Se supone la POSIBLE sobrescritura en clases derivadas (no confundir con virtual puro, "= 0")
};

#endif