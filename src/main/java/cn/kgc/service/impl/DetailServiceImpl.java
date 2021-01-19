package cn.kgc.service.impl;

import cn.kgc.dao.DetailDao;
import cn.kgc.entity.Detail;
import cn.kgc.service.DetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Detail)表服务实现类
 *
 * @author makejava
 * @since 2021-01-15 15:03:14
 */
@Service("detailService")
public class DetailServiceImpl implements DetailService {
    @Resource
    private DetailDao detailDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Detail queryById(Integer id) {
        return this.detailDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Detail> queryAllByLimit(int offset, int limit) {
        return this.detailDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param detail 实例对象
     * @return 实例对象
     */
    @Override
    public Detail insert(Detail detail) {
        this.detailDao.insert(detail);
        return detail;
    }

    /**
     * 修改数据
     *
     * @param detail 实例对象
     * @return 实例对象
     */
    @Override
    public Detail update(Detail detail) {
        this.detailDao.update(detail);
        return this.queryById(detail.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.detailDao.deleteById(id) > 0;
    }

    @Override
    public List<Detail> findAllDet(Detail detail) {
        return this.detailDao.queryAll(detail);
    }

    @Override
    public List<Detail> findAllByCategoryId(Integer categoryId) {
        return this.detailDao.getAllByCategoryId(categoryId);
    }

    @Override
    public List<Detail> findTitle(String title) {
        return this.detailDao.getTitle(title);
    }
}