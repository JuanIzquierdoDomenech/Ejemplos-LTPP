#ifndef CPP_INHERITANCE_DERIVEDPUBLIC_H
#define CPP_INHERITANCE_DERIVEDPUBLIC_H

#include "Base.h"

class DerivedPublic : public Base
{
public:
	DerivedPublic()
	{
		publicMember = 99;	   // Se hereda como publico
		protectedMember = 123; // Se hereda como protected
							   // privateMember = ERROR    // Es private a la superclase
	}
};

#endif // CPP_INHERITANCE_DERIVEDPUBLIC_H
