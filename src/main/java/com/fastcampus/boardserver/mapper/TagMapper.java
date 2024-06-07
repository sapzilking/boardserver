package com.fastcampus.boardserver.mapper;

import com.fastcampus.boardserver.dto.PostDTO;
import com.fastcampus.boardserver.dto.TagDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TagMapper {
    public int register(TagDTO tagDTO);
    public void updateTags(TagDTO tagDTO);
    public void deletePostTag(int tagId);
    public void createPostTag(Integer tagId, Integer postId);
}
