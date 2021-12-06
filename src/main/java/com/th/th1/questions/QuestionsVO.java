package com.th.th1.questions;

import java.sql.Timestamp;
import java.util.List;

import lombok.Data;
@Data
public class QuestionsVO {

	private Integer quests_num;
	private String quests_id;
	private String quests_nickname;
	private String quests_title;
	private String quests_contents;
	private Integer hits;
	private Timestamp regDate;
	private String thumbnail;
	
	private List<HashtagVO> tags;	
	
}
