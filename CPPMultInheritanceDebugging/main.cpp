#include <iostream>

#include "headers/Square.h"

int main()
{
	Square sq{};
	sq.draw();
	sq.print();
	std::cout << sq.area() << "\n";
}