package org.scu.db.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.scu.db.demo.model.Title;

import java.util.List;
import java.util.Map;

@Mapper
public interface TitleMapper {
    List<Title> query_title(List<String> bookName);
}
