#ifndef CPP_TESTS_CLIENTACCOUNT_H
#define CPP_TESTS_CLIENTACCOUNT_H

#include "BankAccount.h"

class ClientAccount
    : public BankAccount { // Heredamos de la clase abstracta BankAccount

public:
  ClientAccount(double balance) : BankAccount(balance){};

  // Métodos que sobreescribe esta clase derivada
  double getBalance() override;
  void setBalance(double balance) override;
};

#endif // CPP_TESTS_CLIENTACCOUNT_H