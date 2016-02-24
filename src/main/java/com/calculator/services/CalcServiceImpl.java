package com.calculator.services;

import com.calculator.model.CalcDTO;
import org.springframework.stereotype.Service;

/**
 * @version 1.0
 * @autor a2driano
 * @project: calculator
 * @since 23.02.2016
 */
@Service
public class CalcServiceImpl implements com.calculator.services.CalcService {
    @Override
    public CalcDTO calculate(CalcDTO calcDTO) {
        CalcDTO calcDTOresult=new CalcDTO();

        switch (calcDTO.getOperation()) {
            case "+":
                calcDTOresult.setResult(calcDTO.getFirstdigit()+calcDTO.getSecondigit());
                break;
            case "-":
                calcDTOresult.setResult(calcDTO.getFirstdigit()-calcDTO.getSecondigit());
                break;
            case "*":
                calcDTOresult.setResult(calcDTO.getFirstdigit()*calcDTO.getSecondigit());
                break;
            case "/":
                if(calcDTO.getSecondigit()!=0){
                    calcDTOresult.setResult(calcDTO.getFirstdigit()/calcDTO.getSecondigit());
                }else {
                    calcDTOresult.setMessage("You can not divide by zero");
                }
                break;
        }
        return calcDTOresult;


    }
}
