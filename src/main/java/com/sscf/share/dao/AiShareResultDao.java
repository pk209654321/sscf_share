package com.sscf.share.dao;

import java.util.List;
import java.util.Map;

import com.sscf.share.dto.AiShareResultDto;
import com.sscf.share.entity.AiShareResult;


public interface AiShareResultDao {
	public List<AiShareResult> selectAiShareResultList(AiShareResultDto dto);
	
	public int selectAiShareResultCount(AiShareResultDto dto);
}
