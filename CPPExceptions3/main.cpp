#include <exception>
#include <iostream>
#include <string>

#include "ArrWrapper.h"

int main()
{
	// Ejemplo 1

	int *myarray = nullptr;
	try
	{
		int *myarray = new int[100000000000000000];
	}
	catch (const std::bad_alloc &exc)
	{
		std::cerr << "Excepción bad alloc: " << exc.what() << '\n';
	}
	catch (const std::exception &exc)
	{
		std::cerr << "Excepción estándar: " << exc.what() << '\n';
	}

	if (myarray)
		delete myarray;

	// Ejemplo 2

	ArrWrapper myWrapper{10};
	try
	{
		std::cout << myWrapper.get(5) << "\n";
		std::cout << myWrapper.get(15) << "\n";
	}
	catch (const std::out_of_range &exc)
	{
		std::cout << exc.what() << "\n";
	}

	std::cout << "<< Fin del programa >>\n";
}