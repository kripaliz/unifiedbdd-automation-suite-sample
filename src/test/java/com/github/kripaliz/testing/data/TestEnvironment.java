package com.github.kripaliz.testing.data;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * @author kkurian
 *
 */
@Component
@ConfigurationProperties("testEnvironment")
@Data
public class TestEnvironment {

	private String url;

}
