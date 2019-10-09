/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.solent.com504.factoryandfacade.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 3marqa74
 */
public class FarmFacadeImpl implements FarmFacade {
    
    private List <Animal> animals = new ArrayList();
    
    @Override
    public List<Animal> getAllAnimals() {
        return animals;
                
    }
    

    @Override
    public void addDog(String name) {
        
        Animal dog = AnimalObjectFactory.createDog();
        dog.setName(name);
        animals.add(dog);
        
    }

    @Override
    public void addCat(String name) {
        
        Animal cat = AnimalObjectFactory.createCat();
        cat.setName(name);
        animals.add(cat);
        
    }

    @Override
    public void addCow(String name) {
        
        Animal cow = AnimalObjectFactory.createCow();
        cow.setName(name);
        animals.add(cow);
        
    }
    
    @Override
    public void addGirrafe(String name){
        
        Animal girrafe = AnimalObjectFactory.createGirrafe();
        girrafe.setName(name);
        animals.add(girrafe);
        
    }
    
}
