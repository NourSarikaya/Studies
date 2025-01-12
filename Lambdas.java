
public class Lambdas{
	public static void main(String[] args){
    Cat myCat= new Cat();
    myCat.print(); //we can do this

    //OR

    printThing(myCat); //Calling method on Printable thing
    }

    static void printThing(Printable thing){
	thing.print();
    }
}
