package com.bingo.bingo.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bingo.bingo.Models.RoleModel;
import com.bingo.bingo.Services.RoleService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping("/all")
    public List<RoleModel> getAllRoles() {
        return roleService.getAllRoles();
    }

    @PostMapping("/insert")
    public RoleModel insertRole(@RequestBody RoleModel role) {
        return roleService.insertRole(role);
    }
    
    @PutMapping("/edit")
    public RoleModel editRole(@RequestBody RoleModel role) {
        return roleService.insertRole(role);
    }

    @DeleteMapping("/delete/{idRole}")
    public Optional<RoleModel> deleteRole(@PathVariable int idRole) {
        return roleService.deleteRole(idRole);
    }
    

}
