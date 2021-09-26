package com.abhishek63.github.spring28minuteslevel1.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class PersonDAO {

    @Autowired
    JdbcConncetion jdbcConncetion;

    public JdbcConncetion getJdbcConncetion() {
        return jdbcConncetion;
    }

    public void setJdbcConncetion(JdbcConncetion jdbcConncetion) {
        this.jdbcConncetion = jdbcConncetion;
    }
}
