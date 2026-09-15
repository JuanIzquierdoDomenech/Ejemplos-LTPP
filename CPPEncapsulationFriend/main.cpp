#include "BankClient.h"
#include "BankManager.h"
#include <iostream>

int main()
{
	bank::BankClient me{999.0};
	bank::BankManager myManager{100.0};

	std::cout << "No soy millonario, tengo " << me.checkBalance() << " Euros\n";
	me.makeDeposit(300.0);
	std::cout << "Tras el ingreso, tengo " << me.checkBalance() << " Euros\n";

	myManager.stealMoney(me);
	std::cout << "Tras el robo, tengo " << me.checkBalance() << " Euros :_(\n";
	std::cout << "Y mi gestor tiene " << myManager.checkBalance()
			  << " Euros :D\n";

	return 0;
}