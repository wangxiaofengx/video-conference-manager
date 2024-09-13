package com.conference.bo;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Message {

    private Integer sequence;

    private String type;

    private Object data;

    private String sender;
    private String receiver;

    public enum Type {
        INIT("init"),
        JOIN("join"),
        LEAVE("leave"),
        OPEN("open"),
        CLOSE("close"),
        MESSAGE("message"),
        PING("ping"),
        ;
        String type;

        Type(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
    }
}
