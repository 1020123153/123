package com.jk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by 10201 on 2017/11/16.
 */
@Entity
public class Goods implements Serializable {
    private static final long serialVersionUID = 4004390724470216308L;
    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false, unique = true)
    private String numberid;//单号
    @Column(nullable = false, unique = true)
    private String kehu;//客户
    @Column(nullable = false, unique = true)
    private String xiaoshoudate; //销售日期
    @Column(nullable = false, unique = true)
    private BigDecimal xiaoshoumoney;//销售总额
    @Column(nullable = false)
    private Integer dengjistatus;//登记情况【1：未登记，2：登记完成】
    @Column(nullable = false)
    private Integer status;//状态【3：暂存，4：审核中，5：审核通过】
    @Column(nullable = false)
    private BigDecimal paymoney ;//预计付款金额
    @Column(nullable = false)
    private String paydate;//预计付款日期
    @Column(nullable = false)
    private String arrivaldate;//预计到货日期
    @Column(nullable = false)
    private Integer salesmae;//业务员(与用户表关联)、
    @Column(nullable = false)
    private Integer  fangshi;//发货方式
    @Column(nullable = false)
    private String remark;//备注


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumberid() {
        return numberid;
    }

    public void setNumberid(String numberid) {
        this.numberid = numberid;
    }

    public String getKehu() {
        return kehu;
    }

    public void setKehu(String kehu) {
        this.kehu = kehu;
    }

    public String getXiaoshoudate() {
        return xiaoshoudate;
    }

    public void setXiaoshoudate(String xiaoshoudate) {
        this.xiaoshoudate = xiaoshoudate;
    }

    public BigDecimal getXiaoshoumoney() {
        return xiaoshoumoney;
    }

    public void setXiaoshoumoney(BigDecimal xiaoshoumoney) {
        this.xiaoshoumoney = xiaoshoumoney;
    }

    public Integer getDengjistatus() {
        return dengjistatus;
    }

    public void setDengjistatus(Integer dengjistatus) {
        this.dengjistatus = dengjistatus;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public BigDecimal getPaymoney() {
        return paymoney;
    }

    public void setPaymoney(BigDecimal paymoney) {
        this.paymoney = paymoney;
    }

    public String getPaydate() {
        return paydate;
    }

    public void setPaydate(String paydate) {
        this.paydate = paydate;
    }

    public String getArrivaldate() {
        return arrivaldate;
    }

    public void setArrivaldate(String arrivaldate) {
        this.arrivaldate = arrivaldate;
    }

    public Integer getSalesmae() {
        return salesmae;
    }

    public void setSalesmae(Integer salesmae) {
        this.salesmae = salesmae;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getFangshi() {
        return fangshi;
    }

    public void setFangshi(Integer fangshi) {
        this.fangshi = fangshi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Goods goods = (Goods) o;

        return id.equals(goods.id);

    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", numberid='" + numberid + '\'' +
                ", kehu='" + kehu + '\'' +
                ", xiaoshoudate='" + xiaoshoudate + '\'' +
                ", xiaoshoumoney=" + xiaoshoumoney +
                ", dengjistatus=" + dengjistatus +
                ", status=" + status +
                ", paymoney=" + paymoney +
                ", paydate='" + paydate + '\'' +
                ", arrivaldate='" + arrivaldate + '\'' +
                ", salesmae=" + salesmae +
                ", fangshi=" + fangshi +
                ", remark='" + remark + '\'' +
                '}';
    }
}
