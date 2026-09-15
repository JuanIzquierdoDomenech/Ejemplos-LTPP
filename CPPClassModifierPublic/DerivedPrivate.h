#ifndef CPP_INHERITANCE_DERIVEDPRIVATE_H
#define CPP_INHERITANCE_DERIVEDPRIVATE_H

#include "Base.h"

class DerivedPrivate : private Base
{
public:
	DerivedPrivate()
	{
		publicMember = 99;	   // public se convierte a private
		protectedMember = 123; // protected se convierte a private
							   // privateMember = ERROR       // Se hereda como private
	}
};

#endif // CPP_INHERITANCE_DERIVEDPRIVATE_H
