/*
 * Product: OMotor
 * Copyright (C) 2017 OMotor. All Rights Reserved.
 */
package com.test.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author rafaelsilva
 *
 */
@SpringBootApplication
@ComponentScan({
	"com.test.*"
})
public class TestMain {

	public static void main(String[] args) {
		SpringApplication.run(TestMain.class, args);
	}

}
