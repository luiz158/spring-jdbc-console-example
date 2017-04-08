package com.mangani.learning;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.EnvironmentStringPBEConfig;

public class Encryptor {
	
	public static void main(String[] args) {
		EnvironmentStringPBEConfig env = new EnvironmentStringPBEConfig();
		env.setAlgorithm("PBEWithMD5AndDES");
		env.setPassword("LOCAL");
		
		StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
		encryptor.setConfig(env);
		
		System.out.println(String.format("root=%s", encryptor.encrypt("root")));
		System.out.println(String.format("password=%s", encryptor.encrypt("Mangani2017")));
				
	}

}
