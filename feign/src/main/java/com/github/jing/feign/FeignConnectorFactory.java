package com.github.jing.feign;

import feign.Feign;
import feign.Logger;
import feign.codec.Decoder;
import feign.gson.GsonDecoder;

/**
 * Created by chenjing28 on 18/3/3.
 */
public class FeignConnectorFactory {
    public FeignConnector getInstance() {
        Decoder decoder = new GsonDecoder();
        return Feign.builder()
                .decoder(decoder)
                .logger(new Logger.JavaLogger().appendToFile("/tmp/http.log"))
                .logLevel(Logger.Level.FULL)
                .target(FeignConnector.class, "http://localhost:8080");
    }
}
