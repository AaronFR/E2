# Possible Future Features
- finish factory mechanics
    - automatic sell policy
    - automatic buy policy
- ability to construct mines (re-factor 'goods' to 'raw_materials')
- regexs
- automatically name buildings intelligently
    - allow renaming
- ability to construct vehicle (repair ship)
    list crashed ship location in destinations
- automate vehicle along selected route
- Gameplay mechanics of developing cities
- Ability to fly to faraway lands on the planet.



## 1.0.0 Java Implementation
- Complete re-factoring for Java

## 0.3.1 Re-factoring GUI and implementation
- GUI re-factored


## 0.3.0 Total OOP Restructuring and running through GUI
- Everything is now a class
- Utilities class implemented to handle text_input/output to and from the GUI
    run by any and all classes that could send/receive information from the GUI
- Created (messily) working GUI that can access any function
- Implemented Folders to better structure project


## 0.2.0 Class Restructuring and Usable Factories
- Refactoring of code especially trade_game main script, all classes now look 
    after themselves where appropriate
- basic inheritance: super class 'Economic_unit' for shared code.
- More input crashes fixed.
- Factories require cash and resources to run daily
- Factories(Farms) can now be interacted with, produce extracted, necessary 
    resources deposited


## 0.1.1 Basic Factories
- added building menu, hidden till sufficiently wealthy.
- added building class, can build farm given sufficient resources
- building included in update statement and will update own inventory with 
    its production, which is modified by the city it is within.
- players are assigned buildings upon construction as are the cities they are
    built within


## 0.1.0 Complete Trade Update
- complete re-factoring of main script
    classes implemented
    individual class scripts added for world, trader, town
- trading refined can only sell stock you have, can only but stock the town has
- cities redesigned to all be of the same population and to have certain attributes
    their production being set to a baseline and properties modifing thus
- exponential consumption model, driving towns to their equilibriums
    already agri towns can maintain levels of production, while mining towns
    rapidly devolve into starvation
- TDD implemented (though limited in utility in some scenarios)


## 0.0.0 Basic Trade
- ability to describe towns including name, population and description
- ability to travel between towns
- ability to trade (though selling items the player doesn't have is possible)
- text based interaction
- price calculator exponential scaling through supply and demand
    prices will gradually increase max as stock goes to zero
- can purchase any number of items at once