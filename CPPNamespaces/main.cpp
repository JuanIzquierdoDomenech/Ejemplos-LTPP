#include "magic/spell.h" // Including files inside another folder, you can use the path
#include "myutils.h"
#include <iostream>

using std::cout;

int main()
{

	std::cout
		<< "El espacio de nombres desambigua a qué cout estamos accediendo\n";

	cout << "Si declaramos una variable con nombre cout, ocultaríamos este "
			"nombre...\n";

	// Tapa cout incluido desde std::cout
	// int cout = 99;

	/*myutils::Calculator *c = new myutils::Calculator{};
	int x = c->sub(30, 12);
	int y = c->sum(30, 12);
	delete c;*/

	myutils::Calculator c{};
	int x = c.sub(30, 12);
	int y = c.sum(30, 12);

	myutils::fff();

	magic::Spell expeliarmus{"Expeliarmus", 15.23f};
	std::cout << expeliarmus.name << " has a power of "
			  << std::to_string(expeliarmus.power) << "\n";
}