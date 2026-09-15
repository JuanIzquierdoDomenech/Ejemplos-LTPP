#include "BankClient.h" // Necesario, pues accedemos a detalles de definición de BankClient
#include "BankManager.h"

// Paso por referencia (nuevo en C++ !!!) Fíjate en la sintaxis!!
void bank::BankManager::stealMoney(bank::BankClient &client) { 
	this->balance += client.balance;	// No usa el método drawMoney...
	client.balance = 0;
}

double bank::BankManager::checkBalance() {
	return this->balance;
}
