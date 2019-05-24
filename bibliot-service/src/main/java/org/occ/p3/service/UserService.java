package org.occ.p3.service;

import java.util.List;

import org.occ.p3.model.Borrow;
import org.occ.p3.model.Member;
import org.occ.p3.model.User;

public interface UserService {


    public Member isValidUser(String username, String password);



    public List<Borrow> findBorrowListByMember (Member member);
}
