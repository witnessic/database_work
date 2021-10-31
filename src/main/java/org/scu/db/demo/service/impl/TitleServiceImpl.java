package org.scu.db.demo.service.impl;

import org.scu.db.demo.mapper.TitleMapper;
import org.scu.db.demo.model.Title;
import org.scu.db.demo.service.TitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

@Service
public class TitleServiceImpl implements TitleService {
    @Autowired
    private TitleMapper titleMapper;
    public List<Title> findIliadOrOdysseyTitle(){
        List<String> name = new ArrayList<String>(){{
            add("Iliad");
            add("Odyssey");
        }};
        return titleMapper.query_title(name);
    }



}