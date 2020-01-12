package com.jdark.aggregate.demo.util;

import cn.hutool.core.util.StrUtil;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * @author jiangjie
 */
@Slf4j
public class JsonUtil {

  private static ObjectMapper objectMapper = new ObjectMapper();

  // 日期起格式化
  static {
    //对象的所有字段全部列入
    objectMapper.setSerializationInclusion(JsonInclude.Include.ALWAYS);

    //忽略空Bean转json的错误
    objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);

    //忽略 在json字符串中存在，但是在java对象中不存在对应属性的情况。防止错误
    objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
  }

  public static String objToJsonStr(Object obj) {
    if (obj == null) {
      return null;
    }
    try {
      return obj instanceof String ? (String) obj : objectMapper.writeValueAsString(obj);
    } catch (JsonProcessingException e) {
      log.error("Parse Object to String error : {}", e.getMessage());
      return null;
    }
  }

  public static <T> List<T> jsonToList(String json,Class<T> cls) {
    JavaType javaType = objectMapper.getTypeFactory().constructCollectionType(List.class, cls);
    if (StrUtil.isBlank(json)) {
      return new ArrayList<>();
    }
    try {
      return objectMapper.readValue(json, javaType);

    } catch (JsonProcessingException e) {
      log.error("Parse Object to String error : {}", e.getMessage());
    }
    return null;
  }

  public static <T> T jsonToObj(String json, TypeReference<T> typeReference ) {
    if (StrUtil.isBlank(json)) {
      return null;
    }
    try {
      return objectMapper.readValue(json, typeReference);

    } catch (JsonProcessingException e) {
      log.error("Parse Object to String error : {}", e.getMessage());
    }
    return null;
  }
}