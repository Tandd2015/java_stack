package com.codingdojo.authone.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.codingdojo.authone.models.RoleModel;
import com.codingdojo.authone.models.UserModel;
import com.codingdojo.authone.repositories.UserRepository;

@Service
public class UserDetailsServiceImplementation implements UserDetailsService{
	
	private UserRepository userRepository;
	
	public UserDetailsServiceImplementation(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserModel userModel = userRepository.findByUsername(username);
        
        if(userModel == null) {
            throw new UsernameNotFoundException("User not found");
        }
        
        return new org.springframework.security.core.userdetails.User(userModel.getUsername(), userModel.getPassword(), getAuthorities(userModel));
    }
    
    private List<GrantedAuthority> getAuthorities(UserModel userModel){
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        for(RoleModel roleModel : userModel.getRoleModels()) {
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(roleModel.getName());
            authorities.add(grantedAuthority);
        }
        return authorities;
    }
}
