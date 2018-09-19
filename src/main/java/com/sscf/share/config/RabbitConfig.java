package com.sscf.share.config;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
	
	/*//直连交换机
    @Bean
    public DirectExchange defaultExchange() {
        return new DirectExchange("user"); 
    }*/
	
	 @Bean
     public Queue queue() {
          return new Queue("online-user-trace");
     }
    

}
