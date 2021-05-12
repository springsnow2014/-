package com.project.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 固定下拉列表解释器
 * @author Administrator
 *
 */
public class DataListUtils {
    public static void main(String[] args) {
    }

    /**
    **获取登录角色列表
    */
    public static List<Map<String, Object>> getLoginTypeList() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        list.add(getMap("1", "admin"));
        list.add(getMap("2", "teacher"));
        list.add(getMap("3", "student"));

        return list;
    }

    /**
    **获取sex数据列表
    */
    public static List<Map<String, Object>> getSexList() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        list.add(getMap("1", "男"));
        list.add(getMap("2", "女"));

        return list;
    }

    public static String getSexNameById(String id) { //根据sex的key值获取名称

        List<Map<String, Object>> list = getSexList();

        return getNameById(id, list);
    }

    /**
    **获取is_select数据列表
    */
    public static List<Map<String, Object>> getIsSelectList() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        list.add(getMap("1", "可选"));
        list.add(getMap("2", "不可选"));

        return list;
    }

    public static String getIsSelectNameById(String id) { //根据is_select的key值获取名称

        List<Map<String, Object>> list = getIsSelectList();

        return getNameById(id, list);
    }

    /**
    **获取have_turtor数据列表
    */
    public static List<Map<String, Object>> getHaveTurtorList() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        list.add(getMap("1",
                "未有导师"));
        list.add(getMap("2",
                "已有导师"));

        return list;
    }

    public static String getHaveTurtorNameById(String id) { //根据have_turtor的key值获取名称

        List<Map<String, Object>> list = getHaveTurtorList();

        return getNameById(id, list);
    }

    /**
    **获取select_status数据列表
    */
    public static List<Map<String, Object>> getSelectStatusList() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        list.add(getMap("1", "已申请"));
        list.add(getMap("2",
                "已同意申请"));
        list.add(getMap("3",
                "已拒绝申请"));
        list.add(getMap("4", "已取消"));

        return list;
    }

    public static String getSelectStatusNameById(String id) { //根据select_status的key值获取名称

        List<Map<String, Object>> list = getSelectStatusList();

        return getNameById(id, list);
    }

    public static String getNameById(String id, List<Map<String, Object>> list) {
        if (id == null) {
            return null;
        }

        if (id.endsWith(",")) {
            id = id.substring(0, id.length() - 1);
        }

        String[] idsplit = id.split(",");
        String rs = "";

        for (String tmp : idsplit) {
            for (Map<String, Object> map : list) {
                if (map.get("id").toString().equals(tmp)) {
                    rs += (map.get("name").toString() + ",");
                }
            }
        }

        if (rs.endsWith(",")) {
            rs = rs.substring(0, rs.length() - 1);
        }

        return rs;
    }

    private static Map<String, Object> getMap(String id, String name) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id", id);
        map.put("name", name);

        return map;
    }
}

