package com.TimeLeaf.group_jane;

import com.TimeLeaf.group_jane.AuthenticationFilter;

@Configuration
public class WebApplicationConfig implements WebMvcConfigurer {

//     Create spring-managed object to allow the app to access our filter
    @Bean
    public AuthenticationFilter authenticationFilter() {
        return new AuthenticationFilter();
    }

    // Register the filter with the Spring container
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor( authenticationFilter() );
    }

}
