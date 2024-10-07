package com.cn.hotel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class HotelSecurityConfig {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception 
	{
		http.csrf().disable()
			.authorizeHttpRequests()
			.anyRequest()
			.authenticated()
			.and()
			.httpBasic();
		return http.build();
		
	}
	
	@Bean
	public UserDetailsService users()
	{
		UserDetails user1 = User.builder()
				.username("tony")
				.password(passwordEncoder().encode("password"))
				.roles("NORMAL")
				.build();
		
		UserDetails user2 = User.builder()
				.username("steve")
				.password(passwordEncoder().encode("nopassword"))
				.roles("ADMIN")
				.build();
		
		return new InMemoryUserDetailsManager(user1,user2);
	}
	
	@Bean
	public PasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
}


/*


@Configuration // Marks this class as a configuration class for Spring
@EnableWebSecurity // Enables Spring Security's web security features
@EnableGlobalMethodSecurity(prePostEnabled = true) // Enables method-level security using @PreAuthorize and @PostAuthorize
public class HotelSecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        // Disable CSRF protection (not recommended for production unless there's a reason)
        http.csrf().disable()
            // Authorize all incoming HTTP requests
            .authorizeHttpRequests()
            // Ensure any request must be authenticated
            .anyRequest()
            .authenticated()
            // Enable basic HTTP authentication (username & password sent in the request header)
            .and()
            .httpBasic();
        // Build and return the configured SecurityFilterChain
        return http.build();
    }

    @Bean
    public UserDetailsService users() {
        // Create a user with username "tony", password "password", and role "NORMAL"
        UserDetails user1 = User.builder()
                .username("tony")
                .password(passwordEncoder().encode("password"))
                .roles("NORMAL")
                .build();

        // Create another user with username "steve", password "nopassword", and role "ADMIN"
        UserDetails user2 = User.builder()
                .username("steve")
                .password(passwordEncoder().encode("nopassword"))
                .roles("ADMIN")
                .build();

        // Return an InMemoryUserDetailsManager to store the users in memory
        return new InMemoryUserDetailsManager(user1, user2);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        // Use BCryptPasswordEncoder for encoding passwords (a strong password hashing function)
        return new BCryptPasswordEncoder();
    }
}


*/

