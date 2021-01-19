package cn.kgc.service;

import cn.kgc.entity.Detail;

import java.util.List;

/**
 * (Detail)表服务接口
 *
 * @author makejava
 * @since 2021-01-15 15:03:14
 */
public interface DetailService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Detail queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Detail> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param detail 实例对象
     * @return 实例对象
     */
    Detail insert(Detail detail);

    /**
     * 修改数据
     *
     * @param detail 实例对象
     * @return 实例对象
     */
    Detail update(Detail detail);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    /**
     * 查询所有
     * @return
     */
    List<Detail> findAllDet(Detail detail);

    List<Detail> findAllByCategoryId(Integer categoryId);

    /**
     * 模糊查询
     * @param title
     * @return
     */
    List<Detail> findTitle(String title);

}