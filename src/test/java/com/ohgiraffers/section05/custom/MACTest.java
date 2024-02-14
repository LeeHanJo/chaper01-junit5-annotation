package com.ohgiraffers.section05.custom;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.OS;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@DisabledOnOs(value = OS.MAC, disabledReason = "맥에서는 작동하지 않습니다.")
@Test
public @interface MACTest {
}
