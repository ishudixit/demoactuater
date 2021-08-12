package com.example.demoactuater;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;
    @Component
    public class LoggerService implements HealthIndicator {
        private final String LOGGER_SERVICE= "Logger Service";

        @Override
        public Health health() {
            if (isLoggerServiceGood()) {
                return Health.up().withDetail(" LOGGER_SERVICE", "Service is running").build();
            }
            return Health.down().withDetail(" LOGGER_SERVICE", "Service is  not running").build();
        }

        public boolean isLoggerServiceGood() {

            return false;
        }
    }


