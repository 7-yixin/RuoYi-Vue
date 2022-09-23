import request from '@/utils/request'

// 获取表单
export function listStudyRole(query){
  return request({
    url: '/system/role/list',
    method: 'get',
    params: query
  })
}