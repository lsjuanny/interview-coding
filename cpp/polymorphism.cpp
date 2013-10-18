#include <iostream.h>
#include <string.h>
class Thing
{
public:
Thing(){cout<<"Thing constructor"<<endl;}
virtual void what_Am_I( ) {cout << "I am a Thing.\n";}
~Thing(){cout<<"Thing destructor"<<endl;}
};
class Animal : public Thing
{
public:
Animal(){cout<<"Animal constructor"<<endl;}
virtual void what_Am_I( ) {cout << "I am an Animal.\n";}
~Animal(){cout<<"Animal destructor"<<endl;}
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