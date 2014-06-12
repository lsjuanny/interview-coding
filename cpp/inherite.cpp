#include <iostream.h>
class Base
{
private:
        int b_number;
public:
        Base( ){ 
                //cout << "Constructor base" <<endl; 
        }
        Base(int i) : b_number (i) { 
                //cout << "Constructor base with i = " << i << endl; 
        }
        int get_number( ) {return b_number;}
        void print( ) {cout << b_number << endl;} 
        ~Base() {
                //cout << "Deconstructor base" <<endl;
        }      
};
 
class Derived : public Base
{
private:
        int d_number;
public:
// constructor, initializer used to initialize the base part of a Derived object.
        Derived( int i, int j ) : Base(i), d_number(j) { 
                //cout << "Constructor derived with i = " << i << ", j = " << j <<endl;
        };       
        // a new member function that overrides the print( ) function in Base
        void print( )
        {
                cout << get_number( ) << " ";       
                // access number through get_number( )
                cout << d_number << endl;
        }

        ~Derived() {
                //cout << "Deconstructor derived" <<endl;
        }  
};
int main( )
{
        Base a(2);
        Derived b(3, 4);
        cout << "a is ";
        a.print( );                
        cout << "b is ";
        b.print( );                
        cout << "base part of b is ";
        b.Base::print( );                
        return 0;
}