package es.restaurante.RestauranteSpring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class SeguridadAppConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		UserBuilder usuarios=User.withDefaultPasswordEncoder();
		
		auth.inMemoryAuthentication()
		.withUser(usuarios.username("Juan").password("123").roles("Administrador"))
		.withUser(usuarios.username("Mauricio").password("456").roles("Cajero"));
		
	}

	
	
}
