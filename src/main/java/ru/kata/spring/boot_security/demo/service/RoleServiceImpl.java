package ru.kata.spring.boot_security.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.dao.RoleDAO;
import ru.kata.spring.boot_security.demo.dao.UserDAO;
import ru.kata.spring.boot_security.demo.models.Role;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    //@Autowired
    //private UserDAO userDAO;

    @Autowired
    private RoleDAO roleDAO;

    @Override
    public List<Role> getAllRoles() {
        return roleDAO.getAllRoles();
    }

    @Override
    public void add(Role role) {
        roleDAO.add(role);
    }

    @Override
    public void delete(long id) {
        roleDAO.delete(id);
    }

    @Override
    public void edit(Role role) {
        roleDAO.edit(role);
    }

    @Override
    public Role getById(long id) {
        return roleDAO.getById(id);
    }

    @Override
    public Role getByName(String roleName) {
        return roleDAO.getByName(roleName);
    }
}
