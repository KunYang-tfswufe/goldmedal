package com.codecademy.goldmedal.controller;

import javax.swing.text.html.Option;

public interface CountryRepository extends CrudRepository<Country, Long> {
    Optional<Country> findByName(String name);
    
    
}