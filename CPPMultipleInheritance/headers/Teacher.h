#ifndef CPP_INHERITANCE_TEACHER_H
#define CPP_INHERITANCE_TEACHER_H

#include "Employee.h"
#include "Person.h"

class Teacher : public Person, public Employee {
public:
	int age = 30;
	void printData();  // Sobreescribimos, pero cuál?
};

#endif // CPP_INHERITANCE_TEACHER_H