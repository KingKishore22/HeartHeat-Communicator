package com.kishoreb.annotations;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = Check_Age.class)
public @interface AgeCheck {
	int mini() default 18;
	int maxi() default 50;
	String message() default "You are not Eligible";
	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
}
