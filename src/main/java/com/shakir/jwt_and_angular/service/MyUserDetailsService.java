package com.shakir.jwt_and_angular.service;


import com.shakir.jwt_and_angular.models.MyUserDetails;
import com.shakir.jwt_and_angular.models.User;
import com.shakir.jwt_and_angular.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepo.findByUserName(username);

        user.orElseThrow( () -> new UsernameNotFoundException("Not Found") );

        return user.map(MyUserDetails::new).get();
    }
}
