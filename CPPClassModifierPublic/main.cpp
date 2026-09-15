#include <iostream>

#include "DerivedPrivate.h"
#include "DerivedProtected.h"
#include "DerivedPublic.h"

int main()
{
	DerivedPublic dpu;
	dpu.publicMember = 99; // public OK
	// dpu.protectedMember = 33;    // protected ERROR desde aquí, OK desde
	// subclase dpu.privateMember = 123;     // private ERROR

	DerivedProtected dpr;
	// dpr.publicMember = 99;       // public se convierte en protected => ERROR
	// dpr.protectedMember = 33;    // protected ERROR
	// dpr.privateMember = 123;     // private ERROR

	DerivedPrivate dpri;
	// dpri.publicMember = 99;       // public se convierte en private => ERROR
	// dpri.protectedMember = 33;    // protected se convierte en private =>
	// ERROR dpri.privateMember = 123;     // private ERROR

	std::cout << "Fin" << std::endl;
	return 0;
}