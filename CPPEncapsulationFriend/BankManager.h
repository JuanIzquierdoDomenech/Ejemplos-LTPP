#ifndef CPP_TESTS_BANKMANAGER_H
#define CPP_TESTS_BANKMANAGER_H

namespace bank
{

	// Dado que en el .h no accedemos a ningún aspecto de la definición, basta con
	// hacer forward declaration
	class BankClient; // Forward declaration para poder utilizarla en el .h

	class BankManager
	{
	private:
		double balance;

	public:
		BankManager(double balance) : balance{balance} {}

		void stealMoney(BankClient &client); // Paso por referencia (nuevo en C++ !!!)
		double checkBalance();
	};

} // namespace bank

#endif // CPP_TESTS_BANKMANAGER_H