package com.yond.gulimall.member.dao;

import com.yond.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author yond
 * @email yondddd412@gmail.com
 * @date 2022-08-11 00:01:34
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
