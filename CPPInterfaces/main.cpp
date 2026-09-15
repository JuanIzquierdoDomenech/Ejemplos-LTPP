#include <iostream>

#include "Duck.h"
// #include "Flyable.h"

int main() {
  Duck *donald = new Duck{"Donald"};
  donald->fly();
  donald->quack();

  // Flyable *f = donald;  // Más adelante, polimorfismo de inclusión
  // f->fly();

  Duck lucas{"Lucas"};
  lucas.fly();
  lucas.quack();

  // Quackable *q = &lucas;
  // q->quack();

  lucas = *donald;
  lucas.fly();

  delete donald;

  std::cout << "Bye bye, World!" << std::endl;

  return 0;
}