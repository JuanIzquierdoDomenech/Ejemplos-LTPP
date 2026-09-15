#include "BankAccount.h"
#include "ClientAccount.h"
#include <iostream>
#include <memory>

int main()
{
  ClientAccount *cc1 = new ClientAccount{0};
  cc1->setBalance(1200.5);
  std::cout << "Mi cuenta bancaria tiene " << cc1->getBalance() << " Euretes\n";
  delete cc1;

  ClientAccount cc2{0};
  cc2.setBalance(3400.8);
  std::cout << "Tu cuenta bancaria tiene " << cc2.getBalance() << " Euretes\n";

  // BankAccount bc{2}; // error: variable type 'BankAccount' is an abstract class

  // But we can do this... and automatically released
  // std::unique_ptr<BankAccount> anotherClient =
  //     std::make_unique<ClientAccount>(100.0);
  // anotherClient->setBalance(999.0);
  // std::cout << "La cuenta bancaria de otro tiene "
  //           << anotherClient->getBalance() << " Euretes\n";

  return 0;
}