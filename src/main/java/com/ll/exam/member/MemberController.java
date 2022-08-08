package com.ll.exam.member;

import com.ll.exam.Rq;

public class MemberController {

    public void showLogin(Rq rq) {
        rq.appendBody("로그인");
    }
}
