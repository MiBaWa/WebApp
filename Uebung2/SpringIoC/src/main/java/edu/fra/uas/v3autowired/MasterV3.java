package edu.fra.uas.v3autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MasterV3 {
    @Autowired
    Journeyman journeyman1;
    Journeyman journeyman2;

    public void delegateWork() {
        journeyman1.performWork();
        journeyman2.performWork();
    }
}
