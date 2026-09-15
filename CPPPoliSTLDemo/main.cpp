#include <array>
#include <deque>
#include <map>
#include <set>
#include <vector>
#include <iostream>

int main()
{
	// std::array is a container that encapsulates fixed size arrays
	// https://en.cppreference.com/w/cpp/container/array
	std::array<int, 10> intArr{};
	intArr.at(0) = 20;

	// std::vector is a sequence container that encapsulates dynamic size arrays
	// https://en.cppreference.com/w/cpp/container/vector
	std::vector<std::string> stringVect{"hola", "adios", "muy buenas"};

	// std::deque (double-ended queue) is an indexed sequence container that
	// allows fast insertion and deletion at both its beginning and its end. In
	// addition, insertion and deletion at either end of a deque never
	// invalidates pointers or references to the rest of the elements
	// https://en.cppreference.com/w/cpp/container/deque
	std::deque<double> doubDe{};
	doubDe.push_back(20.3);
	doubDe.push_front(49.3);

	// std::set is an associative container that contains a sorted set of unique
	// objects of type Key https://en.cppreference.com/w/cpp/container/set
	std::set<char> charSet{};
	charSet.insert('A');
	charSet.insert('B');
	charSet.insert('C');

	// std::map is a sorted associative container that contains key-value pairs
	// with unique keys https://en.cppreference.com/w/cpp/container/map
	std::map<int, std::string> myMap{};
	myMap.insert(std::pair<int, std::string>(0, "aserejé"));
	myMap.insert(std::pair<int, std::string>(1, "aserejé"));
	myMap.insert(std::pair<int, std::string>(2, "dejé"));

	return 0;
}