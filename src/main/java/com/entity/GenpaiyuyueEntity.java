package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 跟拍预约
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-23 22:30:24
 */
@TableName("genpaiyuyue")
public class GenpaiyuyueEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GenpaiyuyueEntity() {
		
	}
	
	public GenpaiyuyueEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 套餐名称
	 */
					
	private String taocanmingcheng;
	
	/**
	 * 类别
	 */
					
	private String leibie;
	
	/**
	 * 拍摄地点
	 */
					
	private String paishedidian;
	
	/**
	 * 套餐价格
	 */
					
	private String taocanjiage;
	
	/**
	 * 个人账号
	 */
					
	private String gerenzhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 手机号码
	 */
					
	private String shoujihaoma;
	
	/**
	 * 预约日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date yuyueriqi;
	
	/**
	 * 预约备注
	 */
					
	private String yuyuebeizhu;
	
	/**
	 * 下单时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date xiadanshijian;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：套餐名称
	 */
	public void setTaocanmingcheng(String taocanmingcheng) {
		this.taocanmingcheng = taocanmingcheng;
	}
	/**
	 * 获取：套餐名称
	 */
	public String getTaocanmingcheng() {
		return taocanmingcheng;
	}
	/**
	 * 设置：类别
	 */
	public void setLeibie(String leibie) {
		this.leibie = leibie;
	}
	/**
	 * 获取：类别
	 */
	public String getLeibie() {
		return leibie;
	}
	/**
	 * 设置：拍摄地点
	 */
	public void setPaishedidian(String paishedidian) {
		this.paishedidian = paishedidian;
	}
	/**
	 * 获取：拍摄地点
	 */
	public String getPaishedidian() {
		return paishedidian;
	}
	/**
	 * 设置：套餐价格
	 */
	public void setTaocanjiage(String taocanjiage) {
		this.taocanjiage = taocanjiage;
	}
	/**
	 * 获取：套餐价格
	 */
	public String getTaocanjiage() {
		return taocanjiage;
	}
	/**
	 * 设置：个人账号
	 */
	public void setGerenzhanghao(String gerenzhanghao) {
		this.gerenzhanghao = gerenzhanghao;
	}
	/**
	 * 获取：个人账号
	 */
	public String getGerenzhanghao() {
		return gerenzhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：手机号码
	 */
	public void setShoujihaoma(String shoujihaoma) {
		this.shoujihaoma = shoujihaoma;
	}
	/**
	 * 获取：手机号码
	 */
	public String getShoujihaoma() {
		return shoujihaoma;
	}
	/**
	 * 设置：预约日期
	 */
	public void setYuyueriqi(Date yuyueriqi) {
		this.yuyueriqi = yuyueriqi;
	}
	/**
	 * 获取：预约日期
	 */
	public Date getYuyueriqi() {
		return yuyueriqi;
	}
	/**
	 * 设置：预约备注
	 */
	public void setYuyuebeizhu(String yuyuebeizhu) {
		this.yuyuebeizhu = yuyuebeizhu;
	}
	/**
	 * 获取：预约备注
	 */
	public String getYuyuebeizhu() {
		return yuyuebeizhu;
	}
	/**
	 * 设置：下单时间
	 */
	public void setXiadanshijian(Date xiadanshijian) {
		this.xiadanshijian = xiadanshijian;
	}
	/**
	 * 获取：下单时间
	 */
	public Date getXiadanshijian() {
		return xiadanshijian;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}
