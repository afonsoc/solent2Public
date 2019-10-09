package org.solent.com504.factoryandfacade.model;

import org.solent.com504.factoryandfacade.model.FarmFacadeImpl;

public class AnimalObjectFactory{

    public static Animal createCat() {
        return new Cat();
    }

    public static Animal createDog() {
        return new Dog();
    }

    public static Animal createCow() {
        return new Cow();
    }
    
    public static Animal createGirrafe(){
        return new Girrafe();
    }

    public static FarmFacade createFarmFacade() {
        FarmFacade farmfacade = new FarmFacadeImpl();
        return new FarmFacadeImpl();
    }
}
