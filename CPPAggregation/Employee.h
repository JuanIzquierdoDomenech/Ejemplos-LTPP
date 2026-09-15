#ifndef CPP_PLAYGROUND_EMPLOYEE_H
#define CPP_PLAYGROUND_EMPLOYEE_H

#include <string>

class Address; // Forward decl.

class Employee {
private:
	std::string name;
	Address &address;

public:
	Employee(std::string name, Address &address)
		: name{name}, address{address} {};
};

#endif // CPP_PLAYGROUND_EMPLOYEE_H
