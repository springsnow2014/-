package com.project.controller.chat;

import com.project.controller.*;

import com.project.dao.*;

import com.project.model.*;

import com.project.service.*;

import com.project.util.*;
import com.project.util.PageUtils;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/commonapi/chat")
public class ChatChatController {
    @Autowired
    ChatLogMapper chatLogMapper;
    @Autowired
    TeacherInfoMapper teacherInfoMapper;
    @Autowired
    StudentInfoMapper studentInfoMapper;
    @Autowired
    ChatChatService chatChatService;

    /**
            进入搜索列表接口
    **/
    @RequestMapping(value = "chat")
    public String index(ModelMap modelMap, Integer targetId,
        HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);
        modelMap.addAttribute("login", login);

        if (login == null) {
            return "redirect:/commonapi/sys_login";
        }

        if (login.getLoginType() == 2) {
            TeacherInfo teacherInfo = teacherInfoMapper.selectByPrimaryKey(login.getId());
            modelMap.addAttribute("userName", login.getName());
            modelMap.addAttribute("userImg", teacherInfo.getHeadImg());

            if (targetId != null) {
                StudentInfo studentInfo = studentInfoMapper.selectByPrimaryKey(targetId);
                modelMap.addAttribute("targetId", targetId);
                modelMap.addAttribute("targetName", studentInfo.getStuNo());
                modelMap.addAttribute("targetImg", studentInfo.getHeadImg());
            }
        }

        if (login.getLoginType() == 3) {
            StudentInfo studentInfo = studentInfoMapper.selectByPrimaryKey(login.getId());
            modelMap.addAttribute("userName", login.getName());
            modelMap.addAttribute("userImg", studentInfo.getHeadImg());

            if (targetId != null) {
                TeacherInfo teacherInfo = teacherInfoMapper.selectByPrimaryKey(targetId);
                modelMap.addAttribute("targetId", targetId);
                modelMap.addAttribute("targetName", teacherInfo.getTno());
                modelMap.addAttribute("targetImg", teacherInfo.getHeadImg());
            }
        }

        int newMsgNum = chatChatService.getTotalNewChatLog(login);
        modelMap.addAttribute("newMsgNum", newMsgNum);

        modelMap.addAttribute("basePath", "localhost:8080/graduate_project_sys");

