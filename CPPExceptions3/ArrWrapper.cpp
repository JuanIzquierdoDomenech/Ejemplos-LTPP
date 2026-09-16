#include <stdexcept>
#include <string>

#include "ArrWrapper.h"

ArrWrapper::~ArrWrapper()
{
	delete[] arr;
}

int ArrWrapper::get(int index)
{
	if (index < 0 || index >= this->length)
		throw std::out_of_range{"Index must be between 0 and " +
								std::to_string(length - 1)};
	return arr[index];
}