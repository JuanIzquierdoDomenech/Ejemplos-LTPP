#include <stdio.h>

#include "person.h"

void printAge(struct person *p)
{
  printf("%s is %d years old\n", p->name, p->age);
}