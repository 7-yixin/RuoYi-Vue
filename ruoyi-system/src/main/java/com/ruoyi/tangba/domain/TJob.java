package com.ruoyi.tangba.domain;

import java.util.List;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 职位对象 t_job
 * 
 * @author yixin
 * @date 2022-09-25
 */
public class TJob extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long jobId;

    /** 职位名称 */
    @Excel(name = "职位名称")
    private String job;

    /** 添加时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "添加时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date addTime;

    /** 添加人 */
    @Excel(name = "添加人")
    private Long addUserId;

    /** 修改人 */
    @Excel(name = "修改人")
    private Long updateUserId;

    /** 部门ID */
    @Excel(name = "部门ID")
    private Long deptId;

    /** 员工ID */
    @Excel(name = "员工ID")
    private Long eId;

    /** 员工信息 */
    private List<TEmp> tEmpList;

    public void setJobId(Long jobId) 
    {
        this.jobId = jobId;
    }

    public Long getJobId() 
    {
        return jobId;
    }
    public void setJob(String job) 
    {
        this.job = job;
    }

    public String getJob() 
    {
        return job;
    }
    public void setAddTime(Date addTime) 
    {
        this.addTime = addTime;
    }

    public Date getAddTime() 
    {
        return addTime;
    }
    public void setAddUserId(Long addUserId) 
    {
        this.addUserId = addUserId;
    }

    public Long getAddUserId() 
    {
        return addUserId;
    }
    public void setUpdateUserId(Long updateUserId) 
    {
        this.updateUserId = updateUserId;
    }

    public Long getUpdateUserId() 
    {
        return updateUserId;
    }
    public void setDeptId(Long deptId) 
    {
        this.deptId = deptId;
    }

    public Long getDeptId() 
    {
        return deptId;
    }
    public void seteId(Long eId) 
    {
        this.eId = eId;
    }

    public Long geteId() 
    {
        return eId;
    }

    public List<TEmp> getTEmpList()
    {
        return tEmpList;
    }

    public void setTEmpList(List<TEmp> tEmpList)
    {
        this.tEmpList = tEmpList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("jobId", getJobId())
            .append("job", getJob())
            .append("addTime", getAddTime())
            .append("updateTime", getUpdateTime())
            .append("addUserId", getAddUserId())
            .append("updateUserId", getUpdateUserId())
            .append("deptId", getDeptId())
            .append("eId", geteId())
            .append("tEmpList", getTEmpList())
            .toString();
    }
}
