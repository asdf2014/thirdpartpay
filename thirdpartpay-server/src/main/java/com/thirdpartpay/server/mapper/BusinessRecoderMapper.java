package com.thirdpartpay.server.mapper;

import com.thirdpartpay.common.model.BusinessRecoder;
import com.thirdpartpay.common.model.BusinessRecoderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BusinessRecoderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_recoder
     *
     * @mbggenerated
     */
    int countByExample(BusinessRecoderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_recoder
     *
     * @mbggenerated
     */
    int deleteByExample(BusinessRecoderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_recoder
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer businessId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_recoder
     *
     * @mbggenerated
     */
    int insert(BusinessRecoder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_recoder
     *
     * @mbggenerated
     */
    int insertSelective(BusinessRecoder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_recoder
     *
     * @mbggenerated
     */
    List<BusinessRecoder> selectByExample(BusinessRecoderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_recoder
     *
     * @mbggenerated
     */
    BusinessRecoder selectByPrimaryKey(Integer businessId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_recoder
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") BusinessRecoder record, @Param("example") BusinessRecoderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_recoder
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") BusinessRecoder record, @Param("example") BusinessRecoderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_recoder
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BusinessRecoder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_recoder
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(BusinessRecoder record);
}