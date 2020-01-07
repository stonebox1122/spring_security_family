package com.stone.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class RsaUtilsTest {

    private String publicKeyFile = "D:\\auth_key\\rsa_key.pub";
    private String privateKeyFile = "D:\\auth_key\\rsa_key";

    @Test
    public void generateKey() throws Exception {
        RsaUtils.generateKey(publicKeyFile, privateKeyFile, "stone", 2048);
    }

    @Test
    public void getPublicKey() throws Exception {
        System.out.println(RsaUtils.getPublicKey(publicKeyFile));
    }

    @Test
    public void getPrivateKey() throws Exception {
        System.out.println(RsaUtils.getPrivateKey(privateKeyFile));
    }
}