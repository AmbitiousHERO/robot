package com.example.demo.mapper;

import com.example.demo.pojo.Message;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageMapper {

    /**
     * 保存发送和接收到的消息
     */
    @Insert("INSERT INTO message values(null,#{message.clientIp},#{message.sendContent},#{message.replyContent},#{message.createTime}) ")
    void saveMessage(@Param("message") Message message);

}