#include <cmath>
#include <iostream>

double calculateSqrt(double v);

int main()
{
	std::cout << "Enter a number: ";
	double x;
	std::cin >> x;

	try
	{
		double result = calculateSqrt(x); // Puede lanzar la excepción

		std::cout << "La raíz cuadrada de " << x << " es " << result << '\n';
	}
	catch (const char *exception)
	{
		// Maneja la excepción
		std::cerr << "Error: " << exception << '\n';
	}
	catch (...)
	{
		std::cout << "Catch all handler\n";
	}
}

// La función lanza una excepción, pero no se marca
double calculateSqrt(double v)
{
	if (v < 0.0)
		throw "sqrt de número negativo no posible!";
	// throw -1; // Capturado por el catch-all handler

	return sqrt(v);
}