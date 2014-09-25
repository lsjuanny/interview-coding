#include <iostream>
#include <string>
class Thing
{
	public:
		Thing(){std::cout<<"Thing constructor"<<std::endl;}
		virtual void what_Am_I( ) {std::cout << "I am a Thing.\n";}
		//! void what_Am_I( ) {std::cout << "I am a Thing.\n";}
		//! virtual void what_Am_I( ) =0;
		~Thing(){std::cout<<"Thing destructor"<<std::endl;}
};

class Animal : public Thing
{
	public:
		Animal(){std::cout<<"Animal constructor"<<std::endl;}
		//! virtual void what_Am_I( ) {std::cout << "I am an Animal.\n";}
		void what_Am_I( ) {
			std::cout << "I am an Animal.\n";
		}
		~Animal(){std::cout<<"Animal destructor"<<std::endl;}
};
int main( )
{
   Thing t ;
   Animal x ;
   Thing* array[2];
   array[0] = &t;
   array[1] = &x;       
   for (int i=0; i<2; i++) array[i]->what_Am_I( ) ;
   return 0;
}