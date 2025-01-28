package com.yamlToProject.Contract.controller;

import com.yamlToProject.Contract.api.ApiUtil;
import com.yamlToProject.Contract.api.CustomerApi;
import com.yamlToProject.Contract.model.Customer;
import io.swagger.v3.oas.annotations.Parameter;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public class CustomerController implements CustomerApi {


    public ResponseEntity<Customer> newUser(
            @Parameter(name = "Customer", description = "", required = true) @Valid @RequestBody Customer customer
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"address\" : { \"country\" : \"country\", \"zipCode\" : \"zipCode\", \"city\" : \"city\", \"street\" : \"street\", \"state\" : \"state\" }, \"name\" : \"name\", \"nominee\" : { \"address\" : { \"country\" : \"country\", \"zipCode\" : \"zipCode\", \"city\" : \"city\", \"street\" : \"street\", \"state\" : \"state\" }, \"name\" : \"name\" }, \"accountNumber\" : \"accountNumber\", \"pan\" : \"pan\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
