#ifndef CPP_TESTS_BANKCLIENT_H
#define CPP_TESTS_BANKCLIENT_H

namespace bank {

// Dado que en el .h no accedemos a ningún aspecto de la definición, basta con
// hacer forward declaration (si no, habría que hacer un include)
class BankManager;

class BankClient {
private:
	double balance;

public:
	BankClient(double balance) : balance{balance} {} // Member initializer list
  
	double checkBalance();
	void makeDeposit(double amount);
	double drawMoney(double amount);

	friend class BankManager;
};
} // namespace bank

#endif // CPP_TESTS_BANKCLIENT_H
