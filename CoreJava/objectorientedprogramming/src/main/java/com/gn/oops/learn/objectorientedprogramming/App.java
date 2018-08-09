package com.gn.oops.learn.objectorientedprogramming;

import com.gn.oops.learn.objectorientedprogramming.abstractvsinterface.ChildClass;
import com.gn.oops.learn.objectorientedprogramming.abstractvsinterface.InterfaceExtension;


public class App 
{
    public static void main( String[] args )
    {
    	
    /*	
    	ChildExtendingAbstractClass sampleClass = new ChildExtendingAbstractClass();
        sampleClass.implementationMethod();
        sampleClass.abstractMethod();
        
        ChildExtendingSuperClass childclass = new ChildExtendingSuperClass();
        childclass.implementationMethod();
        childclass.parentMethod();
        
        Superclass parentclass = new ChildExtendingSuperClass();
        parentclass.parentMethod();
        
     */
    	
        InterfaceExtension sampleclass = new ChildClass();
        sampleclass.defaultMethod("teja");
        
        ChildClass childclas = new ChildClass();
        childclas.defaultMethod("hello");
        childclas.publicMethod();
        childclas.abstractMethod();
        
    }
}
