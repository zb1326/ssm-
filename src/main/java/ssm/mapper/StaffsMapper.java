package ssm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import ssm.model.Staffs;
import ssm.model.StaffsExample;

public interface StaffsMapper {
    long countByExample(StaffsExample example);

    int deleteByExample(StaffsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Staffs record);

    int insertSelective(Staffs record);

    List<Staffs> selectByExample(StaffsExample example);

    Staffs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Staffs record, @Param("example") StaffsExample example);

    int updateByExample(@Param("record") Staffs record, @Param("example") StaffsExample example);

    int updateByPrimaryKeySelective(Staffs record);

    int updateByPrimaryKey(Staffs record);
}