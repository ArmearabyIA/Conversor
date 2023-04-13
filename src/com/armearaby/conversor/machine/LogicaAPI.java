package com.armearaby.conversor.machine;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



public interface LogicaAPI {

    LocalDate actualDate = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
    String fechaFormateada = actualDate.format(formatter);


}
