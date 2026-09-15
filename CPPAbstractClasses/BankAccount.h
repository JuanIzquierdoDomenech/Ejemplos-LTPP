#ifndef CPP_TESTS_BANKACCOUNT_H
#define CPP_TESTS_BANKACCOUNT_H

class BankAccount
{
protected:
  double balance;

public:
  BankAccount(double balance)
      : balance{balance} {} // Constructores no pueden ser virtuales

  // Métodos virtuales puros => Clase Abstracta => Han de ser sobreescritos por
  // las clases derivadas
  virtual double getBalance() = 0;
  virtual void setBalance(double balance) = 0;

  virtual ~BankAccount() = default;
  // Por regla general, si ponemos un método virtual en una clase padre, haz el destructor virtual (polimorfismo)
};

#endif // CPP_TESTS_BANKACCOUNT_H