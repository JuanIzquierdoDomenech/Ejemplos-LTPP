#ifndef CPP_PLAYGROUND_MONSTER_H
#define CPP_PLAYGROUND_MONSTER_H

#include <string>

class Point; // Forward decl.

class Monster {
private:
	std::string name;
	Point *position;

public:
	Monster(std::string name);
	~Monster();

	void move(int dx, int dy);
	void print();
};

#endif // CPP_PLAYGROUND_MONSTER_H