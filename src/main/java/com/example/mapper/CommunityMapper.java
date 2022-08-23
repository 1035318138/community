package com.example.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.entity.Community;
import com.example.entity.PageInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * @author ：mac
 * @Date ：2022/8/22 10:05
 */
@Mapper
public interface CommunityMapper extends BaseMapper<Community> {

    @Select("SELECT\n" +
            "\tc.community_name ,\n" +
            "\tc.community_address ,\n" +
            "\t(SELECT max(age) FROM t_user  WHERE t_user.community_id = c.id ) max_age,\n"+
            "\tcount( u.id ) user_count,(\n" +
            "\tSELECT\n" +
            "\t\tcount( 1 ) \n" +
            "\tFROM\n" +
            "\t\tt_user \n" +
            "\tWHERE\n" +
            "\t\tt_user.community_id = c.id \n" +
            "\t\tAND t_user.sex = '男' \n" +
            "\t\t) as sex_man_num,(\n" +
            "\tSELECT\n" +
            "\t\tcount( 1 ) \n" +
            "\tFROM\n" +
            "\t\tt_user \n" +
            "\tWHERE\n" +
            "\t\tt_user.community_id = c.id \n" +
            "\t\tAND t_user.sex = '女' \n" +
            "\t) as sex_men_num,\n" +
            "\tROUND( AVG( u.age ), 1 ) age_avg \n" +
            "FROM\n" +
            "\tt_community c\n" +
            "\tINNER JOIN t_user u ON c.id = u.community_id \n" +
            "WHERE\n" +
            "\tc.community_address LIKE concat('%',#{c.data.communityName},'%') \n" +
            "GROUP BY\n" +
            "\tc.id \n" +
            "HAVING\n" +
            "\tage_avg BETWEEN 15 \n" +
            "\tAND 30 \n" +
            "\tLIMIT #{c.current},\n" +
            "\t#{c.size}")
    List<Community> getList(@Param(value = "c") PageInfo<Community> community);

    @Select("SELECT\n" +
            "\tc.community_name ,\n" +
            "\tc.community_address ,\n" +
            "\t(SELECT max(age) FROM t_user  WHERE t_user.community_id = c.id ) max_age,\n"+
            "\tcount( u.id ) user_count,(\n" +
            "\tSELECT\n" +
            "\t\tcount( 1 ) \n" +
            "\tFROM\n" +
            "\t\tt_user \n" +
            "\tWHERE\n" +
            "\t\tt_user.community_id = c.id \n" +
            "\t\tAND t_user.sex = '男' \n" +
            "\t\t) as sex_man_num,(\n" +
            "\tSELECT\n" +
            "\t\tcount( 1 ) \n" +
            "\tFROM\n" +
            "\t\tt_user \n" +
            "\tWHERE\n" +
            "\t\tt_user.community_id = c.id \n" +
            "\t\tAND t_user.sex = '女' \n" +
            "\t) as sex_men_num,\n" +
            "\tROUND( AVG( u.age ), 1 ) age_avg \n" +
            "FROM\n" +
            "\tt_community c\n" +
            "\tINNER JOIN t_user u ON c.id = u.community_id \n" +
            "WHERE\n" +
            "\tc.community_address LIKE concat('%',#{c.data.communityName},'%') \n" +
            "GROUP BY\n" +
            "\tc.id \n" +
            "HAVING\n" +
            "\tage_avg BETWEEN 22 \n" +
            "\tAND 40 \n")
    List<Community>  getListCount(@Param(value = "c") PageInfo<Community> community);

}
