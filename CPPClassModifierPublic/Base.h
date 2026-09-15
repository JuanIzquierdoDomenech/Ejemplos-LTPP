#ifndef CPP_INHERITANCE_BASE_H
#define CPP_INHERITANCE_BASE_H

class Base
{
public:
	int publicMember; // Accesible por todos
protected:
	int protectedMember; // Accesible desde clase y subclases
private:
	int privateMember; // Accesible solo desde clase
};

#endif // CPP_INHERITANCE_BASE_H
