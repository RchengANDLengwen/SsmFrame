package io.gitee.hchaojie.mapper;

import io.gitee.hchaojie.entity.Daily;
import org.apache.ibatis.annotations.Param;

import java.util.List;

// 封装了Daily表的 增删改查 方法
public interface DailyMapper {
    // 根据id查询Daily
    // select * from daily where id = xxx
    Daily findById(Long id);

    //  insert into daily (uid, digest, content, updated_by, views, stars, favorites, status)
    //        values(#{uid}, #{digest}, #{content}, #{updated_by},
    //        #{views}, #{stars}, #{favorites}, #{status});
    //  #{uid}  => daily.getUid()
    // #{updated_by}  => daily.getUpdated_by()
    void insert(Daily daily);

    // 根据日报摘要模糊查询
    // select * from daily where digest like '今天%'
    // findList("今天%", "created")

    // @Param  注解
    List<Daily> findList(@Param("digest") String digest, @Param("field") String sortField);

    void deleteById(Long id);

    // update daily set xx=xx, yy=yy where id = 1
    void update(Daily daily);

    // 根据创建时间和用户id查询日报
    // 创建时间 -》 daily.created
    // 用户id   -> daily.user.id
    // #{user.id}   -> daily.getUser().getId()
    List<Daily> findByCreatedAndUserId(Daily daily);

    // 查询日报总条数
    int count();

    // 拼条件查询。可能传过来的条件：summary, content, created
    // 如果只传一个条件，就按一个条件查询
    // 如果一个条件都没传，就查所有数据
    List<Daily> findByDaily(Daily daily);


    // 根据多个id号查询日报列表
    // List<Daily> findByIds(List<Long> ids);
    List<Daily> findByIds(Long[] ids);
}
