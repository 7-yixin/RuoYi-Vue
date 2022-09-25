package com.ruoyi.tangba.mapper;

import java.util.List;
import com.ruoyi.tangba.domain.TEmp;

/**
 * 员工Mapper接口
 * 
 * @author yixin
 * @date 2022-09-25
 */
public interface TEmpMapper 
{
    /**
     * 查询员工
     * 
     * @param eId 员工主键
     * @return 员工
     */
    public TEmp selectTEmpByEId(Long eId);

    /**
     * 查询员工列表
     * 
     * @param tEmp 员工
     * @return 员工集合
     */
    public List<TEmp> selectTEmpList(TEmp tEmp);

    /**
     * 新增员工
     * 
     * @param tEmp 员工
     * @return 结果
     */
    public int insertTEmp(TEmp tEmp);

    /**
     * 修改员工
     * 
     * @param tEmp 员工
     * @return 结果
     */
    public int updateTEmp(TEmp tEmp);

    /**
     * 删除员工
     * 
     * @param eId 员工主键
     * @return 结果
     */
    public int deleteTEmpByEId(Long eId);

    /**
     * 批量删除员工
     * 
     * @param eIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTEmpByEIds(Long[] eIds);

	public int updateTEmpStatus(TEmp tEmp);
}
