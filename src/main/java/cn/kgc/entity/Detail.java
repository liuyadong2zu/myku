package cn.kgc.entity;

import com.sun.org.apache.xml.internal.resolver.Catalog;

import java.io.Serializable;
import java.util.Date;

/**
 * (Detail)实体类
 *
 * @author makejava
 * @since 2021-01-15 15:03:13
 */
public class Detail implements Serializable {
    private static final long serialVersionUID = -68366108559660228L;

    private Integer id;

    private Integer categoryid;

    private String title;

    private String summary;

    private String author;

    private String createdate;

    private String updatedate;
    //一对一
   private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public String getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(String updatedate) {
        this.updatedate = updatedate;
    }

}