package com.codecademy.goldmedal.repositories;

import java.util.List;

public interface GoldMedalRepository extends CrudRepository<GoldMedal, Long> {

   List<GoldMedal> getByCountryOrderByYearAsc(String country);
   List<GoldMedal> getByCountryOrderByYearDesc(String country); 
   List<GoldMedal> getByCountryOrderBySeasonAsc(String country);
   List<GoldMedal> getByCountryOrderBySeasonDesc(String country);
   List<GoldMedal> getByCountryOrderByCityAsc(String country);
   List<GoldMedal> getByCountryOrderByCityDesc(String country);
   List<GoldMedal> getByCountryOrderByNameAsc(String country);
   List<GoldMedal> getByCountryOrderByNameDesc(String country);
   List<GoldMedal> getByCountryOrderByEventAsc(String country); 
   List<GoldMedal> getByCountryOrderByEventDesc(String country);

}