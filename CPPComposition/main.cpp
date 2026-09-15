#include "Monster.h"
#include <iostream>

int main() {
	Monster *m1 = new Monster{"Basilisco"};

	m1->print();

	m1->move(20, 35);

	m1->print();

	{
		Monster m2{"Sauce boxeador"};

		m2.print();

		m2.move(20, 35);

		m2.print();
	} // Dtor. implicitely called, automatic memory

	delete m1;

	std::cout << "Fin del programa\n";
}