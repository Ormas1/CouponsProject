package com.or.couponsPhaseTwo.dtos;

import com.or.couponsPhaseTwo.entities.UsersEntity;
import com.or.couponsPhaseTwo.enums.Type;

public class User {
    private long userId;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private long companyId;
    private Type type;

    public User() {
    }

    public User(UsersEntity usersEntity) {
        this.userId = usersEntity.getId();
        this.userName = usersEntity.getUserName();
        this.password = usersEntity.getPassword();
        this.firstName = usersEntity.getFirstName();
        this.lastName = usersEntity.getLastName();
        this.companyId = usersEntity.getCompanyId();
        this.type = usersEntity.getType();
    }

    public User(long userId, String userName, String password, String firstName, String lastName, long companyId, Type type) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyId = companyId;
        this.type = type;
    }

    public User(String userName, String password, String firstName, String lastName, long companyId, Type type) {
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyId = companyId;
        this.type = type;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
