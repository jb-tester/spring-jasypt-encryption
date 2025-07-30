package com.mytests.spring.springjasyptencryption;

import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.junit.jupiter.api.Test;


class UtilTestToGenerateTheEncryptionKey {

    String password = "jolt"; // actual DB password
    String secret = "my_secret"; // encryptor's private key
    @Test
    void getEncryptedPassword() {
        PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
        SimpleStringPBEConfig config = new SimpleStringPBEConfig();
        config.setPassword(secret); // encryptor's private key
        config.setAlgorithm("PBEWithMD5AndDES");
        config.setKeyObtentionIterations("1000");
        config.setPoolSize("1");
        config.setProviderName("SunJCE");
        config.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator");
        config.setStringOutputType("base64");
        encryptor.setConfig(config);
        String encryptedPassword = encryptor.encrypt(password);
        System.out.println("encryptedPassword : " + encryptedPassword);
    }

}
