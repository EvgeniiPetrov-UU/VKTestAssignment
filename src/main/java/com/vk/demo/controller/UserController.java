package com.vk.demo.controller;

import com.vk.demo.model.dto.UserDto;
import com.vk.demo.service.dto.abstracts.UserDtoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
@Tag(name = "User REST controller")
public class UserController {

    private final UserDtoService userDtoService;

    @Autowired
    public UserController(UserDtoService userDtoService) {
        this.userDtoService = userDtoService;
    }

    @GetMapping("/{id}")
    @Operation(summary = "Getting user by id")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "User loaded successfully"),
            @ApiResponse(responseCode = "400", description = "User not found")
    })
    public ResponseEntity<UserDto> getUserById(@PathVariable Long id) {
        return new ResponseEntity<>(userDtoService.getUserDtoById(id), HttpStatus.OK);
    }
}
