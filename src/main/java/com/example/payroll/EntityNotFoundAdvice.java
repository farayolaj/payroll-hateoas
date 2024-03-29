package com.example.payroll;

import com.example.payroll.employee.EmployeeNotFoundException;
import com.example.payroll.order.OrderNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class EntityNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler({EmployeeNotFoundException.class, OrderNotFoundException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String employeeNotFoundHandler(RuntimeException ex) {
        return ex.getMessage();
    }
}
