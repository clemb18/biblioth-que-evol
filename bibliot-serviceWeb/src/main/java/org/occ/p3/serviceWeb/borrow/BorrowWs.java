package org.occ.p3.serviceWeb.borrow;
import javax.annotation.PostConstruct;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.occ.p3.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

@Service
@WebService(serviceName = "borrowWeb",name = "borrowWs")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL)

public class BorrowWs {

    @Autowired
    BorrowService borrowService;

    @WebMethod
    public Boolean borrowBook(Integer workId,Integer membreId){
        return borrowService.borrowBook(workId, membreId);

    }
    @WebMethod
    public Boolean extendBorrow(Integer borrowId){
        return borrowService.extendBorrow(borrowId);

    }
    @WebMethod
    public Boolean terminateBorrow(Integer borrowId, Integer membreId){
        return borrowService.terminateBorrow(borrowId, membreId);

    }

    @PostConstruct
    public void init() {
        SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
    }

}

