#ifndef CPP_INTERFACES_QUACKABLE_H
#define CPP_INTERFACES_QUACKABLE_H

// Clase abstracta pura
class Quackable
{
public:
  virtual ~Quackable() =
      default; // Por norma general, siempre añadimos (polimorfismo)
  virtual void quack() = 0;
};

#endif // CPP_INTERFACES_QUACKABLE_H