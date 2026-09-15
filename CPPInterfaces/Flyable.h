#ifndef CPP_INTERFACES_FLYABLE_H
#define CPP_INTERFACES_FLYABLE_H

// Clase abstracta pura
class Flyable
{
public:
  virtual ~Flyable() =
      default; // Por norma general, siempre añadimos (polimorfismo)
  virtual void fly() = 0;
};

#endif // CPP_INTERFACES_FLYABLE_H