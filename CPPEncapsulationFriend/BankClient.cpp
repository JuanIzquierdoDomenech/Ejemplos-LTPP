#include "BankClient.h"

double bank::BankClient::checkBalance()
{
	return this->balance;
}

void bank::BankClient::makeDeposit(double amount)
{
	this->balance += amount;
}

double bank::BankClient::drawMoney(double amount)
{
	// No puedes sacar más de lo que tienes
	if (this->balance - amount > 0)
	{
		this->balance -= amount;
		return amount;
	}

	return 0;
}
