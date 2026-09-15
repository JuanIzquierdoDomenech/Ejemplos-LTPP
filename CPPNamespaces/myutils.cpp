#include "myutils.h"
#include <iostream>

void myutils::fff()
{
	std::cout << "fff\n";
}

int myutils::Calculator::sum(int a, int b)
{
	std::cout << "SUM: " << this << "\n";
	return a + b;
}

int myutils::Calculator::sub(int a, int b)
{
	std::cout << "SUB: " << this << "\n";
	return a - b;
}