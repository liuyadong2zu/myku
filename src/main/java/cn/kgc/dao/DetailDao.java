package cn.kgc.dao;

import cn.kgc.entity.Detail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Detail)表数据库访问层
 *
 * @author makejava
 * @since 2021-01-15 15:03:14
 */
public interface DetailDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Detail queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Detail> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param detail 实例对象
     * @return 对象列表
     */
    List<Detail> queryAll(Detail detail);

    /**
     * 新增数据
     *
     * @param detail 实例对象
     * @return 影响行数
     */
    int insert(Detail detail);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Detail> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Detail> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Detail> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Detail> entities);

    /**
     * 修改数据
     *
     * @param detail 实例对象
     * @return 影响行数
     */
    int update(Detail detail);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);


    List<Detail> getAllByCategoryId(Integer categoryId);

    List<Detail> getTitle(String title);

}