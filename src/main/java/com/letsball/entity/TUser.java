package com.letsball.entity;

public class TUser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.UID
     *
     * @mbggenerated Mon Sep 21 13:18:54 CST 2015
     */
    private Integer uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.UPASSWORD
     *
     * @mbggenerated Mon Sep 21 13:18:54 CST 2015
     */
    private String upassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.USEX
     *
     * @mbggenerated Mon Sep 21 13:18:54 CST 2015
     */
    private Integer usex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.UNAME
     *
     * @mbggenerated Mon Sep 21 13:18:54 CST 2015
     */
    private String uname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.UID
     *
     * @return the value of t_user.UID
     *
     * @mbggenerated Mon Sep 21 13:18:54 CST 2015
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.UID
     *
     * @param uid the value for t_user.UID
     *
     * @mbggenerated Mon Sep 21 13:18:54 CST 2015
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.UPASSWORD
     *
     * @return the value of t_user.UPASSWORD
     *
     * @mbggenerated Mon Sep 21 13:18:54 CST 2015
     */
    public String getUpassword() {
        return upassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.UPASSWORD
     *
     * @param upassword the value for t_user.UPASSWORD
     *
     * @mbggenerated Mon Sep 21 13:18:54 CST 2015
     */
    public void setUpassword(String upassword) {
        this.upassword = upassword == null ? null : upassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.USEX
     *
     * @return the value of t_user.USEX
     *
     * @mbggenerated Mon Sep 21 13:18:54 CST 2015
     */
    public Integer getUsex() {
        return usex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.USEX
     *
     * @param usex the value for t_user.USEX
     *
     * @mbggenerated Mon Sep 21 13:18:54 CST 2015
     */
    public void setUsex(Integer usex) {
        this.usex = usex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.UNAME
     *
     * @return the value of t_user.UNAME
     *
     * @mbggenerated Mon Sep 21 13:18:54 CST 2015
     */
    public String getUname() {
        return uname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.UNAME
     *
     * @param uname the value for t_user.UNAME
     *
     * @mbggenerated Mon Sep 21 13:18:54 CST 2015
     */
    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }
}