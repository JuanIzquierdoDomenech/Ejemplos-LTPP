#ifndef CPP_PLAYGROUND_POINT_H
#define CPP_PLAYGROUND_POINT_H

#include <string>

class Point {
private:
	int x;
	int y;

public:
	Point(int x, int y) : x{x}, y{y} {}
	~Point();

	void move(int x, int y);
	std::string to_str();
};

#endif // CPP_PLAYGROUND_POINT_H