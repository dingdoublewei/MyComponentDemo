package com.dww.demo.basiclib.beans;

/**
 * Created by dww on 2018/7/17.
 */

public class CarBrandBean {
    private int carAge;
    private String brandName;
    private String carNo;
    private boolean isNew;

    public int getCarAge() {
        return carAge;
    }

    public void setCarAge(int carAge) {
        this.carAge = carAge;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    @Override
    public String toString() {
        return "CarBrandBean{" +
                "carAge=" + carAge +
                ", brandName='" + brandName + '\'' +
                ", carNo='" + carNo + '\'' +
                ", isNew=" + isNew +
                '}';
    }
}
