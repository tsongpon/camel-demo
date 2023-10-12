package io.songpon.cameldemo.route;

import io.songpon.cameldemo.processor.UpperCaseProcessor;
import org.springframework.stereotype.Component;

@Component
public class RouteBuilder extends org.apache.camel.builder.RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("file:/Users/11411733/data/in")
                .to("bean:io.songpon.cameldemo.processor.UpperCaseProcessor")
                .to("file:/Users/11411733/data/out?fileName=${file:name.noext}-${date:now:yyyyMMdd}.txt");

        from("cron:tab?schedule=*/10 * * * * *")
                .log("this is a test");
    }
}
