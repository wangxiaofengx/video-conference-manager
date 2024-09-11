package com.conference.bo;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class UserInfo {

    private String id;

    private String name;

    private String ip;
}
