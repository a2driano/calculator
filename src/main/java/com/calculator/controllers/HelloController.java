package com.calculator.controllers;

import com.calculator.model.CalcDTO;
import com.calculator.services.CalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version 1.0
 * @autor a2driano
 * @project: calculator
 * @since 23.02.2016
 */
@Controller
public class HelloController {

	@Autowired
	private CalcService calcService;

	@RequestMapping(value="/")
	public String start() {
		return "main";
	}

	@ResponseBody
	@RequestMapping(value="/calc", method = RequestMethod.POST)
	public CalcDTO calculate(@RequestBody CalcDTO calcDTO){
		CalcDTO calcDTOresult=calcService.calculate(calcDTO);
		return calcDTOresult;
	}
}