        return "chat/chat_chat";
    }

    /**
     * 加载历史联系人
     * @return
     */
    @RequestMapping(value = "getChatLog")
    @ResponseBody
    public Object loadChatLog(HttpServletRequest request) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);
        List<Map<String, Object>> logs = new ArrayList<Map<String, Object>>();

        if (login.getLoginType() == 2) {
            ChatLogExample ce = new ChatLogExample();
            ChatLogExample.Criteria cc = ce.createCriteria();
            cc.andTidEqualTo(login.getId());
            ce.setOrderByClause("id desc");

            List<ChatLog> cl = chatLogMapper.selectByExample(ce);
            Set<Integer> uids = new HashSet<Integer>(); //存储所有最近联系人

            for (ChatLog c : cl) {
                uids.add(c.getSid());
            }

            for (Integer uid : uids) {
                StudentInfo chat = studentInfoMapper.selectByPrimaryKey(uid);
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("uname", chat.getStuNo());
                map.put("uimg", chat.getHeadImg());
                map.put("uid", chat.getId());

                ChatLogExample ce3 = new ChatLogExample();
                ChatLogExample.Criteria cc3 = ce3.createCriteria();
                cc3.andTidEqualTo(login.getId());
                cc3.andSidEqualTo(uid);
                cc3.andIsReadEqualTo(2); //未读
                cc3.andTypeEqualTo(2); //别人发给我的信息

                int count = (int) chatLogMapper.countByExample(ce3);
                map.put("newLogsCount", count);
                map.put("newLog", "");
                map.put("newLogTime", "2000-01-01 00:00:00");

                for (ChatLog c : cl) {
                    if (c.getSid().equals(uid)) {
                        map.put("newLogTime", c.getCreateTime());

                        if ((c.getContent() != null) &&
                                (c.getContent().trim().equals("") == false) &&
                                (c.getContent().length() > 8)) {
                            map.put("newLog",
                                c.getContent().substring(0, 8) + "...");
                        } else {
                            map.put("newLog", c.getContent());
                        }

                        break;
                    }
                }

                logs.add(map);
            }

            Collections.sort(logs,
                new Comparator<Map<String, Object>>() {
                    @Override
                    public int compare(Map<String, Object> map1,
                        Map<String, Object> map2) {
                        return map1.get("newLogTime").toString()
                                   .compareTo(map2.get("newLogTime").toString());
                    }
                }); //按最新聊天记录排序
        }

        if (login.getLoginType() == 3) {
            ChatLogExample ce = new ChatLogExample();
            ChatLogExample.Criteria cc = ce.createCriteria();
            cc.andSidEqualTo(login.getId());
            ce.setOrderByClause("id desc");

            List<ChatLog> cl = chatLogMapper.selectByExample(ce);
            Set<Integer> uids = new HashSet<Integer>(); //存储所有最近联系人

            for (ChatLog c : cl) {
                uids.add(c.getTid());
            }

            for (Integer uid : uids) {
                TeacherInfo chat = teacherInfoMapper.selectByPrimaryKey(uid);
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("uname", chat.getTno());
                map.put("uimg", chat.getHeadImg());
                map.put("uid", chat.getId());

                ChatLogExample ce3 = new ChatLogExample();
                ChatLogExample.Criteria cc3 = ce3.createCriteria();
                cc3.andSidEqualTo(login.getId());
                cc3.andTidEqualTo(uid);
                cc3.andIsReadEqualTo(2); //未读
                cc3.andTypeEqualTo(1); //别人发给我的信息

                int count = (int) chatLogMapper.countByExample(ce3);
                map.put("newLogsCount", count);
                map.put("newLog", "");
                map.put("newLogTime", "2000-01-01 00:00:00");

                for (ChatLog c : cl) {
                    if (c.getTid().equals(uid)) {
                        map.put("newLogTime", c.getCreateTime());

                        if ((c.getContent() != null) &&
                                (c.getContent().trim().equals("") == false) &&
                                (c.getContent().length() > 8)) {
                            map.put("newLog",
                                c.getContent().substring(0, 8) + "...");
                        } else {
                            map.put("newLog", c.getContent());
                        }

                        break;
                    }
                }

                logs.add(map);
            }

            Collections.sort(logs,
                new Comparator<Map<String, Object>>() {
                    @Override
                    public int compare(Map<String, Object> map1,
                        Map<String, Object> map2) {
                        return map1.get("newLogTime").toString()
                                   .compareTo(map2.get("newLogTime").toString());
                    }
                }); //按最新聊天记录排序
        }

        return logs;
    }

    /**
     *点某个联系人进行聊天
     * @return
     */
    @RequestMapping(value = "viewUserLogs")
    @ResponseBody
    public Object viewUserLogs(HttpServletRequest request, Integer id) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);
        List<Map<String, Object>> logs = new ArrayList<Map<String, Object>>();

        if (login.getLoginType() == 2) {
            ChatLogExample ce = new ChatLogExample();
            ChatLogExample.Criteria cc = ce.createCriteria();
            cc.andTidEqualTo(login.getId());
            cc.andSidEqualTo(id);
            ce.setOrderByClause("id asc");

            List<ChatLog> cl = chatLogMapper.selectByExample(ce);

            for (ChatLog log : cl) {
                StudentInfo chat = studentInfoMapper.selectByPrimaryKey(log.getSid());
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("uname", chat.getStuNo());

                if (log.getType() == 1) {
                    map.put("sendType", 1);
                }

                if (log.getType() == 2) {
                    map.put("sendType", 2);
                }

                map.put("log", log.getContent());
                map.put("createTime", log.getCreateTime());
                logs.add(map); //别人发给我的信息
            }
        }

        if (login.getLoginType() == 3) {
            ChatLogExample ce = new ChatLogExample();
            ChatLogExample.Criteria cc = ce.createCriteria();
            cc.andTidEqualTo(id);
            cc.andSidEqualTo(login.getId());
            ce.setOrderByClause("id asc");

            List<ChatLog> cl = chatLogMapper.selectByExample(ce);

            for (ChatLog log : cl) {
                TeacherInfo chat = teacherInfoMapper.selectByPrimaryKey(log.getTid());
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("uname", chat.getTno());

                if (log.getType() == 1) {
                    map.put("sendType", 2);
                }

                if (log.getType() == 2) {
                    map.put("sendType", 1);
                }

                map.put("log", log.getContent());
                map.put("createTime", log.getCreateTime());
                logs.add(map); //别人发给我的信息
            }
        }

        setRead(request, id); //所有和他的聊天记录已读

        return logs;
    }

    /**
     *设置跟某个人的聊天记录为已读
     * @return
     */
    @RequestMapping(value = "setRead")
    @ResponseBody
    public Object setRead(HttpServletRequest request, Integer id) {
        LoginModel login = (LoginModel) request.getSession()
                                               .getAttribute(CommonVal.sessionName);

        if (login.getLoginType() == 2) {
            ChatLogExample ce = new ChatLogExample();
            ChatLogExample.Criteria cc = ce.createCriteria();
            cc.andTidEqualTo(login.getId());
            cc.andSidEqualTo(id);
            cc.andIsReadEqualTo(2);
            cc.andTypeEqualTo(2); //朋友发的消息为未读

            ChatLog log = new ChatLog();
            log.setIsRead(1);
            chatLogMapper.updateByExampleSelective(log, ce);
        }

        if (login.getLoginType() == 3) {
            ChatLogExample ce = new ChatLogExample();
            ChatLogExample.Criteria cc = ce.createCriteria();
            cc.andSidEqualTo(login.getId());
            cc.andTidEqualTo(id);
            cc.andIsReadEqualTo(2);
            cc.andTypeEqualTo(1); //朋友发的消息为未读

            ChatLog log = new ChatLog();
            log.setIsRead(1);
            chatLogMapper.updateByExampleSelective(log, ce);
        }

        Map<String, Object> rs = new HashMap<String, Object>();
        rs.put("code", 1);

        return rs;
    }
}

