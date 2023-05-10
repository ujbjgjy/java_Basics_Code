package com.ujbj.test.test4;

import java.util.Date;

public class Goods {
    private String id;
    private String name;
    private int price;
    private Date date;

    private String producer;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }



    public Goods() {
    }

    public Goods(String id, String name, int price, String producer, Date date) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.producer = producer;
        this.date = date;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return price
     */
    public int getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * 获取
     * @return producer
     */
    public String getProducer() {
        return producer;
    }

    /**
     * 设置
     * @param producer
     */
    public void setProducer(String producer) {
        this.producer = producer;
    }
}
