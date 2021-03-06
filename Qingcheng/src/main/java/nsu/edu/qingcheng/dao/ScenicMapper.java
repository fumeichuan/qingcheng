package nsu.edu.qingcheng.dao;

import java.util.List;
import nsu.edu.qingcheng.bean.Scenic;
import nsu.edu.qingcheng.bean.ScenicExample;
import org.apache.ibatis.annotations.Param;

public interface ScenicMapper {
    long countByExample(ScenicExample example);

    int deleteByExample(ScenicExample example);

    int deleteByPrimaryKey(Integer scenicId);

    int insert(Scenic record);

    int insertSelective(Scenic record);

    List<Scenic> selectByExampleWithBLOBs(ScenicExample example);

    List<Scenic> selectByExample(ScenicExample example);

    Scenic selectByPrimaryKey(Integer scenicId);

    int updateByExampleSelective(@Param("record") Scenic record, @Param("example") ScenicExample example);

    int updateByExampleWithBLOBs(@Param("record") Scenic record, @Param("example") ScenicExample example);

    int updateByExample(@Param("record") Scenic record, @Param("example") ScenicExample example);

    int updateByPrimaryKeySelective(Scenic record);

    int updateByPrimaryKeyWithBLOBs(Scenic record);

    int updateByPrimaryKey(Scenic record);
}