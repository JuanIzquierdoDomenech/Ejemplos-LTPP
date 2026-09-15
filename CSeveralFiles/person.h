#ifndef PERSON_H
#define PERSON_H

enum gender
{
  Male,
  Female
};

struct person
{
  char *name;
  int age;
  enum gender gen;
};

void printAge(struct person *p);

#endif