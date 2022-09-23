import request from '@/utils/request'

// 查询员工列表
export function listEmp(query) {
  return request({
    url: '/system/emp/list',
    method: 'get',
    params: query
  })
}

// 查询员工详细
export function getEmp(eId) {
  return request({
    url: '/system/emp/' + eId,
    method: 'get'
  })
}

// 新增员工
export function addEmp(data) {
  return request({
    url: '/system/emp',
    method: 'post',
    data: data
  })
}

// 修改员工
export function updateEmp(data) {
  return request({
    url: '/system/emp',
    method: 'put',
    data: data
  })
}

// 删除员工
export function delEmp(eId) {
  return request({
    url: '/system/emp/' + eId,
    method: 'delete'
  })
}
