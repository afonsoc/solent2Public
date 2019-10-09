package org.solent.com504.factoryandfacade.test;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.solent.com504.factoryandfacade.model.Animal;
import org.solent.com504.factoryandfacade.model.AnimalObjectFactory;
import org.solent.com504.factoryandfacade.model.FarmFacade;

/**
 *
 * @author cgallen
 */
public class FarmFacadeTest {

    @Test
    public void FarmFacadeTest() {

        FarmFacade farmFacade = AnimalObjectFactory.createFarmFacade();
        assertNotNull(farmFacade);
       
        farmFacade.addDog("fido");
        farmFacade.addCat("cat");
        farmFacade.addCow("cow");
        farmFacade.addGirrafe("girrafe");
        
        List<Animal> animals=farmFacade.getAllAnimals();
        assertEquals(4,animals.size());
        
        
        // WHAT TESTS WOULD YOU CREATE HERE TO SET UP AND TEST THE FARM FACADE?

            /*public List<Animal> getAllAnimals();

            public void addDog(String name);

            public void addCat(String name);

            public void addCow(String name);*/
    }
}
