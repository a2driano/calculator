package com.calculator.services;

import com.calculator.model.CalcDTO;

/**
 * @version 1.0
 * @autor a2driano
 * @project: calculator
 * @since 23.02.2016
 */
public interface CalcService {
    /**
     * This method return calclate resunt to view
     * @param calcDTO
     * @return
     */
    CalcDTO calculate(CalcDTO calcDTO);
}
