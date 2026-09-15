#ifndef CPP_PLAYGROUND_ADDRESS_H
#define CPP_PLAYGROUND_ADDRESS_H

#include <string>

class Address
{
public:
	std::string street;
	std::string city;

	Address(std::string street, std::string city) : street{street}, city{city} {}
};

#endif // CPP_PLAYGROUND_ADDRESS_H