#include <stdio.h>

// Only have DECLARATIONS, no problem if included several times
#include "utils.h"
#include "utils.h"
#include "utils.h"

// The person.h header guard (#ifndef/define) is needed
// when defining 2 new types
#include "person.h"
#include "person.h"
#include "person.h"
#include "person.h"

// ./main user_name
int main(int argc, char **argv)
{

  printf("BEGIN\n");

  hello(argc == 1 ? "Maripili" : argv[1]);

  struct person p = {"Juan", 23, Male};

  printAge(&p);

  printf("END\n");

  return 0;
}