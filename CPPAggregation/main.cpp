#include "Address.h"
#include "Employee.h"
#include <iostream>

int main() {
	Address addr{"Plaza Ferrandiz y Carbonell S/N", "Alcoy"};

	{
    Employee emp{"Pedro Pedro Pe", addr}; 
  }

	std::cout << "Dirección todavía existe: " << addr.street << "\n";

	return 0;
}