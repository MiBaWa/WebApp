package edu.fra.uas.v3autowired;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("pleaseWeld")
public class Welding implements Work {

    private static final Logger LOGGER = LoggerFactory.getLogger(Welding.class);

    @Override
    public void doWork() {
        LOGGER.info(" --> Welding Metal in the wall");
    }
}
