package com.dex.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {

    public static boolean isValidJSON(final String json) throws Exception {
        boolean valid = false;

        final JsonParser parser = new ObjectMapper().getJsonFactory()
                .createJsonParser(json);
        while (parser.nextToken() != null) {
        }

        valid = true;
        return valid;
    }
}
