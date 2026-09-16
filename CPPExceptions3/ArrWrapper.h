#ifndef ARRWRAPPER_H
#define ARRWRAPPER_H

class ArrWrapper
{
private:
	int *arr;
	int length;

public:
	ArrWrapper(int length) : length{length}
	{
		arr = new int[length];
		for (int i = 0; i < length; ++i)
			arr[i] = i;
	};
	~ArrWrapper();

	int get(int index);
};

#endif