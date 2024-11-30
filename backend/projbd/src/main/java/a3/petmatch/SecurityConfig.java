package a3.petmatch;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.HttpBasicConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    // Define o encoder de senha (usado para codificação de senha)
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(); // Usando BCryptPasswordEncoder para codificar senhas
    }

    // Configuração da segurança HTTP
    @SuppressWarnings("removal")
    @Bean
    public HttpBasicConfigurer<HttpSecurity> httpSecurity(HttpSecurity http) throws Exception {
        // Configuração de segurança usando a nova API de configuração baseada em Lambda
        return http
                .csrf().disable() // Desabilitando CSRF (não recomendado para produção)
                .authorizeHttpRequests(authz -> authz
                        .requestMatchers("/api/pets").permitAll() // Permite acesso sem autenticação
                        .anyRequest().authenticated() // Exige autenticação para outros endpoints
                )
                .httpBasic(); // Usando autenticação básica (usuário/senha)
    }
}
