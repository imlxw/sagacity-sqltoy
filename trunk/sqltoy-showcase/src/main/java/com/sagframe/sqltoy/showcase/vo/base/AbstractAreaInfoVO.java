/**
 *@Generated by sagacity-quickvo 4.13
 */
package com.sagframe.sqltoy.showcase.vo.base;

import java.io.Serializable;
import org.sagacity.sqltoy.config.annotation.Entity;
import org.sagacity.sqltoy.config.annotation.Id;
import org.sagacity.sqltoy.config.annotation.Column;
import java.math.BigDecimal;


/**
 * @project sqltoy-showcase
 * @version 1.0.0
 * Table: sqltoy_area_info,Remark:地区代码表   
 */
@Entity(tableName="sqltoy_area_info",pk_constraint="PRIMARY")
public abstract class AbstractAreaInfoVO implements Serializable,
	java.lang.Cloneable {
	 /*--------------- properties string,handier to copy ---------------------*/
	 //full properties 
	 //areaCode,areaName,areaTel,areaPid,englishName,initial,countryCode,cityCode,cityName,provinceCode,provinceName,fullName,longitude,latitude,nodeRoute,nodeLevel,isLeaf,showIndex,status
	 
	 //not null properties
	 //areaCode,areaName,areaPid,nodeRoute,nodeLevel,isLeaf,showIndex,status

	/**
	 * 
	 */
	private static final long serialVersionUID = 7523352356304446941L;
	
	/**
	 * 地区代码
	 */
	@Id(strategy="generator",generator="org.sagacity.sqltoy.plugins.id.DefaultIdGenerator")
	@Column(name="AREA_CODE",length=10L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String areaCode;
	
	/**
	 * 地区名称
	 */
	@Column(name="AREA_NAME",length=30L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String areaName;
	
	/**
	 * 区号
	 */
	@Column(name="AREA_TEL",length=10L,type=java.sql.Types.VARCHAR,nullable=true)
	protected String areaTel;
	
	/**
	 * 父地区代码
	 */
	@Column(name="AREA_PID",length=10L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String areaPid;
	
	/**
	 * 英文简称
	 */
	@Column(name="ENGLISH_NAME",length=100L,type=java.sql.Types.VARCHAR,nullable=true)
	protected String englishName;
	
	/**
	 * 首字母
	 */
	@Column(name="INITIAL",length=1L,type=java.sql.Types.CHAR,nullable=true)
	protected String initial;
	
	/**
	 * 国家代码
	 */
	@Column(name="COUNTRY_CODE",length=10L,type=java.sql.Types.VARCHAR,nullable=true)
	protected String countryCode;
	
	/**
	 * 所在城市
	 */
	@Column(name="CITY_CODE",length=10L,type=java.sql.Types.VARCHAR,nullable=true)
	protected String cityCode;
	
	/**
	 * 城市名称
	 */
	@Column(name="CITY_NAME",length=30L,type=java.sql.Types.VARCHAR,nullable=true)
	protected String cityName;
	
	/**
	 * 所在省份
	 */
	@Column(name="PROVINCE_CODE",length=10L,type=java.sql.Types.VARCHAR,nullable=true)
	protected String provinceCode;
	
	/**
	 * 省份名称
	 */
	@Column(name="PROVINCE_NAME",length=30L,type=java.sql.Types.VARCHAR,nullable=true)
	protected String provinceName;
	
	/**
	 * 完整名称
	 */
	@Column(name="FULL_NAME",length=100L,type=java.sql.Types.VARCHAR,nullable=true)
	protected String fullName;
	
	/**
	 * 经度
	 */
	@Column(name="LONGITUDE",length=10L,type=java.sql.Types.DECIMAL,nullable=true)
	protected BigDecimal longitude;
	
	/**
	 * 维度
	 */
	@Column(name="LATITUDE",length=10L,type=java.sql.Types.DECIMAL,nullable=true)
	protected BigDecimal latitude;
	
	/**
	 * 节点路径
	 */
	@Column(name="NODE_ROUTE",length=200L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String nodeRoute;
	
	/**
	 * 节点等级
	 */
	@Column(name="NODE_LEVEL",length=1L,type=java.sql.Types.INTEGER,nullable=false)
	protected Integer nodeLevel;
	
	/**
	 * 是否叶子节点
	 */
	@Column(name="IS_LEAF",length=1L,type=java.sql.Types.INTEGER,nullable=false)
	protected Integer isLeaf;
	
	/**
	 * 显示顺序
	 */
	@Column(name="SHOW_INDEX",length=8L,defaultValue="1",type=java.sql.Types.INTEGER,nullable=false)
	protected Integer showIndex;
	
	/**
	 * 状态
	 */
	@Column(name="STATUS",length=1L,defaultValue="1",type=java.sql.Types.INTEGER,nullable=false)
	protected Integer status;
	


	/** default constructor */
	public AbstractAreaInfoVO() {
	}
	
	/** pk constructor */
	public AbstractAreaInfoVO(String areaCode)
	{
		this.areaCode=areaCode;
	}

	/** minimal constructor */
	public AbstractAreaInfoVO(String areaCode,String areaName,String areaPid,String nodeRoute,Integer nodeLevel,Integer isLeaf,Integer showIndex,Integer status)
	{
		this.areaCode=areaCode;
		this.areaName=areaName;
		this.areaPid=areaPid;
		this.nodeRoute=nodeRoute;
		this.nodeLevel=nodeLevel;
		this.isLeaf=isLeaf;
		this.showIndex=showIndex;
		this.status=status;
	}

	/** full constructor */
	public AbstractAreaInfoVO(String areaCode,String areaName,String areaTel,String areaPid,String englishName,String initial,String countryCode,String cityCode,String cityName,String provinceCode,String provinceName,String fullName,BigDecimal longitude,BigDecimal latitude,String nodeRoute,Integer nodeLevel,Integer isLeaf,Integer showIndex,Integer status)
	{
		this.areaCode=areaCode;
		this.areaName=areaName;
		this.areaTel=areaTel;
		this.areaPid=areaPid;
		this.englishName=englishName;
		this.initial=initial;
		this.countryCode=countryCode;
		this.cityCode=cityCode;
		this.cityName=cityName;
		this.provinceCode=provinceCode;
		this.provinceName=provinceName;
		this.fullName=fullName;
		this.longitude=longitude;
		this.latitude=latitude;
		this.nodeRoute=nodeRoute;
		this.nodeLevel=nodeLevel;
		this.isLeaf=isLeaf;
		this.showIndex=showIndex;
		this.status=status;
	}
	
	/**
	 *@param areaCode the areaCode to set
	 */
	public void setAreaCode(String areaCode) {
		this.areaCode=areaCode;
	}
		
	/**
	 *@return the AreaCode
	 */
	public String getAreaCode() {
	    return this.areaCode;
	}
	
	/**
	 *@param areaName the areaName to set
	 */
	public void setAreaName(String areaName) {
		this.areaName=areaName;
	}
		
	/**
	 *@return the AreaName
	 */
	public String getAreaName() {
	    return this.areaName;
	}
	
	/**
	 *@param areaTel the areaTel to set
	 */
	public void setAreaTel(String areaTel) {
		this.areaTel=areaTel;
	}
		
	/**
	 *@return the AreaTel
	 */
	public String getAreaTel() {
	    return this.areaTel;
	}
	
	/**
	 *@param areaPid the areaPid to set
	 */
	public void setAreaPid(String areaPid) {
		this.areaPid=areaPid;
	}
		
	/**
	 *@return the AreaPid
	 */
	public String getAreaPid() {
	    return this.areaPid;
	}
	
	/**
	 *@param englishName the englishName to set
	 */
	public void setEnglishName(String englishName) {
		this.englishName=englishName;
	}
		
	/**
	 *@return the EnglishName
	 */
	public String getEnglishName() {
	    return this.englishName;
	}
	
	/**
	 *@param initial the initial to set
	 */
	public void setInitial(String initial) {
		this.initial=initial;
	}
		
	/**
	 *@return the Initial
	 */
	public String getInitial() {
	    return this.initial;
	}
	
	/**
	 *@param countryCode the countryCode to set
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode=countryCode;
	}
		
	/**
	 *@return the CountryCode
	 */
	public String getCountryCode() {
	    return this.countryCode;
	}
	
	/**
	 *@param cityCode the cityCode to set
	 */
	public void setCityCode(String cityCode) {
		this.cityCode=cityCode;
	}
		
	/**
	 *@return the CityCode
	 */
	public String getCityCode() {
	    return this.cityCode;
	}
	
	/**
	 *@param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName=cityName;
	}
		
	/**
	 *@return the CityName
	 */
	public String getCityName() {
	    return this.cityName;
	}
	
	/**
	 *@param provinceCode the provinceCode to set
	 */
	public void setProvinceCode(String provinceCode) {
		this.provinceCode=provinceCode;
	}
		
	/**
	 *@return the ProvinceCode
	 */
	public String getProvinceCode() {
	    return this.provinceCode;
	}
	
	/**
	 *@param provinceName the provinceName to set
	 */
	public void setProvinceName(String provinceName) {
		this.provinceName=provinceName;
	}
		
	/**
	 *@return the ProvinceName
	 */
	public String getProvinceName() {
	    return this.provinceName;
	}
	
	/**
	 *@param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName=fullName;
	}
		
	/**
	 *@return the FullName
	 */
	public String getFullName() {
	    return this.fullName;
	}
	
	/**
	 *@param longitude the longitude to set
	 */
	public void setLongitude(BigDecimal longitude) {
		this.longitude=longitude;
	}
		
	/**
	 *@return the Longitude
	 */
	public BigDecimal getLongitude() {
	    return this.longitude;
	}
	
	/**
	 *@param latitude the latitude to set
	 */
	public void setLatitude(BigDecimal latitude) {
		this.latitude=latitude;
	}
		
	/**
	 *@return the Latitude
	 */
	public BigDecimal getLatitude() {
	    return this.latitude;
	}
	
	/**
	 *@param nodeRoute the nodeRoute to set
	 */
	public void setNodeRoute(String nodeRoute) {
		this.nodeRoute=nodeRoute;
	}
		
	/**
	 *@return the NodeRoute
	 */
	public String getNodeRoute() {
	    return this.nodeRoute;
	}
	
	/**
	 *@param nodeLevel the nodeLevel to set
	 */
	public void setNodeLevel(Integer nodeLevel) {
		this.nodeLevel=nodeLevel;
	}
		
	/**
	 *@return the NodeLevel
	 */
	public Integer getNodeLevel() {
	    return this.nodeLevel;
	}
	
	/**
	 *@param isLeaf the isLeaf to set
	 */
	public void setIsLeaf(Integer isLeaf) {
		this.isLeaf=isLeaf;
	}
		
	/**
	 *@return the IsLeaf
	 */
	public Integer getIsLeaf() {
	    return this.isLeaf;
	}
	
	/**
	 *@param showIndex the showIndex to set
	 */
	public void setShowIndex(Integer showIndex) {
		this.showIndex=showIndex;
	}
		
	/**
	 *@return the ShowIndex
	 */
	public Integer getShowIndex() {
	    return this.showIndex;
	}
	
	/**
	 *@param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status=status;
	}
		
	/**
	 *@return the Status
	 */
	public Integer getStatus() {
	    return this.status;
	}



	/**
     * @todo vo columns to String
     */
    @Override
	public String toString() {
		StringBuilder columnsBuffer=new StringBuilder();
		columnsBuffer.append("areaCode=").append(getAreaCode()).append("\n");
		columnsBuffer.append("areaName=").append(getAreaName()).append("\n");
		columnsBuffer.append("areaTel=").append(getAreaTel()).append("\n");
		columnsBuffer.append("areaPid=").append(getAreaPid()).append("\n");
		columnsBuffer.append("englishName=").append(getEnglishName()).append("\n");
		columnsBuffer.append("initial=").append(getInitial()).append("\n");
		columnsBuffer.append("countryCode=").append(getCountryCode()).append("\n");
		columnsBuffer.append("cityCode=").append(getCityCode()).append("\n");
		columnsBuffer.append("cityName=").append(getCityName()).append("\n");
		columnsBuffer.append("provinceCode=").append(getProvinceCode()).append("\n");
		columnsBuffer.append("provinceName=").append(getProvinceName()).append("\n");
		columnsBuffer.append("fullName=").append(getFullName()).append("\n");
		columnsBuffer.append("longitude=").append(getLongitude()).append("\n");
		columnsBuffer.append("latitude=").append(getLatitude()).append("\n");
		columnsBuffer.append("nodeRoute=").append(getNodeRoute()).append("\n");
		columnsBuffer.append("nodeLevel=").append(getNodeLevel()).append("\n");
		columnsBuffer.append("isLeaf=").append(getIsLeaf()).append("\n");
		columnsBuffer.append("showIndex=").append(getShowIndex()).append("\n");
		columnsBuffer.append("status=").append(getStatus()).append("\n");
		return columnsBuffer.toString();
	}
}
