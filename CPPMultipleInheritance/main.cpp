#include <iostream>

#include "headers/Teacher.h"

int main()
{
	Teacher superTeacher = Teacher();
	int tAge = superTeacher.age;
	superTeacher.age = 33; // Cual de todos estamos modificando? Ver foto

	superTeacher.printData();
	superTeacher.Person::printData();
	superTeacher.Employee::printData();

	return 0;
}