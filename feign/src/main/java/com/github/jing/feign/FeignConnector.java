package com.github.jing.feign;

import feign.Param;
import feign.RequestLine;

/**
 * Created by chenjing28 on 18/3/3.
 */
public interface FeignConnector {

    class HelloResponse {
        private int code;
        private String message;
        private String data;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "HelloResponse{" +
                    "code=" + code +
                    ", message='" + message + '\'' +
                    ", data='" + data + '\'' +
                    '}';
        }
    }

    @RequestLine("GET /hello/{name}")
    HelloResponse hello(@Param("name") String name);

    @RequestLine("GET /hello2/{name}")
    HelloResponse hello2(@Param("name") String name);

}
