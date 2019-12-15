/**
 * Demo driver for the library
 *
 * This belongs to the default package.
 */

import libPackage.*;

class MainDemoOfLib{
    public static void main(String []args){
	String text=Library.someLibraryMethod();
	System.out.println(text);
    }
}