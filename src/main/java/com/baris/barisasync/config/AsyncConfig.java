package com.baris.barisasync.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
@EnableAsync
public class AsyncConfig {
    @Bean(name = "taskExecutor")
    public Executor taskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(2); //kaç farklı thread direkt çalışacak
        executor.setMaxPoolSize(2); //en fazla kaç thread çalışacak
        executor.setQueueCapacity(100); //elimizde 1000 kayıtlık iki tane csv var onların kaç kaç işleneceği mi acaba?
        executor.setThreadNamePrefix("threadNo-");
        executor.initialize();
        return executor;
    }
}




