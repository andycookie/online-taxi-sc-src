package com.online.taxi.mapper;

import com.online.taxi.entity.DriverRate;

public interface DriverRateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_driver_rate
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_driver_rate
     *
     * @mbggenerated
     */
    int insert(DriverRate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_driver_rate
     *
     * @mbggenerated
     */
    int insertSelective(DriverRate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_driver_rate
     *
     * @mbggenerated
     */
    DriverRate selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_driver_rate
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(DriverRate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_driver_rate
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(DriverRate record);
}