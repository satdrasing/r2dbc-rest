package com.example.r2dbc;

import org.springframework.web.server.adapter.AbstractReactiveWebInitializer;

public class AppInitializer extends AbstractReactiveWebInitializer {

    @Override
    protected Class<?>[] getConfigClasses() {
        return new Class[]{
                AppConfig.class,
                WebConfig.class
        };
    }
}
