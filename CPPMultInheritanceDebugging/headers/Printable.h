#ifndef PRINTABLE_H
#define PRINTABLE_H

class Printable
{
public:
	int printVar;
	virtual void print() = 0; // Método virtual => Se ha de implementar obligatoriamente por clases hijas
							  // void print()           // Si no pusiéramos virtual, sería opcional sobreescribirlo desde las clases derivadas
};

#endif