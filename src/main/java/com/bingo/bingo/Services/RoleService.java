package com.bingo.bingo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bingo.bingo.Models.RoleModel;
import com.bingo.bingo.Repositories.RoleRepository;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public List<RoleModel> getAllRoles() {
        return roleRepository.findAll();
    }

    public RoleModel insertRole(RoleModel role){
        return roleRepository.save(role);
    }

    public Optional<RoleModel> deleteRole(int idRole){
        Optional<RoleModel> role = roleRepository.findById(idRole);
        try {
            roleRepository.deleteById(idRole);
        } catch (Exception e) {
            return null;
        }
        return role;
    }
}
