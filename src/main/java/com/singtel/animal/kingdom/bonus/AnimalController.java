package com.singtel.animal.kingdom.bonus;


import java.util.List;

//@RestController
public class AnimalController {


   // @RequestMapping(value = "/getAllAnimals", method=RequestMethod.GET)
    public List<Animal> getAllAnimals() {
        return TestSecE.animals;
    }
}
