#include <iostream>

class MyException
{
private:
	std::string what;

public:
	MyException(std::string what) : what{what}
	{
	}
	std::string whatHappened()
	{
		return what;
	}
};

int main()
{
	// throw -1; // Si no la manejamos, finaliza la ejecución de forma anormal

	// Basic exceptions
	try
	{
		std::cout << "--- Código peligroso ---\n";

		// throw -1;
		// throw "OMG, una excepción!";
		// throw MyException {"Excepción Total"};

		std::cout << "Ninguna excepción\n";
	}
	catch (int code)
	{
		std::cerr << "Ha habido una excepción con código numérico " << code
				  << "\n";
	}
	catch (char const *msg)
	{
		std::cerr << "Ha habido una excepción con mensaje " << msg << "\n";
	}
	catch (MyException exp)
	{
		std::cerr << "Ha habido una excepción: " << exp.whatHappened() << "\n";
	}

	std::cout << "Fin del programa\n";

	return 0;
}