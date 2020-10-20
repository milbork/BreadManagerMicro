package com.breedmanager.UserSrvice.controller;

import com.breedmanager.UserSrvice.model.user.UserDTO;
import com.breedmanager.UserSrvice.service.UserService;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.net.URI;
import java.net.URISyntaxException;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("/add")
    public ResponseEntity<EntityModel<String>> addUser(){

        Link link = linkTo(methodOn(UserController.class).addUser()).withSelfRel();
        EntityModel<String> entityModel = EntityModel.of("Add new User", link);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(entityModel);
    }

    @PostMapping("/add")
    public ResponseEntity<UserDTO> addUser(@RequestBody
                                           @Valid UserDTO userDTO) throws URISyntaxException {

        UserDTO user = service.createUser(userDTO);

        URI uri = new URI(String.format("/user/add/%d", user.getId()));

        return ResponseEntity
                .created(uri)
                .body(user);
    }

}
