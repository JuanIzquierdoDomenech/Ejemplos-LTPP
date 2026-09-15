#include <iostream>

#include "Duck.h"

void Duck::fly() { std::cout << this->name << " can fly!\n"; }

void Duck::quack() { std::cout << this->name << " says: Quaaaack quaaaack!\n"; }