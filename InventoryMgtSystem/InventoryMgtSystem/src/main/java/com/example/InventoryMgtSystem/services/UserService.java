package com.example.InventoryMgtSystem.services;

import com.example.InventoryMgtSystem.dtos.LoginRequest;
import com.example.InventoryMgtSystem.dtos.RegisterRequest;
import com.example.InventoryMgtSystem.dtos.Response;
import com.example.InventoryMgtSystem.dtos.UserDTO;
import com.example.InventoryMgtSystem.models.User;

public interface UserService {
    Response registerUser(RegisterRequest registerRequest);

    Response loginUser(LoginRequest loginRequest);

    Response getAllUsers();

    User getCurrentLoggedInUser();

    Response getUserById(Long id);

    Response updateUser(Long id, UserDTO userDTO);

    Response deleteUser(Long id);

    Response getUserTransactions(Long id);
}