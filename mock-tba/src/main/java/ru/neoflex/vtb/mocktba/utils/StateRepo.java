package ru.neoflex.vtb.mocktba.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class StateRepo {

    static Logger logger = LoggerFactory.getLogger(StateRepo.class);

    public static Map<String,StateMachine> mapState = new HashMap<>();

    public static StateMachine getOldStateMachineOrNew(String apiKayAuth){
        StateMachine stateMachine ;
        if(mapState.containsKey(apiKayAuth)){
            logger.info("oldStateMachine {}",apiKayAuth);
            stateMachine = mapState.get(apiKayAuth);
        }else {
            logger.info("newStateMachine {}", apiKayAuth);
            stateMachine = new StateMachine(apiKayAuth);
            mapState.put(apiKayAuth, stateMachine);
        }
        return stateMachine;
    }

    public static StateMachine getStateMachine(String apiKeyAuth){
        return mapState.get(apiKeyAuth);
    }
}
