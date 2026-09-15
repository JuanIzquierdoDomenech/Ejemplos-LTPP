#ifndef CPP_INHERITANCE_DERIVEDPROTECTED_H
#define CPP_INHERITANCE_DERIVEDPROTECTED_H

#include "Base.h"

class DerivedProtected : protected Base
{
public:
	DerivedProtected()
	{
		publicMember = 99;	   // public se convierte a protected
		protectedMember = 123; // Se hereda como protected
							   // privateMember = ERROR    // Es private a la superclase
	}
};

#endif // CPP_INHERITANCE_DERIVEDPROTECTED_H
