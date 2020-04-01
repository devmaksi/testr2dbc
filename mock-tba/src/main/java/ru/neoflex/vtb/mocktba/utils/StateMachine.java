package ru.neoflex.vtb.mocktba.utils;

import ru.neoflex.vtb.mocktba.model.status.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StateMachine {

    private String apiKeyAuth;
    private OneOfIssueCardStatusItems cardStatusItems;
    private List<OneOfIssueCardStatusItems> sequenceState = new ArrayList<>();

    public int getCurrentStrep() {
        return currentStrep;
    }

    private int currentStrep = 0;
    private static Map<Integer,String> mapStepNameEvent = new HashMap<>();

    static {
        mapStepNameEvent.put(0, "StartEvent");
        mapStepNameEvent.put(1, "PickProductEvent");
        mapStepNameEvent.put(2, "GenerateSmsEvent");
        mapStepNameEvent.put(3, "ConfirmSmsEvent");
        mapStepNameEvent.put(4, "SetPinEvent");
    }

    public StateMachine(String apiKeyAuth){
        this.apiKeyAuth = apiKeyAuth;
        initStats();
        this.cardStatusItems = sequenceState.get(currentStrep);
    }

    public OneOfIssueCardStatusItems getStatus(){
        return cardStatusItems;
    }

    public OneOfIssueCardStatusItems changeAndGetStatus(){
        currentStrep ++;
        cardStatusItems = sequenceState.get(currentStrep);
        return cardStatusItems;
    }

    private void initStats(){
        WaitingProductStatus waitingProductStatus = new WaitingProductStatus();
        waitingProductStatus.setName(WaitingProductStatus.NameEnum.WAITINGPARAMSSTATUS);
        sequenceState.add(waitingProductStatus);
        WaitingGenerateSmsStatus waitingGenerateSmsStatus = new WaitingGenerateSmsStatus();
        waitingGenerateSmsStatus.setName(WaitingGenerateSmsStatus.NameEnum.WAITINGGENERATESMSSTATUS);
        waitingGenerateSmsStatus.setDocs(DocArrayUtils.getListDoc());
        sequenceState.add(waitingGenerateSmsStatus);
        WaitingSmsConfirmationStatus waitingSmsConfirmationStatus = new WaitingSmsConfirmationStatus();
        waitingSmsConfirmationStatus.setName(WaitingSmsConfirmationStatus.NameEnum.WAITINGSMSCONFIRMATIONSTATUS);
        sequenceState.add(waitingSmsConfirmationStatus);
        WaitingPinStatus waitingPinStatus = new WaitingPinStatus();
        waitingPinStatus.setName(WaitingPinStatus.NameEnum.WAITINGPINSTATUS);
        waitingPinStatus.setRsaPubKey(apiKeyAuth + "RSAPUBKEY");
        sequenceState.add(waitingPinStatus);
        CardActivatedStatus cardActivatedStatus = new CardActivatedStatus();
        cardActivatedStatus.setName(CardActivatedStatus.NameEnum.CARDACTIVATEDSTATUS);
        sequenceState.add(cardActivatedStatus);
    }

    public String getApiKeyAuth() {
        return apiKeyAuth;
    }

    public boolean validStep(String eventName){
        String expectedEvent = mapStepNameEvent.get(currentStrep + 1);
        if(expectedEvent.equals(eventName) || expectedEvent.equals("StartEvent")){
            return true;
        }else{
            return false;
        }
    }


}
