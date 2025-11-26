package br.com.dgc.fmtools;

import java.util.TimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FmtoolsApplication {

    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("GMT-03:00"));
        SpringApplication.run(FmtoolsApplication.class, args);
    }

}