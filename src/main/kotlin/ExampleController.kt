package ru.golubtsov

import io.swagger.v3.oas.annotations.Operation
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/springdoc-example")
@Suppress("UNUSED")
class ExampleController {

    @Operation(summary = "Print your string to console")
    @PostMapping("/print")
    fun setNsidDataServiceStubMode(
        @RequestParam(name = "my-string", defaultValue = "my string") myString: String
    ): ResponseEntity<String> {
        println(myString)
        return ResponseEntity.ok(myString)
    }

}