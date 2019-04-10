package com.yang.pattern.template.jdbc;

import com.yang.pattern.template.jdbc.dao.MemberDao;

import java.util.List;

public class MemberDaoTest {
    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao(null);
        List<?> list = memberDao.selectAll();
        System.out.println(list);
    }
}
