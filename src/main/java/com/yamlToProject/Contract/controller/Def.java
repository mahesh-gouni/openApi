//package com.yamlToProject.Contract.controller;
//
//import com.yamlToProject.Contract.api.ApiUtil;
//import com.yamlToProject.Contract.api.DefaultApi;
//import com.yamlToProject.Contract.model.ApiAccountGet200ResponseInner;
//import io.swagger.v3.oas.annotations.Operation;
//import io.swagger.v3.oas.annotations.Parameter;
//import io.swagger.v3.oas.annotations.enums.ParameterIn;
//import io.swagger.v3.oas.annotations.media.ArraySchema;
//import io.swagger.v3.oas.annotations.media.Content;
//import io.swagger.v3.oas.annotations.media.Schema;
//import io.swagger.v3.oas.annotations.responses.ApiResponse;
//import jakarta.validation.Valid;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.context.request.NativeWebRequest;
//
//import java.util.List;
//import java.util.Optional;
//
//public class Def implements DefaultApi {
//    public Optional<NativeWebRequest> getRequest() {
//        return Optional.empty();
//    }
//
//    /**
//     * GET /api/account : Get a list of accounts
//     * Retrieves a list of items based on the query parameters provided.
//     *
//     * @param limit The maximum number of accounts to return (optional)
//     * @param offset The number of accounts to skip before starting to collect the result set (optional)
//     * @param filter Filter condition to narrow down the results (optional)
//     * @return Successful response (status code 200)
//     */
//    @Operation(
//            operationId = "apiAccountGet",
//            summary = "Get a list of accounts",
//            description = "Retrieves a list of items based on the query parameters provided.",
//            responses = {
//                    @ApiResponse(responseCode = "200", description = "Successful response", content = {
//                            @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = ApiAccountGet200ResponseInner.class)))
//                    })
//            }
//    )
//    @RequestMapping(
//            method = RequestMethod.GET,
//            value = "/api/account",
//            produces = { "application/json" }
//    )
//
//    public ResponseEntity<List<ApiAccountGet200ResponseInner>> apiAccountGet(
//            @Parameter(name = "limit", description = "The maximum number of accounts to return", in = ParameterIn.QUERY) @Valid @RequestParam(value = "limit", required = false) Integer limit,
//            @Parameter(name = "offset", description = "The number of accounts to skip before starting to collect the result set", in = ParameterIn.QUERY) @Valid @RequestParam(value = "offset", required = false) Integer offset,
//            @Parameter(name = "filter", description = "Filter condition to narrow down the results", in = ParameterIn.QUERY) @Valid @RequestParam(value = "filter", required = false) String filter
//    ) {
//        getRequest().ifPresent(request -> {
//            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
//                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
//                    String exampleString = "[ { \"name\" : \"name\", \"id\" : 0, \"category\" : \"category\" }, { \"name\" : \"name\", \"id\" : 0, \"category\" : \"category\" } ]";
//                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
//                    break;
//                }
//            }
//        });
//        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
//
//    }
//}
