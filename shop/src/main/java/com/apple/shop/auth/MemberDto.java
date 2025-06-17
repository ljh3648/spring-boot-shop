package com.apple.shop.auth;

public class MemberDto{
    public String username;
    public String displayName;

    public MemberDto(String username, String displayName){
        this.username = username;
        this.displayName = displayName;
    }
}