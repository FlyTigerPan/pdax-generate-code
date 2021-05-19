package com.pdax;

import org.springframework.stereotype.Component;

/**
 * @author Fly Tiger
 * @date 2021/5/19 10:56
 */
@Component
public class Dictionary {
    /**
     * 字典类型code
     */
    private String dictTypeCode;

    /**
     * 字典类型名称
     */
    private String dictTypeText;

    /**
     * 字典code
     */
    private String dictCode;

    /**
     * 字典名称
     */
    private String dictText;

    /**
     * 备注
     */
    private String memo;

    /**
     * 排序
     */
    private Integer sortidx;

    /**
     * 是否删除
     */
    private Integer isDel;



    public String getDictTypeCode() {
        return dictTypeCode;
    }

    public void setDictTypeCode(String dictTypeCode) {
        this.dictTypeCode = dictTypeCode;
    }

    public String getDictTypeText() {
        return dictTypeText;
    }

    public void setDictTypeText(String dictTypeText) {
        this.dictTypeText = dictTypeText;
    }

    public String getDictCode() {
        return dictCode;
    }

    public void setDictCode(String dictCode) {
        this.dictCode = dictCode;
    }

    public String getDictText() {
        return dictText;
    }

    public void setDictText(String dictText) {
        this.dictText = dictText;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Integer getSortidx() {
        return sortidx;
    }

    public void setSortidx(Integer sortidx) {
        this.sortidx = sortidx;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
}
