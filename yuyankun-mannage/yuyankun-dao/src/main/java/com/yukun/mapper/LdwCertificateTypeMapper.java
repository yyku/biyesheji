package com.yukun.mapper;

import com.yukun.pojo.LdwCertificateType;
import com.yukun.pojo.LdwCertificateTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LdwCertificateTypeMapper {
    int countByExample(LdwCertificateTypeExample example);

    int deleteByExample(LdwCertificateTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LdwCertificateType record);

    int insertSelective(LdwCertificateType record);

    List<LdwCertificateType> selectByExample(LdwCertificateTypeExample example);

    LdwCertificateType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LdwCertificateType record, @Param("example") LdwCertificateTypeExample example);

    int updateByExample(@Param("record") LdwCertificateType record, @Param("example") LdwCertificateTypeExample example);

    int updateByPrimaryKeySelective(LdwCertificateType record);

    int updateByPrimaryKey(LdwCertificateType record);
}