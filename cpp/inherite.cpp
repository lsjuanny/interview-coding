#include <iostream>
class Base
{
private:
        int b_number;
public:
        Base( ){ 
                //std::cout << "Constructor base" <<std::endl; 
        }
        Base(int i) : b_number (i) { 
                //std::cout << "Constructor base with i = " << i << std::endl; 
        }
        int get_number( ) {return b_number;}
        void print( ) {std::cout << b_number << std::endl;} 
        ~Base() {
                //std::cout << "Deconstructor base" <<std::endl;
        }      
};
 
class Derived : public Base
{
private:
        int d_number;
public:
// constructor, initializer used to initialize the base part of a Derived object.
        Derived( int i, int j ) : Base(i), d_number(j) { 
                //std::cout << "Constructor derived with i = " << i << ", j = " << j <<std::endl;
        };       
        // a new member function that overrides the print( ) function in Base
        void print( )
        {
                std::cout << get_number( ) << " ";       
                // access number through get_number( )
                std::cout << d_number << std::endl;
        }

        ~Derived() {
                //std::cout << "Deconstructor derived" <<std::endl;
        }  
};
int main( )
{
        Base a(2);
        Derived b(3, 4);
        std::cout << "a is ";
        a.print( );                
        std::cout << "b is ";
        b.print( );                
        std::cout << "base part of b is ";
        b.Base::print( );                
        return 0;
}