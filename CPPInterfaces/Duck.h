#ifndef CPP_INTERFACES_DUCK_H
#define CPP_INTERFACES_DUCK_H

#include <string>

#include "Flyable.h"
#include "Quackable.h"

class Duck : public Flyable, public Quackable {
private:
  std::string name;

public:
  Duck(std::string name) : name{name} {}

  void fly() override;
  void quack() override;
};

#endif // CPP_INTERFACES_DUCK_H