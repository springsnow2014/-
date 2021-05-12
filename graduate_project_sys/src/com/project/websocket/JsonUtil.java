package com.project.websocket;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.sf.json.JSONObject;

import java.util.List;
import java.util.Map;


public class JsonUtil {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String[] args) {
        String str = "[{\"test\":[{\"zhName\":\"dfas1\",\"isDefault\":\"2\",\"tid\":\"8\",\"defaultQuerys\":[{\"aid\":\"19\",\"val\":\"4\",\"tid\":\"8\"},{\"aid\":\"19\",\"val\":\"5\",\"tid\":\"8\"}],\"hideConditions\":[{\"aid\":\"19\",\"val\":\"4\",\"tid\":\"8\"},{\"aid\":\"19\",\"val\":\"5\",\"tid\":\"8\"},{\"aid\":\"19\",\"val\":\"4\",\"tid\":\"8\"}]},{\"zhName\":\"11111111\",\"isDefault\":\"2\",\"tid\":\"8\",\"defaultQuerys\":[{\"aid\":\"19\",\"val\":\"4\",\"tid\":\"8\"}],\"hideConditions\":[{\"aid\":\"19\",\"val\":\"5\",\"tid\":\"8\"}]}]}]";
        List<Map<String, Object>> map = jsonToObject(str, java.util.List.class);
        System.out.println(map);
    }

    /**
     * 将对象转成json
     *
     * @param object 被转的对象
     * @return 返回json
     */
    public static String objToJson(Object object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
        }

        return null;
    }

    /**
     * 将json转成对象
     *
     * @param jsonString  被转的json
     * @param objectClass 转换后对象的class
     * @param <T>         泛型
     * @return 返回object
     */
    public static <T> T jsonToObject(String jsonString, Class<T> objectClass) {
        try {
            return objectMapper.readValue(jsonString, objectClass);
        } catch (Exception e) {
        }

        return null;
    }

    /**
     * 将json转成map
     *
     * @param jsonString 被转的json
     * @return 返回map
     */
    public static Map<String, Object> jsonToMap(String jsonString) {
        try {
            return objectMapper.readValue(jsonString, Map.class);
        } catch (Exception e) {
        }

        return null;
    }
}

