package com.hhit.common;

public class PageModel {
    //分页总数据条数
    private int recordCount;
    private int pageIndex;//当前页面
    private int pageSize=5;//每页显示数量为5

    private int totalSize;//总页数

    //判断当前页面是否超过了总页数，如果超过了将最后一页默认为当前页
    public int getRecordCount() {
        this.recordCount=this.recordCount<=0?1:this.recordCount;
        return recordCount;
    }

    public void setRecordCount(int recordCount) {

        this.recordCount = recordCount;
    }

    public int getPageIndex() {
        this.pageIndex=this.pageIndex<=0?1:this.pageIndex;
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        this.pageSize=this.pageSize<=5?5:this.pageSize;
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalSize() {
        if(this.getRecordCount()<=0){
            totalSize=0;//一条记录都没有一定是页数为0
        }else{//总记录数/每页数=页数
            totalSize=(this.getRecordCount()-1)/this.getPageSize()+1;
        }
        return totalSize;
    }
    //表示从数据库查询数据的时候的的开始数据。
    public int getFirstLimitParam(){
        return (this.getPageIndex()-1)*this.getPageSize();
    }
}
