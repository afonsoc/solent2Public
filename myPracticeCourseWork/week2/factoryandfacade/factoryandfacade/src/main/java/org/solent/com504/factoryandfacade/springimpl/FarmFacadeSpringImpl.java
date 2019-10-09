/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.solent.com504.factoryandfacade.springimpl;

import java.util.ArrayList;
import java.util.List;
import org.solent.com504.factoryandfacade.model.Animal;
import org.solent.com504.factoryandfacade.model.FarmFacade;

/**
 *
 * @author cgallen
 */
public class FarmFacadeSpringImpl implements FarmFacade {
    
    private List <Animal> animals = new ArrayList();
    
    @Override
    public List<Animal> getAllAnimals() {
        return animals;
                
    }
    
    
     @Override
    public void addDog(String name) {
        
        Animal dog = AnimalObjectFactorySpringImpl.createDog();
        dog.setName(name);
        animals.add(dog);
        
    }

    @Override
    public void addCat(String name) {
        
        Animal cat = AnimalObjectFactorySpringImpl.createCat();
        cat.setName(name);
        animals.add(cat);
        
    }

    @Override
    public void addCow(String name) {
        
        Animal cow = AnimalObjectFactorySpringImpl.createCow();
        cow.setName(name);
        animals.add(cow);
        
    }
    
    @Override
    public void addGirrafe(String name){
        
        Animal girrafe = AnimalObjectFactorySpringImpl.createGirrafe();
        girrafe.setName(name);
        animals.add(girrafe);
        
    }
    
}
